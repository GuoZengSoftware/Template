package top.zywork.common.mail;

import org.apache.commons.lang3.StringUtils;
import top.zywork.common.ConfigUtils;
import top.zywork.common.ExceptionUtils;
import top.zywork.constant.MailConstants;
import top.zywork.enums.ContentTypeEnum;

import javax.mail.*;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMessage.RecipientType;
import java.util.Properties;

/**
 * 邮件发送器类<br />
 * 创建于2017-09-14
 *
 * @author 王振宇
 * @version 1.0
 */
public class MailSender {

	/**
	 * 根据邮件配置信息及邮件对象发送邮件
	 * @param mailConfigPath 邮件配置信息，以classpath:/开头或/WEB-INF开头
	 * @param mail Mail邮件对象
	 */
	public void sendMail(String mailConfigPath, Mail mail) {
		ConfigUtils configUtils = new ConfigUtils();
		Properties props = configUtils.build(mailConfigPath);
		Session session = Session.getInstance(props,
				new MailAuthenticator(configUtils.getString(MailConstants.USERNAME),
						configUtils.getString(MailConstants.PASSWORD)));
		mail.setFrom(new MailAccount(configUtils.getString(MailConstants.USERNAME)));
		try {
			Transport transport = session.getTransport();
			transport.connect();
			Message msg = buildMessage(session, mail);
			transport.sendMessage(msg, msg.getAllRecipients());
		} catch (NoSuchProviderException e) {
			throw ExceptionUtils.appException(e);
		} catch (MessagingException e) {
			throw ExceptionUtils.appException(e);
		}
	}

	/**
	 * 由Mail邮件对象创建发送邮件需要的Message对象
	 * @param session 邮件会话对象
	 * @param mail Mail邮件对象
	 * @return Message 邮件消息对象
	 * @throws MessagingException 消息异常
	 */
	private Message buildMessage(Session session, Mail mail) throws MessagingException {
		Message msg = new MimeMessage(session);
		msg.setFrom(MailAddressUtils.toAddress(mail.getFrom()));
		msg.setSubject(mail.getSubject());
		if (StringUtils.isNotEmpty(mail.getContent())) {
			msg.setContent(mail.getContent(),
					StringUtils.isEmpty(mail.getType()) ? ContentTypeEnum.HTML.getValue() : mail.getType());
		} else {
			msg.setContent(mail.getMultipart());
		}
		msg.setRecipients(RecipientType.TO, MailAddressUtils.toAddressArray(mail.getRecipients()));
		if (mail.getCcRecipients() != null) {
			msg.setRecipients(RecipientType.CC, MailAddressUtils.toAddressArray(mail.getCcRecipients()));
		}
		if (mail.getBccRecipients() != null) {
			msg.setRecipients(RecipientType.BCC, MailAddressUtils.toAddressArray(mail.getBccRecipients()));
		}
		return msg;
	}

}



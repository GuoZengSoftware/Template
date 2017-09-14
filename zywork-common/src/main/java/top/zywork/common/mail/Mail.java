package top.zywork.common.mail;

import javax.mail.Multipart;
import java.util.List;

/**
 * 邮件对象类，封装邮件属性，如发送者，接收者，主题，内容，类型等<br />
 * 创建于2017-09-14
 *
 * @author 王振宇
 * @version 1.0
 */
public class Mail {
	
	private MailAccount from;
	private List<MailAccount> recipients;
	private List<MailAccount> ccRecipients;
	private List<MailAccount> bccRecipients;
	private String subject;
	private String content;
	private String type;
	private Multipart multipart;

	public MailAccount getFrom() {
		return from;
	}

	public void setFrom(MailAccount from) {
		this.from = from;
	}

	public List<MailAccount> getRecipients() {
		return recipients;
	}

	public void setRecipients(List<MailAccount> recipients) {
		this.recipients = recipients;
	}

	public List<MailAccount> getCcRecipients() {
		return ccRecipients;
	}

	public void setCcRecipients(List<MailAccount> ccRecipients) {
		this.ccRecipients = ccRecipients;
	}

	public List<MailAccount> getBccRecipients() {
		return bccRecipients;
	}

	public void setBccRecipients(List<MailAccount> bccRecipients) {
		this.bccRecipients = bccRecipients;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Multipart getMultipart() {
		return multipart;
	}

	public void setMultipart(Multipart multipart) {
		this.multipart = multipart;
	}
}

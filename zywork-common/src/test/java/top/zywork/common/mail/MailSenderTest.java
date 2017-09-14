package top.zywork.common.mail;

import org.junit.Test;

import javax.activation.DataHandler;
import javax.activation.FileDataSource;
import javax.mail.BodyPart;
import javax.mail.MessagingException;
import javax.mail.Multipart;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMultipart;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 * 邮件发送器测试类<br />
 * 创建于2017-09-14
 *
 * @author 王振宇
 */
public class MailSenderTest {

    @Test
    public void testSendMail() throws MessagingException {
        MailSender mailSender = new MailSender();
        Mail mail = new Mail();
        mail.setSubject("subject");
        List<MailAccount> mailAccountList = new ArrayList<>();
        mailAccountList.add(new MailAccount("wgssmarter@126.com"));
        mailAccountList.add(new MailAccount("847315251@qq.com"));
        mail.setRecipients(mailAccountList);
        Multipart multipart = new MimeMultipart();
        BodyPart part1 = new MimeBodyPart();
        part1.setContent("您已注册成功，请点击以下链接完成激活：<a href=' http://115.28.37.189?email=abc@126.com&code=" + UUID.randomUUID().toString() + "'>激活你的账号</a>", "text/html;charset=utf-8");
        multipart.addBodyPart(part1);
        BodyPart part2 = new MimeBodyPart();
        DataHandler dataHandler = new DataHandler(new FileDataSource(new File("src/360wallpaper.jpg")));
        part2.setDataHandler(dataHandler);
        multipart.addBodyPart(part2);
        BodyPart part3 = new MimeBodyPart();
        DataHandler dataHanler1 = new DataHandler(new FileDataSource(new File("src/JavaMail.txt")));
        part3.setDataHandler(dataHanler1);
        multipart.addBodyPart(part3);
        mail.setMultipart(multipart);
        mailSender.sendMail("classpath:/config/mail.properties", mail);
    }
}

package email;

import org.apache.velocity.app.VelocityEngine;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.FileSystemResource;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.ui.velocity.VelocityEngineUtils;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;
import java.util.HashMap;
import java.util.Map;

/**
 * Email 服务类
 * <p>
 * <p>
 * Created by liuchenwei on 2016/4/12.
 */
public class EmailService {

    // 邮件模板使用
    private VelocityEngine velocityEngine;

    private JavaMailSender mailSender;

    private String from;

    /**
     * 发送普通的文本邮件
     *
     * @param to      目标地址
     * @param message 正文信息
     */
    public void sendMail(String to, String message) {
        // 使用 SimpleMailMessage 消息对象发送邮件信息
        SimpleMailMessage smm = new SimpleMailMessage();

        smm.setFrom(from);// 发件人
        smm.setTo(to);// 收件人
        smm.setSubject("New letter from Spring");// 主题
        smm.setText("Hello! " + message);// 正文

        mailSender.send(smm);// 发送邮件
    }

    /**
     * 发送带附件的文本邮件
     *
     * @param to       目标地址
     * @param message  正文信息
     * @param filePath 附件全路径
     * @throws MessagingException
     */
    public void sendMailWithAttachment(String to, String message, String filePath) throws MessagingException {
        // 为了发送附件，需要创建一个 MIME 的信息
        MimeMessage mimeMessage = mailSender.createMimeMessage();
        // 通过 Spring 的 MimeMessageHelper 可以辅助设置信息，从而屏蔽掉 MimeMessage 笨重的 API。
        // 第二个参数 true 表明这个信息是 multipart 类型。
        MimeMessageHelper mimeMessageHelper = new MimeMessageHelper(mimeMessage, true);

        mimeMessageHelper.setFrom(from);// 发件人
        mimeMessageHelper.setTo(to);// 收件人
        mimeMessageHelper.setSubject("New letter with attachment from Spring");// 主题
        mimeMessageHelper.setText("Hello! " + message);// 正文

        // 使用 Spring 的 FileSystemResource 来加载附件，作为资源传递给 addAttachment 方法
        FileSystemResource resource = new FileSystemResource(filePath);
        // 第一个参数是要添加到邮件中附件的名称，第二个参数是附件资源。
        mimeMessageHelper.addAttachment(resource.getFilename(), resource);

        mailSender.send(mimeMessage);// 发送邮件
    }

    /**
     * 发送富文本邮件
     *
     * @param to      目标地址
     * @param message 正文信息
     * @throws MessagingException
     */
    public void sendMailRichText(String to, String message) throws MessagingException {
        MimeMessage mimeMessage = mailSender.createMimeMessage();
        MimeMessageHelper mimeMessageHelper = new MimeMessageHelper(mimeMessage, true);

        mimeMessageHelper.setFrom(from);// 发件人
        mimeMessageHelper.setTo(to);// 收件人
        mimeMessageHelper.setSubject("New rich text letter from Spring");// 主题
        // 将 HTML 字符串传给 setText 方法，并将第二个参数设为 true 即可发送富文本
        // 本例 HTML 中包含了一个 <img> 标签用来在邮件中展现图片，
        // src 属性可以设置为标准的 http: URL，以便从 Web 中获取图片。
        // 但在这里是将图片嵌入在了邮件之中，值 cid:logo 表明信息中会有一部分是图片并以 logo 作为标识。
        mimeMessageHelper.setText("<html><body><h4>Hello " + to + "</h4><p>"
                + message + "<p><img src='cid:logo'></body></html>", true);// 正文

        // 使用 Spring 的 FileSystemResource 来加载附件，作为资源传递给 addAttachment 方法
        ClassPathResource resource = new ClassPathResource("images/wa2.jpg");
        // 添加内联图片，第一个参数与表明内联图片的标识符（即logo）相同，第二个参数是图片资源。
        mimeMessageHelper.addInline("logo", resource);

        mailSender.send(mimeMessage);// 发送邮件
    }

    /**
     * 创建邮件模板（使用 Velocity）发送邮件
     *
     * @param to      目标地址
     * @param message 正文信息
     */
    public void sendMailByTemplate(String to, String message) throws MessagingException {
        MimeMessage mimeMessage = mailSender.createMimeMessage();
        MimeMessageHelper mimeMessageHelper = new MimeMessageHelper(mimeMessage, true);

        mimeMessageHelper.setFrom(from);// 发件人
        mimeMessageHelper.setTo(to);// 收件人
        mimeMessageHelper.setSubject("New vm letter from Spring");// 主题

        // VelocityEngineUtils 可以简化将 Velocity 模板与数据合并成 String 的工作
        Map<String, Object> model = new HashMap<>();
        model.put("username", to);
        model.put("message", message);

        String emailText = VelocityEngineUtils.mergeTemplateIntoString(velocityEngine,
                "templates/email.vm", "utf-8", model);

        mimeMessageHelper.setText(emailText, true);// 正文

        ClassPathResource resource = new ClassPathResource("images/wa2.jpg");
        mimeMessageHelper.addInline("logo", resource);

        mailSender.send(mimeMessage);// 发送邮件
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public void setMailSender(JavaMailSender mailSender) {
        this.mailSender = mailSender;
    }

    public void setVelocityEngine(VelocityEngine velocityEngine) {
        this.velocityEngine = velocityEngine;
    }
}

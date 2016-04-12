/**
 * 
 */
package email;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.mail.MessagingException;

public class App {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("email/email.xml");

		EmailService emailService = (EmailService) context.getBean("emailService");
//		emailService.sendMail("4830247@qq.com", "Nice to meet you");

//		try {
//			emailService.sendMailWithAttachment("4830247@qq.com", "This is your image", "C:/Users/lcw/Pictures/WA2.jpg");
//		} catch (MessagingException e) {
//			e.printStackTrace();
//		}
//
//		try {
//			emailService.sendMailRichText("4830247@qq.com", "This is your image");
//		} catch (MessagingException e) {
//			e.printStackTrace();
//		}

		try {
			emailService.sendMailByTemplate("liuchenwei2000@163.com", "【This is your image】");
		} catch (MessagingException e) {
			e.printStackTrace();
		}
	}
}

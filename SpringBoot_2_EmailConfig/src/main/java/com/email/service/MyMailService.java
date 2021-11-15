package com.email.service;


import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Component;

@Component
public class MyMailService {
	@Autowired
	private JavaMailSender sender;
	
	public boolean send(
			String to,
			String []bcc,
			String []cc,
			String subject,
			String text
			//Resource file
			) {
		
		boolean sent=false;
		try {
		//1 Create one message(Mime Message)
		MimeMessage message=sender.createMimeMessage();
		
		//2. Use helper class to set data to Mime message
		
		
			MimeMessageHelper helper =new MimeMessageHelper(message);
			
			helper.setTo(to);
			if(cc!=null && cc.length>0);
			helper.setCc(cc);
			if(bcc!=null&& bcc.length>0)
			helper.setBcc(bcc);
			/*if(file!=null) {
				//file name,data
				helper.addAttachment(file.getFilename(), file);
		}*/
			helper.setSubject(subject);
			helper.setText(text);
				sender.send(message);
				sent=true;
			
			
		} catch (MessagingException e) {
		
			//e.printStackTrace();
			sent=false;
		}
		
		
		return sent;
		
	}

}

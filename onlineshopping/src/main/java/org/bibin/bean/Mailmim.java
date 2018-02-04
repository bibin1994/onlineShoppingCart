package org.bibin.bean;

import java.util.Random;

import org.springframework.mail.MailSender;  
import org.springframework.mail.SimpleMailMessage;  

public class Mailmim {

    private MailSender mailSender;  
    
    public void setMailSender(MailSender mailSender) {  
        this.mailSender = mailSender;  
    }
    
    public String sendMail(String to) {  
        //creating message 
    	String msg=random();
    	try {
        SimpleMailMessage message = new SimpleMailMessage();  
        message.setFrom("bibinmsr@gmail.com");  
        message.setTo(to);  
        message.setSubject("Password Reset");  
        message.setText(msg);  
        //sending message  
        mailSender.send(message); 
    	}
    	catch (Exception e) {
			e.printStackTrace();
		}
    	return msg;
    } 
    
    public String random()
    {
    	
    	String number="0123456789";
    	Random random=new Random();
    	char ch[]=new char[4];
    	
    	for(int i=0;i<4;i++)
    	{
    		ch[i]=number.charAt(random.nextInt(number.length()));
    	}
    	
    	return ch.toString();
    }
    
}

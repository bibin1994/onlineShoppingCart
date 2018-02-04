package org.bibin.bean;

import java.util.Properties;
import java.util.Random;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class JavaMail {
	final String from="bibinmsr@gmail.com";
	final String password="$Mary@1994$";
	final String subject ="Password Reset Otp ";
	String message;
	
	public String sendMail(String to)
	{
		Properties props = new Properties();    
        props.put("mail.smtp.host", "smtp.gmail.com");    
        props.put("mail.smtp.socketFactory.port", "465");    
        props.put("mail.smtp.socketFactory.class",    
                  "javax.net.ssl.SSLSocketFactory");    
        props.put("mail.smtp.auth", "true");    
        props.put("mail.smtp.port", "465"); 
        

        Session session = Session.getDefaultInstance(props,    
         new javax.mail.Authenticator() {    
         protected PasswordAuthentication getPasswordAuthentication() {    
         return new PasswordAuthentication(from,password);  
         }    
        });    
        //compose message    
        try {    
         MimeMessage msg = new MimeMessage(session);    
         msg.addRecipient(Message.RecipientType.TO,new InternetAddress(to));  
         message=random();
         msg.setSubject(subject);    
         msg.setText(message);    
         //send message  
         Transport.send(msg);   
             
        } catch (MessagingException e) {throw new RuntimeException(e);} 
        
        return message;
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

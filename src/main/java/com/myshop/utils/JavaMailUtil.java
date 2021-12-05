/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.myshop.utils;

import java.util.Properties;
import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.Message.RecipientType;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class JavaMailUtil {
    public static void sendMail(String recepient, String template, String subject)
      throws MessagingException {
    Properties properties = new Properties();

    properties.put("mail.smtp.auth", "true");
    properties.put("mail.smtp.starttls.enable", "true");
    properties.put("mail.smtp.host", "smtp.gmail.com");
    properties.put("mail.smtp.port", "587");

    String myAccountEmail = "huytinh296@gmail.com";
    String password = "hoanghuy2962001";
    Session session = Session.getInstance(properties, new Authenticator() {
        
      @Override
      protected PasswordAuthentication getPasswordAuthentication() {
        return new PasswordAuthentication(myAccountEmail, password);
      }
    });

    Message message = prepareMessage(session, myAccountEmail, recepient, template, subject);

    Transport.send(message);
    System.out.println("Message sent successfully");
  }

  private static Message prepareMessage(Session session, String myAccountEmail, String recepient,
      String template, String subject) {
    Message message = new MimeMessage(session);
    try {

      message.setFrom(new InternetAddress(myAccountEmail));
      message.setRecipient(RecipientType.TO, new InternetAddress(recepient));
      message.setSubject(subject);
      message.setContent(template,
          "text/html");
      return message;
    } catch (MessagingException e) {
      e.printStackTrace();
    }
    return null;
  }
}

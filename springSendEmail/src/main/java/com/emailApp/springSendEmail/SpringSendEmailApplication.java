package com.emailApp.springSendEmail;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;

@SpringBootApplication
public class SpringSendEmailApplication {
	@Autowired
	private emailSenderService senderService;

	public static void main(String[] args) {

		SpringApplication.run(SpringSendEmailApplication.class, args);
	}
 @EventListener(ApplicationReadyEvent.class)
	public void sendMail(){
		senderService.sendEmail("ishitarishi0909@gmail.com", "This is subject", "This is body");


 }
}

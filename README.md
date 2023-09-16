# Spring Email Sender

## Introduction
#### The Spring Email Sender is a simple email-sending application built using Spring Boot and Java Mail Sender Dependency. This project allows you to easily configure a Spring Boot application to send emails using Gmail's SMTP server. Whether you want to send notifications, alerts, or any other type of email from your Spring Boot application, this project provides a straightforward way to do so.

## Features
- Email Sending: Send emails from your Spring Boot application.
- Gmail SMTP Configuration: Easily configure Gmail's SMTP server for sending emails.
- Customization: Customize email content, recipients, and other parameters as needed.

## Configuration
To configure the Gmail SMTP settings, open the ```application.properties``` file and update the following properties:
```
spring.mail.host=smtp.gmail.com
spring.mail.port=587
spring.mail.username=your-email@gmail.com
spring.mail.password=your-email-password
spring.mail.properties.mail.smtp.auth=true
spring.mail.properties.mail.smtp.starttls.enable=true
```
Replace 'your-email@gmail.com' with your Gmail email address and 'your-email-password' with your Gmail password.

#### Happy emailing with Spring Email Sender!

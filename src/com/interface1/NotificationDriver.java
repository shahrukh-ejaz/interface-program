package com.interface1;

public class NotificationDriver {
	public static void main(String[] args) {
		
		EmailNotification email = new EmailNotification();
		email.sendNotification();
		
		SMSNotification sms = new SMSNotification();
		sms.sendNotification();
	}
}

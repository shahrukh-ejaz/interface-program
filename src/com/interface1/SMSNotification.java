package com.interface1;

public class SMSNotification  implements Notification{
	
	@Override
	public void sendNotification() {
		System.out.println("Sending notification through SMS");
	}

}

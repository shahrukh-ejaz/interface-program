package com.interface1;

public class EmailNotification implements Notification {

	@Override
    public void sendNotification() {
        System.out.println("Sending notification through Email");
    }
}
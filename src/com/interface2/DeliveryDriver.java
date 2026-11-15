package com.interface2;

public class DeliveryDriver {
	
	public static void main(String[] args) {
		
		
		DeliveryService service;
		
		
		service = new BikeDelivery();
		
		service.deliverOrder();
		
		service = new DroneDelivery();
		
		service.deliverOrder();
		
	}

}

package com.interface2;

public class BikeDelivery  implements DeliveryService{
	
	@Override
	public void deliverOrder() {
		System.out.println("Order delivered by bike");
		
	}

}

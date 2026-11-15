package com.interface2;

public class DroneDelivery  implements DeliveryService{
	
	@Override
	public void deliverOrder() {
		System.out.println("Order delivered by Drone");
	}

}

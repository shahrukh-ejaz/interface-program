package com.interface5;

public class CourierDriver {
	public static void main(String[] args) {
		
		ExpressCourier courier = new ExpressCourier();
		
		courier.calculateDeliveryCost(3);
		courier.showDeliveryTime();
		
		System.out.println("Charge: "+ CourierPolicy.DELIVERY_CHARGE);
	}

}

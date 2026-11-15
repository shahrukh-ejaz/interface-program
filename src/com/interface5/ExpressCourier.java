package com.interface5;

public class ExpressCourier  implements CourierPolicy{
	
	@Override
	public void calculateDeliveryCost(double weight) {
		
		double total = weight * DELIVERY_CHARGE;
		
		System.out.println("Delivery Cost: "+ total);
	}
	
	@Override
	public void showDeliveryTime() {
		System.out.println("Delivery within" + MAX_DELIVERY_DAYS + "days");
	}

}

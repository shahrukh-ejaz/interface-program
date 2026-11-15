package com.interface5;

public interface CourierPolicy {
	double DELIVERY_CHARGE = 50.0;
	int MAX_DELIVERY_DAYS = 5;
	
	void calculateDeliveryCost(double weight);
	
	void showDeliveryTime();

}

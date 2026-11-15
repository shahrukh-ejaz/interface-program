package com.interface3;

public class SmartOffice  implements LightControl, TemperatureMonitor{
	
	@Override
	public void switchLights() {
		System.out.println("Office lights switched ON");
		
	}
	
	@Override
	public void checkTemperature() {
		System.out.println("Room temperature: 24 celsius");
	}
	
		
	

}

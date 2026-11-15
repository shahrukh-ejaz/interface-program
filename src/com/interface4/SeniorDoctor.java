package com.interface4;

public class SeniorDoctor implements DoctorResponsibilities {
	
	@Override
	public void examinePatient() {
		System.out.println("Patient examined");
	}
	
	@Override
	public void prepareMedicalReport() {
		System.out.println("Medical report prepared");
	}
	
	@Override
	public void prescribeMedicine() {
		System.out.println("Medicine presecribed");
	}

}

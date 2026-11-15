package com.interface4;

public class HospitalDriver {
	public static void main(String[] args) {
		
		SeniorDoctor doctor = new SeniorDoctor();
		
		doctor.examinePatient();
		doctor.prepareMedicalReport();
		doctor.prescribeMedicine();
	}

}

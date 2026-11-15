package com.markerinterface1;

public class DocumentDriver {
	public static void main(String[] args) {
		
		AadhaarDocument document = new AadhaarDocument();
		
		if(document instanceof VerifiedDocument) {
			System.out.println("Verified document accepted");
		}else {
			System.out.println("Document not verified");
		}
	}

}

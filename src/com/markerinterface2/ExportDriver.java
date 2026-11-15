package com.markerinterface2;

public class ExportDriver {
	public static void main(String[] args) {
		
		Employee employee = new Employee();
		Visitor visitor = new Visitor();
		
		 exportData(employee);
	        exportData(visitor);
		
	}
	
	static void exportData(Object obj) {
		if(obj instanceof Exportable) {
			System.out.println("Exporting employee data");
			
		}else {
			System.out.println("Export not allowed");
		}
	}

}

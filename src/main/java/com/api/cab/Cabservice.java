package com.api.cab;

public class Cabservice {
	
public double invoiceGenerator(double distance, int time) {
		
		double totalFare = distance*10 + time;
		return totalFare;

   }
}

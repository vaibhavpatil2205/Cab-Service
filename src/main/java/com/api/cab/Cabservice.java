package com.api.cab;

public class Cabservice {
	
public double invoiceGenerator(double distance, int time) {
		double totalFare = 0.0;
		if(distance < 5.0 && time <= 10) {
			totalFare = 50.0;
			
		} else{ 
		
		    totalFare = distance*10 + time;
		}
		return totalFare;
	}
 }


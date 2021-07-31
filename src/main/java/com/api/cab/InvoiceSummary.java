package com.api.cab;
import java.util.List;

public class InvoiceSummary {
	
	

	

		public double avgFarePerRide;
	    public int totalNoOfRides;
	    public double totalFare;

	    public InvoiceSummary(int totalNoOfRides, double totalFare) {
	        this.totalNoOfRides = totalNoOfRides;
	        this.totalFare = totalFare;
	        this.avgFarePerRide = this.totalFare/this.totalNoOfRides;
	    }

	    @Override
	    public boolean equals(Object o) {
	        if (this == o) return true;
	        if (o == null || getClass() != o.getClass()) return false;
	        InvoiceSummary summary = (InvoiceSummary) o;
	        return Double.compare(summary.avgFarePerRide, avgFarePerRide) == 0 &&
	                totalNoOfRides == summary.totalNoOfRides &&
	                Double.compare(summary.totalFare, totalFare) == 0;
	    }

	}




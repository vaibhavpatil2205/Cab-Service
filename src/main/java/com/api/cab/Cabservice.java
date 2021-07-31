package com.api.cab;

import java.util.List;

public class Cabservice {
    private static final double COST_PER_KM = 10 ;
    private static final int COST_PER_MIN =1 ;
    private static int  MIN_FARE= 5;

    public double invoiceGenerator(double distance, int time) {
        double totalFare = 0.0;
        totalFare = distance * COST_PER_KM + time * COST_PER_MIN;
        if( totalFare < MIN_FARE){
            totalFare=5;
        }
        return totalFare ;
    }

    public InvoiceSummary invoiceGenerator(List<Ride> rides) {
        double totalFare=0;
        for (Ride ride : rides){
            totalFare += this.invoiceGenerator(ride.distance,ride.time);
            }
//       double totalFare =(double) rides.stream().map(this :: invoiceGenerator);
        return new InvoiceSummary(rides.size(), totalFare);
    }
}

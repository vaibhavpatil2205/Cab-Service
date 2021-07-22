package com.api.cab;

import static org.junit.Assert.*;

import org.junit.Test;

public class CabServiceTest {

	@Test
	public void testInvoiceGeneratorShouldReturnTotalFare() {
		
		Cabservice cabservice = new Cabservice();
		double distance = 10;
		int time = 15;
		double totalFare = cabservice.invoiceGenerator(distance, time);
		assertEquals(115.0, totalFare, 0.0);
		
		}
	
	 @Test
	 public void testInvoiceGeneratorShouldReturnDefaultFare() {
		 
		 Cabservice cabservice = new Cabservice();
		 double distance = 4;
		 int time = 10;
		 double totalFare = cabservice.invoiceGenerator(distance, time);
		 assertEquals(50.0, totalFare, 0.0);
	 }

}

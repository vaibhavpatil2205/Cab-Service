package com.api.cab;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

public class CabServiceTest {
	private static Cabservice cabService;

	@Before
	public void setup() {
		cabService = new Cabservice();
	}

	@Test
	public void givenDistanceAndTimeShouldReturnTotalFare() {
		double distance = 10;
		int time = 15;
		double totalFare = cabService.invoiceGenerator(distance, time);
		Assert.assertEquals(115.0, totalFare, 0.0);

	}

	@Test
	public void givenDistanceAndTimeShouldReturnDefaultFare() {
		double distance = 0.2;
		int time = 3;
		double totalFare = cabService.invoiceGenerator(distance, time);
		Assert.assertEquals(5, totalFare, 0.0);

	}


	@Test
	public void givenMultipleRidesShouldReturnInvoiceSummary() {
		Ride ride1 = new Ride(10.0, 5);
		Ride ride2 = new Ride(20.0, 5);
		List<Ride> rides = Arrays.asList(ride1, ride2);
		InvoiceSummary summary = cabService.invoiceGenerator(rides);
		InvoiceSummary expected = new InvoiceSummary(2, 310.0);
		Assert.assertEquals(expected, summary);
	}
}
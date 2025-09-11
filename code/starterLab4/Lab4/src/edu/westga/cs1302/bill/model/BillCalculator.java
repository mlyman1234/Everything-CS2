package edu.westga.cs1302.bill.model;

public class BillCalculator {

	
	
	public static double subtotalCalculator(Bill bill) {
		int subtotal = 0;
		for (BillItem item : bill.getItems()) {
			subtotal += item.getAmount();
		}
		return subtotal;
	}
}

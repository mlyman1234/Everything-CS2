package edu.westga.cs1302.bill.model;

public class BillCalculator {

	
	
	public static double subtotalCalculator(Bill bill) {
		double subtotal = 0;
		for (BillItem item : bill.getItems()) {
			subtotal += item.getAmount();
		}
		return subtotal;
	}
	
	public static double taxCalculator(Bill bill) {
		double tax = 0;
		tax = BillCalculator.subtotalCalculator(bill) * Bill.TAX_RATE;
		return tax;
	}
	
	public static double tipCalculator(Bill bill) {
		double tax = 0;
		tax = BillCalculator.subtotalCalculator(bill) * Bill.TIP_RATE;
		return tax;
	}
	
}

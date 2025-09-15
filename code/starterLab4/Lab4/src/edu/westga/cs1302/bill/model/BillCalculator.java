package edu.westga.cs1302.bill.model;

public class BillCalculator {

	/** Returns the subtotal of every item in the bill array.
	 * 
	 * @precondition cannot contain null values
	 * @postcondition none
	 * 
	 * @param bill the bill to be viewed
	 * 
	 * @return a double that is the sum of all of the items in the bill array
	 */
	public static double subtotalCalculator(BillItem[] items) {
		for(BillItem item : items) {
			if (item == null) {
				throw new IllegalArgumentException();
			}
		}
		
		double subtotal = 0;
		for (BillItem item : items) {
			subtotal += item.getAmount();
		}
		return subtotal;
	}
	
	/** Returns the tax of the bill array.
	 * 
	 * @precondition cannot contain null values
	 * @postcondition none
	 * 
	 * @param bill the bill to be viewed
	 * 
	 * @return a double that is the subtotal multiplied by the tax rate
	 */
	public static double taxCalculator(BillItem[] items) {
		for(BillItem item : items) {
			if (item == null) {
				throw new IllegalArgumentException();
			}
		}
		
		double tax = 0;
		tax = BillCalculator.subtotalCalculator(items) * Bill.TAX_RATE;
		return tax;
	}
	
	/** Returns the tip of the bill array.
	 * 
	 * @precondition cannot contain null values
	 * @postcondition none
	 * 
	 * @param bill the bill to be viewed
	 * 
	 * @return a double that is the subtotal multiplied by the tip rate
	 */
	public static double tipCalculator(BillItem[] items) {
		for(BillItem item : items) {
			if (item == null) {
				throw new IllegalArgumentException();
			}
		}
		
		double tax = 0;
		tax = BillCalculator.subtotalCalculator(items) * Bill.TIP_RATE;
		return tax;
	}
	
	/** Returns the total of the bill array.
	 * 
	 * @precondition cannot contain null values
	 * @postcondition none
	 * 
	 * @param bill the bill to be viewed
	 * 
	 * @return a double that is the subtotal, tax and tip added together
	 */
	public static double totalCalculator(BillItem[] items) {
		for(BillItem item : items) {
			if (item == null) {
				throw new IllegalArgumentException();
			}
		}
		
		double total = 0;
		total = BillCalculator.subtotalCalculator(items) + BillCalculator.taxCalculator(items) + BillCalculator.tipCalculator(items);
		return total;
	}
}

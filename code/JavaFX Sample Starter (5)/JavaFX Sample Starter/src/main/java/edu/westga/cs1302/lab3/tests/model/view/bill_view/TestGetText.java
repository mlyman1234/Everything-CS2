package edu.westga.cs1302.lab3.tests.model.view.bill_view;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

import edu.westga.cs1302.lab2.model.Bill;
import edu.westga.cs1302.lab2.model.BillItem;
import edu.westga.cs1302.lab2.view.BillView;

/** Tests the generated text from BillView class
 * 
 * @author CS 1302
 * @version Fall 2025
 */
public class TestGetText {
	
	/** Tests when there is only one item in the bill while getting text
	 * 
	 * @precondition none
	 * @postcondition none
	 * 
	 */
	@Test
	public void testWhenThereIsOnlyOneItemInBill() {
	BillView generator = new BillView();
	Bill bill = new Bill();
	BillItem item = new BillItem("Batteries", 5);
	bill.addItem(item);
	var result = generator.getText(bill);
	var expected = "ITEMS" + System.lineSeparator() +  "Batteries - 5.0" + System.lineSeparator() + System.lineSeparator() 
			+ "SUBTOTAL - $5.0" + System.lineSeparator() + "TAX - $0.5" + System.lineSeparator() 
			+ "TIP - $1.0" + System.lineSeparator() + "TOTAL - $6.5";
	assertEquals(result, expected);
	
	}
	
	/** Tests when there are many items in the bill while getting text
	 * 
	 * @precondition none
	 * @postcondition none
	 * 
	 */
	@Test
	public void testWhenThereIsMulitipleItemsInBill() {
	BillView generator = new BillView();
	Bill bill = new Bill();
	BillItem item = new BillItem("Batteries", 5);
	BillItem item2 = new BillItem("Doritos", 7);
	BillItem item3 = new BillItem("Toaster", 14);
	bill.addItem(item);
	bill.addItem(item2);
	bill.addItem(item3);
	var result = generator.getText(bill);
	var expected = "ITEMS" + System.lineSeparator() 
			+  "Batteries - 5.0" + System.lineSeparator() 
			+  "Doritos - 7.0" + System.lineSeparator() 
			+  "Toaster - 14.0" + System.lineSeparator() + System.lineSeparator()  
			+ "SUBTOTAL - $26.0" + System.lineSeparator() 
			+ "TAX - $2.6" + System.lineSeparator()  
			+ "TIP - $5.2" + System.lineSeparator() 
			+ "TOTAL - $33.8";
	assertEquals(result, expected);
	
	}
}
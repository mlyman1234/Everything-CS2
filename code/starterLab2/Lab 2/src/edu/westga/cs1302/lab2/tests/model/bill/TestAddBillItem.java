package edu.westga.cs1302.lab2.tests.model.bill;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import edu.westga.cs1302.lab2.model.Bill;
import edu.westga.cs1302.lab2.model.BillItem;

/** Tests Add Bill Item Method
 * 
 * @author CS 1302
 * @version Fall 2025
 */
public class TestAddBillItem {

	/** Tests if adding a null item to a bill returns IAE
	 * 
	 * @precondition none
	 * @postcondition none
	 * 
	 */
	@Test
	public void testWhenNull() {
		Bill bill1 = new Bill();
		assertThrows(IllegalArgumentException.class, () -> {
			bill1.addItem(null);
		});
	}
	
}
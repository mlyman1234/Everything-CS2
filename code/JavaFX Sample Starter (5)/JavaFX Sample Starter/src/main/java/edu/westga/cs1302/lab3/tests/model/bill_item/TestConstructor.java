package edu.westga.cs1302.lab3.tests.model.bill_item;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

import edu.westga.cs1302.lab2.model.BillItem;

/** Test Bill Item Constructor
 * 
 * @author CS 1302
 * @version Fall 2025
 */
public class TestConstructor {
	
	/** Tests if creating Bill Item with null as a name returns IAE
	 * 
	 * @precondition none
	 * @postcondition none
	 * 
	 */
	@Test
	public void testWhenNameIsNull() {
		assertThrows(IllegalArgumentException.class, () -> {
			new BillItem(null, 1);
		});
	}
	
	/** Tests if adding an amount that is one below boundary returns IAE
	 * 
	 * @precondition none
	 * @postcondition none
	 * 
	 */
	@Test
	public void testWhenAmountIsOneBelowBoundary() {
		assertThrows(IllegalArgumentException.class, () -> {
			new BillItem("crackers", -1);
		});
	}
	
	/** Tests if adding an amount that is at boundary returns IAE
	 * 
	 * @precondition none
	 * @postcondition none
	 * 
	 */
	@Test
	public void testWhenAmountIsAtBoundary() {
		assertThrows(IllegalArgumentException.class, () -> {
			new BillItem("crackers", 0);
		});
	}
	
	/** Tests if adding an amount that is one above boundary creates Bill Item
	 * 
	 * @precondition none
	 * @postcondition none
	 * 
	 */
	@Test
	public void testWhenAmountIsOneAboveBoundary() {
		BillItem item = new BillItem("crackers", 1);
		var name = item.getName();
		var amount = item.getAmount();
		assertEquals(name, "crackers");
		assertEquals(amount, 1, 0.0001);
	}
	
}
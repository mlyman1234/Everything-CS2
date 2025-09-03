package edu.westga.cs1302.lab2.tests.model.bill;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import edu.westga.cs1302.lab2.model.Bill;
import edu.westga.cs1302.lab2.model.BillItem;

public class TestAddBillItem {

	@Test
	public void testWhenNull() {
		Bill bill1 = new Bill();
		assertThrows(IllegalArgumentException.class, () -> {
			bill1.addItem(null);
		});
	}
	
}
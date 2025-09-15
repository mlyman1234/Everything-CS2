package edu.westga.cs1302.bill.test.model.Bill_Calculator;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import edu.westga.cs1302.bill.model.Bill;
import edu.westga.cs1302.bill.model.BillCalculator;
import edu.westga.cs1302.bill.model.BillItem;
import edu.westga.cs1302.bill.view.BillView;


public class TestTipCalculator {

	@Test
	void testTipCalcualtor() {
		Bill bill = new Bill();
		BillItem item1 = new BillItem("orange", 1);
		BillItem item2 = new BillItem("apple", 3);
		bill.addItem(item1);
		bill.addItem(item2);
		BillItem[] items = bill.getItems().toArray(new BillItem[bill.getItems().size()]);		
		var result = BillCalculator.tipCalculator(items);
		var expected = 0.8;
		assertEquals(expected, result);
	}
	
	@Test
	void testIfNullValuesAreFound() {
		Bill bill = new Bill();
		BillItem item1 = new BillItem("orange", 1);
		BillItem item2 = new BillItem("apple", 3);
		bill.addItem(item1);
		bill.addItem(item2);
		BillItem[] items = bill.getItems().toArray(new BillItem[bill.getItems().size()]);	
		items[0] = null;
		assertThrows(IllegalArgumentException.class, () -> {
			BillCalculator.tipCalculator(items);
		});
	}
}

package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import edu.westga.cs1302.lab1.model.Bill;
import edu.westga.cs1302.lab1.model.BillItem;
import view.BillTextGenerator;

public class TestBillTextGenerator {
	
	@Test
	public void TestTextGeneratorWithTwoBillItems() {
		Bill billy = new Bill();
		BillItem battery = new BillItem("Battery", 10);
		BillItem steak = new BillItem("Steak", 5);
		billy.addItem(battery);
		billy.addItem(steak);
		BillTextGenerator gen = new BillTextGenerator();
		gen.addItem(billy);
		var actual = gen.getText();
		var valid = "ITEMS" + System.lineSeparator() + "Battery - 10.0" + System.lineSeparator() + "Steak - 5.0" + System.lineSeparator() + System.lineSeparator() + "SUBTOTAL - $15.0" + System.lineSeparator() + "TAX - $1.5" + System.lineSeparator() + "TIP - $3.0" + System.lineSeparator() + "TOTAL - $19.5";
		assertEquals(actual, valid);
		
	}
}

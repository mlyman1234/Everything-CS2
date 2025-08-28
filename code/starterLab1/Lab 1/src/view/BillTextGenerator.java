package view;

import java.util.ArrayList;

import edu.westga.cs1302.lab1.model.Bill;

/** Generates text based on what's inside the bill
 *
 * @author CS 1302
 * @version Fall 2025
 */
public class BillTextGenerator {
	private ArrayList<Bill> items;

	/** Create a new empty Bill Text Generator
	 *
	 * @precondition none
	 * @postcondition none
	 *
	 */
	public BillTextGenerator() {
		this.items = new ArrayList<>();
	}

	/** Return a String containing the list of bill items and total for the bill.
	 *
	 * @precondition none
	 * @postcondition none
	 *
	 * @return a String containing the list of bill items and total for the bill
	 */
	public String getText() {
		String text = "ITEMS" + System.lineSeparator();
		double subTotal = 0.0;
		for (Bill element : this.items) {
			for (int ja = 0; ja < element.getSize(); ja++) {
			var item = element.getItem(ja);
			text += item.getName() + " - " + item.getAmount() + System.lineSeparator();
			subTotal += item.getAmount();
		}
		}

		text += System.lineSeparator();
		text += "SUBTOTAL - $" + subTotal + System.lineSeparator();
		double tax = subTotal * Bill.TAX_PERCENT;
		double tip = subTotal * Bill.TIP_PERCENT;
		text += "TAX - $" + tax + System.lineSeparator();
		text += "TIP - $" + tip + System.lineSeparator();
		text += "TOTAL - $" + (subTotal + tax + tip);

		return text;
	}

	/** Adds the bill to the text generator
	 *
	 * @precondition billy != null
	 * @postcondition billy is added to the list of items in the text generator
	 *
	 * @param billy the bill to be added to the text generator
	 */
	public void addItem(Bill billy) {
		this.items.add(billy);
	}
}

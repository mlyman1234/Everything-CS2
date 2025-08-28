package edu.westga.cs1302.lab1.model;

import java.util.ArrayList;

/** Stores information for a bill.
 * 
 * @author CS 1302
 * @version Fall 2025
 */
public class Bill {
	
	private ArrayList<BillItem> items;
	
	/** Create a new empty Bill
	 * 
	 * @precondition none
	 * @postcondition none
	 * 
	 */
	public Bill() {
		this.items = new ArrayList<BillItem>();
	}
	
	/** Adds the item to the bill
	 * 
	 * @precondition item != null
	 * @postcondition item is added to the list of items in the bill
	 * 
	 * @param item the item to be added to the bill
	 */
	public void addItem(BillItem item) {
		if (item == null) {
			throw new IllegalArgumentException("item must not be null.");
		}
		this.items.add(item);
	}
	
	/** Return the item in the bill based on index
	 * 
	 * @precondition none
	 * @postcondition none
	 * 
	 * @param index item's list number in the bill
	 * @return the item based off index
	 */
	public BillItem getItem(int index) {
		var item = this.items.get(index);
		return item;
	}
	
	/** Return the size of the current bill's list
	 * 
	 * @precondition none
	 * @postcondition none
	 * 
	 * @return the size of the bill
	 */
	public int getSize() {
		int size = 0;
		size = this.items.size();
		return size;
	}
}
	
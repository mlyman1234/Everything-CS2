package edu.westga.cs1302.investment_projector.model;


/** Stores information for a Student
 * 
 * @author CS 1302
 * @version Fall 2024
 */
public class CollectionData {
	private String name;
	
	public CollectionData(String name) {
		if(name.isEmpty() || name == null) {
			throw new IllegalArgumentException("Can't be null or empty");
		}
		this.name = name;
	}

	public String getName() {
		return name;
	}
	
	

}

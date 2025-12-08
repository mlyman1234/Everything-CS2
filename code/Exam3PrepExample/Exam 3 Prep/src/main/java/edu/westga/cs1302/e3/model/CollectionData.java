package edu.westga.cs1302.e3.model;

import java.util.ArrayList;

/** Stores information for a Student
 * 
 * @author CS 1302
 * @version Fall 2024
 */
public class CollectionData {
	private ArrayList<String> collection;
	private String name;
	
	public CollectionData(String name, ArrayList<String> collection) {
		this.name = name;
		this.collection = collection;
	}

	public ArrayList<String> getCollection() {
		return collection;
	}

	public String getName() {
		return name;
	}
	
	

}

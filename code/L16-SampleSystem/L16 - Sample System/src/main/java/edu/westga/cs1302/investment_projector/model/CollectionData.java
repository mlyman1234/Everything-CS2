package edu.westga.cs1302.investment_projector.model;

import java.util.ArrayList;

/** Stores information for a Student
 * 
 * @author CS 1302
 * @version Fall 2024
 */
public class CollectionData {
	private String name;
	private ArrayList<ComicData> comics;
	
	/**Constructor for Collection of Comic books
	 * 
	 * 
	 * @param name the name of collection
	 */
	public CollectionData(String name) {
		if (name.isEmpty() || name == null) {
			throw new IllegalArgumentException("Can't be null or empty");
		}
		this.name = name;
		this.comics = new ArrayList<ComicData>();

	}
	
	/**Returns the name of the collection
	 * 
	 * 
	 * @return name of collection
	 */
	public String getName() {
		return this.name;
	}

	/**Returns the list of comics in the collection
	 * 
	 * @return comics from the collection
	 */
	public ArrayList<ComicData> getComics() {
		return this.comics;
	}
	
	/**ToString for Collection class
	 * 
	 * @return name returns the tostring of collection
	 */
	public String toString() {
		return this.name;
	}
	
}

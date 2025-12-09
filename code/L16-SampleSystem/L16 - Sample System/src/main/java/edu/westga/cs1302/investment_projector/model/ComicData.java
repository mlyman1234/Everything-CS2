package edu.westga.cs1302.investment_projector.model;

/** Stores information for a Comics
 * 
 * @author CS 1302
 * @version Fall 2024
 */
public class ComicData {
	
	private String title;
	private int issueNumber;
	
	/**Constructor for comics
	 * 
	 * @param title title of the comic
	 * @param issueNumber the order number on the comic
	 */
	public ComicData(String title, int issueNumber) {
		this.title = title;
		this.issueNumber = issueNumber;
	}

	/**Returns the title of comic
	 * 
	 * @return title title of comic
	 */
	public String getTitle() {
		return this.title;
	}

	/**Returns the order number of comic
	 * 
	 * @return issueNumber the order number on the comic
	 */
	public int getIssueNumber() {
		return this.issueNumber;
	}
	
	/**Returns toString of Comic
	 * 
	 * @return title and serial number
	 */
	public String toString() {
		return this.title + " " + this.issueNumber;
	}

}

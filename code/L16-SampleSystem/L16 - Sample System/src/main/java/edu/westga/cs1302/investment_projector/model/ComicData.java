package edu.westga.cs1302.investment_projector.model;

public class ComicData {
	
	private String title;
	private int issueNumber;
	
	public ComicData(String title, int issueNumber) {
		this.title = title;
		this.issueNumber = issueNumber;
	}

	public String getTitle() {
		return title;
	}

	public int getIssueNumber() {
		return issueNumber;
	}
	
	public String toString() {
		return this.title + " " + issueNumber;
	}

}

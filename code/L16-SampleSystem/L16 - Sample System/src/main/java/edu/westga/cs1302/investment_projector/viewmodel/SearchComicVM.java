package edu.westga.cs1302.investment_projector.viewmodel;

import java.util.HashMap;
import java.util.Map;

import edu.westga.cs1302.contact_manager.model.Contact;
import edu.westga.cs1302.investment_projector.model.CollectionData;
import edu.westga.cs1302.investment_projector.model.ComicData;
import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class SearchComicVM {
	private StringProperty title;
	private IntegerProperty issueNumber;
	private CollectionData collection;
	private Map<String, CollectionData> titleMap;
	private Map<String, CollectionData> issueMap;

	public SearchComicVM() {
		this.title = new SimpleStringProperty("");
		this.issueNumber = new SimpleIntegerProperty();
		this.titleMap = new HashMap<String, CollectionData>();
		this.issueMap = new HashMap<String, CollectionData>();
	}

	public StringProperty getTitle() {
		return this.title;
	}

	public IntegerProperty getIssueNumber() {
		return issueNumber;
	}
	
	public CollectionData getCollection() {
		return collection;
	}
	
	public void setCollection(CollectionData data) {
		this.collection = data;
	}
	
	public void searchComic() {
		
	}

}



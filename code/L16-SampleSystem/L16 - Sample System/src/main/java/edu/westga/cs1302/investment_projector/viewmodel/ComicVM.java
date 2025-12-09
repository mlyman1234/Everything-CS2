package edu.westga.cs1302.investment_projector.viewmodel;


import edu.westga.cs1302.investment_projector.model.CollectionData;
import edu.westga.cs1302.investment_projector.model.ComicData;
import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class ComicVM {
	private StringProperty title;
	private IntegerProperty issueNumber;
	private CollectionData collection;

	public ComicVM() {
		this.title = new SimpleStringProperty("");
		this.issueNumber = new SimpleIntegerProperty();
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
	
	public void addComic() {
		ComicData addedComic = new ComicData(this.title.get(), this.issueNumber.get());
		this.collection.getComics().add(addedComic);		
	}

}



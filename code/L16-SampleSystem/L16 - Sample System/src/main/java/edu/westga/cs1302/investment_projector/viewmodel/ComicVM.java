package edu.westga.cs1302.investment_projector.viewmodel;

import java.util.ArrayList;

import edu.westga.cs1302.investment_projector.model.CollectionData;
import edu.westga.cs1302.investment_projector.model.ComicData;
import javafx.beans.property.IntegerProperty;
import javafx.beans.property.ListProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleListProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.collections.FXCollections;

public class ComicVM {
	private StringProperty title;
	private IntegerProperty issueNumber;
	private ListProperty<ComicData> comics;

	public ComicVM() {
		this.title = new SimpleStringProperty("");
		this.issueNumber = new SimpleIntegerProperty();
		this.comics = new SimpleListProperty<ComicData>(FXCollections.observableArrayList(new ArrayList<ComicData>()));
	}

	public StringProperty getTitle() {
		return this.title;
	}

	public ListProperty<ComicData> getComics() {
		return this.comics;
	}
	
	public void addName() {
		ComicData addedComic = new ComicData(this.title.get(), this.issueNumber.get());
		this.comics.add(addedComic);
	}
	
	public void removeName(ComicData removedComic) {
		this.comics.remove(removedComic);
	}

	
	

}



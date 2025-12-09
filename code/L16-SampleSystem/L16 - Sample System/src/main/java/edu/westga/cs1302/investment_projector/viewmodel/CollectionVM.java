package edu.westga.cs1302.investment_projector.viewmodel;

import java.util.ArrayList;

import edu.westga.cs1302.investment_projector.model.CollectionData;
import edu.westga.cs1302.investment_projector.model.ComicData;
import javafx.beans.property.ListProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.SimpleListProperty;
import javafx.beans.property.StringProperty;
import javafx.collections.FXCollections;

/** Implements behavior for the application.
 * 
 * @author CS 1302
 * @version Fall 2024
 */
public class CollectionVM {
	private StringProperty name;
	private ListProperty<CollectionData> collection;
	private ListProperty<ComicData> comics;


	public CollectionVM() {
		this.name = new SimpleStringProperty("");
		this.collection = new SimpleListProperty<CollectionData>(FXCollections.observableArrayList(new ArrayList<CollectionData>()));
		this.comics = new SimpleListProperty<ComicData>(FXCollections.observableArrayList(new ArrayList<ComicData>()));
	}

	public StringProperty getName() {
		return this.name;
	}

	public ListProperty<CollectionData> getCollection() {
		return this.collection;
	}
	
	public ListProperty<ComicData> getComics(CollectionData data) {
		
		return this.comics;
	}

	public void addName() {
		CollectionData addedcollection = new CollectionData(this.name.get());
		this.collection.add(addedcollection);
	}
	
	public void removeName(CollectionData removedCollection) {
		this.collection.remove(removedCollection);
	}

	public void removeComic(ComicData selectedItem) {
		this.comics.remove(selectedItem);
		
	}

	
	

}

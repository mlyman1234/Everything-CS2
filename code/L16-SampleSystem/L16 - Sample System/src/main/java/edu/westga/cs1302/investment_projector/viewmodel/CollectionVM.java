package edu.westga.cs1302.investment_projector.viewmodel;

import java.util.ArrayList;

import edu.westga.cs1302.investment_projector.model.CollectionData;
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

	public CollectionVM() {
		this.name = new SimpleStringProperty("");
		this.collection = new SimpleListProperty<CollectionData>(FXCollections.observableArrayList(new ArrayList<CollectionData>()));
	}

	public StringProperty getName() {
		return this.name;
	}

	public ListProperty<CollectionData> getCollection() {
		return this.collection;
	}
	
	public void addName() {
		CollectionData addedcollection = new CollectionData(this.name.getName());
		this.collection.add(addedcollection);
	}
	
	public void removeName(CollectionData removedCollection) {
		this.collection.remove(removedCollection);
	}

	
	

}

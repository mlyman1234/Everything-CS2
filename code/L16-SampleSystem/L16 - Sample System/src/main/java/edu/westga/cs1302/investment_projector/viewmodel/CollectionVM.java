package edu.westga.cs1302.investment_projector.viewmodel;

import java.util.ArrayList;

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
	private ListProperty<String> collection;

	public CollectionVM() {
		this.name = new SimpleStringProperty("");
		this.collection = new SimpleListProperty<String>(FXCollections.observableArrayList(new ArrayList<String>()));
	}

	public StringProperty getName() {
		return this.name;
	}

	public ListProperty<String> getCollection() {
		return this.collection;
	}
	
	public void addName() {
		String addedName = this.name.getName();
		this.collection.add(addedName);
	}
	
	public void removeName(String removedName) {
		this.collection.remove(removedName);
	}

	
	

}

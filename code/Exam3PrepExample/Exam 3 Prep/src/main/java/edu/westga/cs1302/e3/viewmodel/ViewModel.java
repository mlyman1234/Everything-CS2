package edu.westga.cs1302.e3.viewmodel;

import java.util.ArrayList;

import edu.westga.cs1302.e3.model.CollectionData;
import javafx.beans.property.IntegerProperty;
import javafx.beans.property.ListProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.SimpleListProperty;
import javafx.beans.property.StringProperty;
import javafx.collections.FXCollections;

/** Implements behavior for the application.
 * 
 * @author CS 1302
 * @version Fall 2024
 */
public class ViewModel {
	private StringProperty name;
	private ListProperty<CollectionData> collection;

	
	public ViewModel() {
		this.name = new SimpleStringProperty("");
		this.collection = new SimpleListProperty<CollectionData>(FXCollections.observableArrayList(new ArrayList<CollectionData>()));
		
		
		
	}


	public StringProperty getName() {
		return name;
	}


	public ListProperty<CollectionData> getCollection() {
		return collection;
	}

	
	

}

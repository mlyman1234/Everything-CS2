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
public class Exam3PrepViewModel {
	private StringProperty name;
	private ListProperty<CollectionData> students;
	private ListProperty<Integer> gpaOption;
	private IntegerProperty selectedGpa;
	
	public Exam3PrepViewModel() {
		this.name = new SimpleStringProperty("");
		this.students = new SimpleListProperty<CollectionData>(FXCollections.observableArrayList(new ArrayList<CollectionData>()));
		this.gpaOption = new SimpleListProperty<Integer>(FXCollections.observableArrayList(new ArrayList<Integer>()));
		this.gpaOption.add(1);
		this.gpaOption.add(2);
		this.gpaOption.add(3);
		this.gpaOption.add(4);
		this.selectedGpa = new SimpleIntegerProperty(4);
	}

	public ListProperty<CollectionData> getStudents() {
		return students;
	}

	public ListProperty<Integer> getGpaOption() {
		return gpaOption;
	}

	public IntegerProperty getSelectedGpa() {
		return selectedGpa;
	}

	public StringProperty getName() {
		return name;
	}
	
	public void addStudent() {
		CollectionData student = new CollectionData(this.name.getName(), this.selectedGpa.get());
		this.students.add(student);
	}
	
	public int displayGPA() {
		CollectionData student = new CollectionData(this.name.getName(), this.selectedGpa.get());
		int gpa = student.getGPA();
		if (student.getName().isEmpty()) {
			throw new IllegalArgumentException("");
		}
		
		else {
			return gpa;
		}
		
		
	}

	
	

}

package edu.westga.cs1302.password_generator.viewmodel;

import java.util.Random;

import edu.westga.cs1302.password_generator.model.PasswordGenerator;
import javafx.beans.property.BooleanProperty;
import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleBooleanProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;

public class MainWindowViewModel {
	
	private BooleanProperty mustHaveAtLeastOneDigitProperty;
	private BooleanProperty mustHaveAtLeastOneUpperCaseLetterProperty;
	private BooleanProperty mustHaveAtLeastOneLowerCaseLetterProperty;
	private IntegerProperty lengthProperty;
	private StringProperty passwordProperty;
	
	private PasswordGenerator generator;
	
	public MainWindowViewModel() {
		this.mustHaveAtLeastOneDigitProperty = new SimpleBooleanProperty(false);
		this.mustHaveAtLeastOneLowerCaseLetterProperty = new SimpleBooleanProperty(false);
		this.mustHaveAtLeastOneUpperCaseLetterProperty = new SimpleBooleanProperty(false);
		this.lengthProperty = new SimpleIntegerProperty(-1);
		this.passwordProperty = new SimpleStringProperty("");
	}

	public BooleanProperty getMustHaveAtLeastOneDigitProperty() {
		return mustHaveAtLeastOneDigitProperty;
	}
	
	public BooleanProperty getMustHaveAtLeastOneLowerCaseLetterProperty() {
		return mustHaveAtLeastOneLowerCaseLetterProperty;
	}
	
	public BooleanProperty getMustHaveAtLeastOneUpperCaseLetterProperty() {
		return mustHaveAtLeastOneUpperCaseLetterProperty;
	}
	
	public IntegerProperty getLengthProperty() {
		return lengthProperty;
	}
	
	public void generatePassword() {
		this.generator.setMinimumLength(this.lengthProperty.getValue());
		this.generator.setMustHaveAtLeastOneDigit(this.mustHaveAtLeastOneDigitProperty.getValue());
		this.generator.setMustHaveAtLeastOneLowerCaseLetter(this.mustHaveAtLeastOneLowerCaseLetterProperty.getValue());
		this.generator.setMustHaveAtLeastOneUpperCaseLetter(this.mustHaveAtLeastOneUpperCaseLetterProperty.getValue());
		
		String password = this.generator.generatePassword();
		
		this.passwordProperty.set(password);
	}


		
	

}

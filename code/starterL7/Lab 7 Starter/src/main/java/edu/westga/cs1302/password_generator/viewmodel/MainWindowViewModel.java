package edu.westga.cs1302.password_generator.viewmodel;

import edu.westga.cs1302.password_generator.model.PasswordGenerator;
import javafx.beans.property.BooleanProperty;
import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleBooleanProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

/**
 * The ViewModel for MainWindow class.
 * 
 * @author CS1302
 * @version Fall 2025
 */
public class MainWindowViewModel {
	
	private BooleanProperty mustHaveAtLeastOneDigitProperty;
	private BooleanProperty mustHaveAtLeastOneUpperCaseLetterProperty;
	private BooleanProperty mustHaveAtLeastOneLowerCaseLetterProperty;
	private IntegerProperty lengthProperty;
	private StringProperty passwordProperty;
	
	private PasswordGenerator generator;
	
	/**
	 * Instantiates a new main window view model.
	 */
	public MainWindowViewModel() {
		this.mustHaveAtLeastOneDigitProperty = new SimpleBooleanProperty(false);
		this.mustHaveAtLeastOneLowerCaseLetterProperty = new SimpleBooleanProperty(false);
		this.mustHaveAtLeastOneUpperCaseLetterProperty = new SimpleBooleanProperty(false);
		this.lengthProperty = new SimpleIntegerProperty(-1);
		this.passwordProperty = new SimpleStringProperty("");
	}

	/**
	 * Gets the boolean property.
	 *
	 * @return the mustHaveAtLeastOneDigitProperty
	 */
	public BooleanProperty getMustHaveAtLeastOneDigitProperty() {
		return this.mustHaveAtLeastOneDigitProperty;
	}
	
	/**
	 * Gets the boolean property.
	 *
	 * @return the mustHaveAtLeastOneLowerCaseLetterProperty
	 */
	public BooleanProperty getMustHaveAtLeastOneLowerCaseLetterProperty() {
		return this.mustHaveAtLeastOneLowerCaseLetterProperty;
	}
	
	/**
	 * Gets the boolean property.
	 *
	 * @return the mustHaveAtLeastOneUpperCaseLetterProperty
	 */
	public BooleanProperty getMustHaveAtLeastOneUpperCaseLetterProperty() {
		return this.mustHaveAtLeastOneUpperCaseLetterProperty;
	}
	
	/**
	 * Gets the length property.
	 *
	 * @return the lengthProperty
	 */
	public IntegerProperty getLengthProperty() {
		return this.lengthProperty;
	}
	
	/**
	 * Gets the password property.
	 *
	 * @return the passwordProperty
	 */
	public StringProperty getPasswordProperty() {
		return this.passwordProperty;
	}
	
	/**
	 * Generates a password based on if specific boolean properties are true 
	 * as well as the minimum length of the desired password. After generating the password
	 * it sets the result to the password property.
	 *
	 */
	public void generatePassword() {
		this.generator.setMinimumLength(this.lengthProperty.getValue());
		this.generator.setMustHaveAtLeastOneDigit(this.mustHaveAtLeastOneDigitProperty.getValue());
		this.generator.setMustHaveAtLeastOneLowerCaseLetter(this.mustHaveAtLeastOneLowerCaseLetterProperty.getValue());
		this.generator.setMustHaveAtLeastOneUpperCaseLetter(this.mustHaveAtLeastOneUpperCaseLetterProperty.getValue());
		
		String password = this.generator.generatePassword();
		
		this.passwordProperty.set(password);
	}
		
}

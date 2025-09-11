package edu.westga.cs1302.lab3.views;

import edu.westga.cs1302.lab3.model.Bill;
import edu.westga.cs1302.lab3.model.BillItem;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;


/**
 * This generates a window for the program to operate.
 * 
 * @author CS 1302
 * @version Fall 2025
 */
public class MainWindow {

    @FXML
    private TextField amountInput;

    @FXML
    private TextField nameInput;

    @FXML
    private TextArea output;
    
    private Bill bill;

    @FXML
    void addItem(ActionEvent event) {
    	BillView text = new BillView();
    	BillItem item = new BillItem(this.nameInput.getText(), Double.parseDouble(this.amountInput.getText()));
    	this.bill.addItem(item);
    	var receipt = text.getText(this.bill);
    	this.output.setText(receipt);
    }
    
    @FXML
    void initialize() {
    	this.bill = new Bill();
    }
}

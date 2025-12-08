package edu.westga.cs1302.e3.view;

import edu.westga.cs1302.e3.model.CollectionData;
import edu.westga.cs1302.e3.viewmodel.CollectionVM;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;

/** Codebehind for the MainWindow of the Application.
 * 
 * @author CS 1302
 * @version Fall 2024
 */
public class MainWindow {
	@FXML
    private ListView<CollectionData> collectionOfNames;
    @FXML
    private TextField name;
    
    private CollectionVM vm;
    
    
    void bind() {
		this.name.textProperty().bindBidirectional(this.vm.getName());
		this.collectionOfNames.setItems(this.vm.getCollection());
    }

    @FXML
    void removeName(ActionEvent event) {
    	this.vm.removeName(this.collectionOfNames.getSelectionModel().getSelectedItem());
    }

    @FXML
    void addName(ActionEvent event) {
    	this.vm.addName();

    }

}

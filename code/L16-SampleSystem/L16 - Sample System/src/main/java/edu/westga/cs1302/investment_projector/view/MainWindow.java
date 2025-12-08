package edu.westga.cs1302.investment_projector.view;

import edu.westga.cs1302.investment_projector.viewmodel.CollectionVM;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;


/** Codebehind for the MainWindow of the Application.
 * 
 * @author CS 1302
 * @version Fall 2024
 */
public class MainWindow {
	@FXML private ListView<String> collectionOfNames;
    @FXML private TextField name;
    @FXML private Button addingName;
    @FXML private Button removingName;
    
    private CollectionVM vm;
    
    @FXML
    void bindVM() {
    	this.vm = new CollectionVM();
    	
		this.name.textProperty().bindBidirectional(this.vm.getName());
		this.collectionOfNames.setItems(this.vm.getCollection());

    	this.addingName.setOnAction((event) -> {
    		try {
    			this.vm.addName();
    		} catch (IllegalArgumentException error) {
    			Alert alert = new Alert(AlertType.ERROR);
    			alert.setContentText(error.getMessage());
    			alert.showAndWait();
    		}
    	});
    	
    	this.removingName.setOnAction((event) -> {
    		try {
    			this.vm.removeName(this.collectionOfNames.getSelectionModel().getSelectedItem());
    		} catch (IllegalArgumentException error) {
    			Alert alert = new Alert(AlertType.ERROR);
    			alert.setContentText(error.getMessage());
    			alert.showAndWait();
    		}
    	});

    }

}

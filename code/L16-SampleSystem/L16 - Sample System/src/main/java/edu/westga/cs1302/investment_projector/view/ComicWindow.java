package edu.westga.cs1302.investment_projector.view;

import edu.westga.cs1302.investment_projector.model.CollectionData;
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
public class ComicWindow {
	@FXML private ListView<CollectionData> collectionOfNames;
    @FXML private TextField name;
    @FXML private Button addingName;
    @FXML private Button removingName;
    @FXML private Button addingComic;
    @FXML private Button removingComic;
    @FXML private ListView<?> comics;
    
    private CollectionVM vm;
    
    @FXML
    void initalize() {
    	this.vm = new CollectionVM();
        this.vm.getName().bind(this.name.textProperty());
		this.collectionOfNames.setItems(this.vm.getCollection());

		this.name.textProperty().addListener((observable, oldValue, newValue) -> {
			if (newValue.isEmpty()) {
				this.addingName.setDisable(true);
			} else {
				this.addingName.setDisable(false);
			}
	});
    
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

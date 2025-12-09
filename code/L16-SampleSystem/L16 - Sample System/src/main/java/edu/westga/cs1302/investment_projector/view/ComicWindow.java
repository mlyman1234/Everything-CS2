package edu.westga.cs1302.investment_projector.view;

import edu.westga.cs1302.investment_projector.model.CollectionData;
import edu.westga.cs1302.investment_projector.model.ComicData;
import edu.westga.cs1302.investment_projector.viewmodel.CollectionVM;
import edu.westga.cs1302.investment_projector.viewmodel.ComicVM;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;
import javafx.util.converter.NumberStringConverter;
import javafx.scene.control.Button;


/** Codebehind for the MainWindow of the Application.
 * 
 * @author CS 1302
 * @version Fall 2024
 */
public class ComicWindow {
	@FXML private Button addingComic;
    @FXML private TextField issueTextField;
    @FXML private ListView<ComicData> listOfComics;
    @FXML private Button removeComic;
    @FXML private TextField titleTextField;
    
    private ComicVM vm;
    
    @FXML
    void initalize() {
    	this.vm = new ComicVM();
        this.vm.getTitle().bind(this.titleTextField.textProperty());
		this.issueTextField.textProperty().bindBidirectional(this.vm.getIssueNumber(), new NumberStringConverter());
		this.listOfComics.setItems(this.vm.getComics());
		
		this.titleTextField.textProperty().addListener((observable, oldValue, newValue) -> {
			if (newValue.isEmpty()) {
				this.addingComic.setDisable(true);
			} else {
				this.addingComic.setDisable(false);
			}
	});
		
		this.issueTextField.textProperty().addListener((observable, oldValue, newValue) -> {
			if (newValue.isEmpty()) {
				this.addingComic.setDisable(true);
			} else {
				this.addingComic.setDisable(false);
			}
	});
		
    	this.addingComic.setOnAction((event) -> {
    		try {
    			this.vm.addComic();
    		} catch (IllegalArgumentException error) {
    			Alert alert = new Alert(AlertType.ERROR);
    			alert.setContentText(error.getMessage());
    			alert.showAndWait();
    		} 
    	});
    	  	
    	this.removeComic.setOnAction((event) -> {
    		try {
    			this.vm.removeComic(this.listOfComics.getSelectionModel().getSelectedItem());
    		} catch (IllegalArgumentException error) {
    			Alert alert = new Alert(AlertType.ERROR);
    			alert.setContentText(error.getMessage());
    			alert.showAndWait();
    		}
    	});


    }




}

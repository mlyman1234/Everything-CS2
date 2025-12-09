package edu.westga.cs1302.investment_projector.view;

import java.io.IOException;

import edu.westga.cs1302.investment_projector.Main;
import edu.westga.cs1302.investment_projector.model.CollectionData;
import edu.westga.cs1302.investment_projector.viewmodel.CollectionVM;
import edu.westga.cs1302.investment_projector.viewmodel.ComicVM;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.scene.control.Button;

/** Codebehind for the MainWindow of the Application.
 * 
 * @author CS 1302
 * @version Fall 2024
 */
public class MainWindow {
	@FXML private ListView<CollectionData> collectionOfNames;
	@FXML private ListView<CollectionData> listOfComics;
    @FXML private TextField name;
    @FXML private Button addingName;
    @FXML private Button removingName;
    @FXML private Button addingComic;
    @FXML private Button removingComic;
    
    private CollectionVM vm;
    private ComicVM vmComic;
    
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
    	
     	this.addingComic.setOnAction((event) -> {
     		FXMLLoader loader = new FXMLLoader();
        	loader.setLocation(Main.class.getResource(Main.COMIC_WINDOW_RESOURCE));
        	try {
    			loader.load();
    	    	Parent parent = loader.getRoot();
    	    	Scene scene = new Scene(parent);
    	    	Stage comicWindow = new Stage();
    	    	comicWindow.setTitle("");
    	    	comicWindow.setScene(scene);
    	    	comicWindow.initModality(Modality.APPLICATION_MODAL);
    	    	
    	    	this.vmComic.setCollection(this.collectionOfNames.getSelectionModel().getSelectedItem());
    	    	
    	    	comicWindow.showAndWait();
    		} catch (IOException error) {
    			Alert alert = new Alert(AlertType.ERROR);
    			alert.setContentText("Failed to load options window. Error loading UI components;");
    			alert.showAndWait();
    		} catch (IllegalArgumentException error) {
    			Alert alert = new Alert(AlertType.ERROR);
    			alert.setContentText("Failed to load options window. Error passing password generator to options window.");
    			alert.showAndWait();
    		}
    	});
     	
     	this.removingComic.setOnAction((event) -> {
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

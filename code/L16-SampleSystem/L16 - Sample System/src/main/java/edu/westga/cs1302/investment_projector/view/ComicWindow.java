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
	@FXML private Button addingComic;

    @FXML private Button addingName;

    @FXML private TextField issueTextField;

    @FXML private TextField nameTextField;
    
    private CollectionVM vm;
    
    @FXML
    void initalize() {
    	
    }

}

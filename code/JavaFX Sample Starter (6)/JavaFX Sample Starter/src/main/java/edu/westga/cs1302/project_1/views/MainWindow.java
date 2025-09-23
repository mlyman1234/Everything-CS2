package edu.westga.cs1302.project_1.views;
import javafx.fxml.FXML;
import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.ListView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

/**
 * Controller class for drawing various things to our canvas window.
 * 
 * @author CS 1302
 * @version Fall 2025
 */
public class MainWindow {

    @FXML
    private TextArea description;

    @FXML
    private TextField name;

    @FXML
    private ListView<?> selectTask;

    @FXML
    private ComboBox<?> taskPriority;

    @FXML
    void submit(ActionEvent event) {

    }
    
    /**
     * Perform any needed initialization of UI components and underlying objects.
     */
    public void initialize() {

    	}

    }
}

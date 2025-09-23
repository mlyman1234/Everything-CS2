package edu.westga.cs1302.project_1.views;
import javafx.fxml.FXML;
import edu.westga.cs1302.project_1.Task;
import javafx.event.ActionEvent;
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
    private ListView<Task> selectTask;

    @FXML
    private ComboBox<Integer> taskPriority;

    @FXML
    void submit(ActionEvent event) {
    	String taskName = name.getText();
    	String taskDescription = description.getText();
    	int priority = this.taskPriority.getValue();
    	Task task = new Task(taskName, taskDescription, priority);
    	this.selectTask.getItems().add(task);
    }
    
    /**
     * Perform any needed initialization of UI components and underlying objects.
     */
    public void initialize() {
    	this.taskPriority.getItems().add(1);
    	this.taskPriority.getItems().add(2);
    	this.taskPriority.getItems().add(3);
    	this.taskPriority.getItems().add(4);
    	this.taskPriority.getItems().add(5);
    	}

    }


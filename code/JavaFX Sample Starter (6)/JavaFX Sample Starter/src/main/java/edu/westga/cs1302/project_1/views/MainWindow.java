package edu.westga.cs1302.project_1.views;
import javafx.fxml.FXML;
import edu.westga.cs1302.project_1.Task;
import javafx.event.ActionEvent;
import javafx.scene.control.Alert;
import javafx.scene.control.ComboBox;
import javafx.scene.control.ListView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;


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
    private TextArea displayDescription;

    @FXML
    private TextField displayPriority;

    @FXML
    private ListView<Task> selectTask;

    @FXML
    private ComboBox<Integer> taskPriority;
    
    @FXML
    void descriptionUpdate(ActionEvent event) {
    	Task task = this.selectTask.getSelectionModel().getSelectedItem();
    	task.updateDescription(displayDescription.getText());
    }

    @FXML
    void submit(ActionEvent event) {
    	String taskName = name.getText();
    	String taskDescription = description.getText();
    	int priority = this.taskPriority.getValue();
    	Task task = new Task(taskName, taskDescription, priority);
    	this.selectTask.getItems().add(task);
    }
    
    @FXML
    void removeTask(ActionEvent event) {
    	Task task = this.selectTask.getSelectionModel().getSelectedItem();
    	this.selectTask.getItems().remove(task);
    }
    
    @FXML
    void display(MouseEvent event) {
    	Task task = this.selectTask.getSelectionModel().getSelectedItem();
    	String dDescription = task.getDescription();
    	int dPriority = task.getPriority();
    	displayDescription.setText(dDescription);
    	displayPriority.setText(dPriority + "");
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


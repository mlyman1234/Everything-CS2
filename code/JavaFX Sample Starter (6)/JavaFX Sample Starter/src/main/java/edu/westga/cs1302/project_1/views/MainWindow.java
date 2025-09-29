package edu.westga.cs1302.project_1.views;

import javafx.fxml.FXML;

import java.util.ArrayList;

import edu.westga.cs1302.project_1.Task;
import edu.westga.cs1302.project_1.Utility;
import javafx.event.ActionEvent;
import javafx.scene.control.Alert;
import javafx.scene.control.ComboBox;
import javafx.scene.control.ListView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.control.Label;

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
    private Label priority1;

    @FXML
    private Label priority2;

    @FXML
    private Label priority3;

    @FXML
    private Label priority4;

    @FXML
    private Label priority5;

    @FXML
    private ListView<Task> selectTask;

    @FXML
    private ComboBox<Integer> taskPriority;
    
    @FXML
    void descriptionUpdate(ActionEvent event) {
    	Task task = this.selectTask.getSelectionModel().getSelectedItem();
    	task.updateDescription(this.displayDescription.getText());
    }

    @FXML
    void submit(ActionEvent event) {
    	String taskName = this.name.getText();
    	String taskDescription = this.description.getText();
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
    	this.displayDescription.setText(dDescription);
    	this.displayPriority.setText(dPriority + "");
    }
    
    @FXML
    void numTaskPerPriority(ActionEvent event) {
		ArrayList<Task> tasks = new ArrayList<Task>();
    	for (int iterator = 0; iterator < this.selectTask.getItems().size(); iterator++) {
    		tasks.add(this.selectTask.getItems().get(iterator));
    	}
    	this.priority1.setText("Priority Level 1: " + Utility.numOfTasksByPriority(1, tasks));
    	this.priority2.setText("Priority Level 2: " + Utility.numOfTasksByPriority(2, tasks));
    	this.priority3.setText("Priority Level 3: " + Utility.numOfTasksByPriority(3, tasks));
    	this.priority4.setText("Priority Level 4: " + Utility.numOfTasksByPriority(4, tasks));
    	this.priority5.setText("Priority Level 5: " + Utility.numOfTasksByPriority(5, tasks));
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


package edu.westga.cs1302.task_tracker.model;

import java.util.ArrayList;

/** Creates a list to store the subtasks of a task
 * 
 * @author CS 1302
 * @version Fall 2025
 */
public class ContainerTask extends Task {

	private ArrayList<Task> subtasks;
	
	/** Create a new Container Task with the provided information and stores list of subtasks
	 * 
	 * @preconditon name != null && !name.isEmpty() &&
	 * 				description != null &&
	 * 				priority != null
	 * 
	 * @param name the name of the task
	 * @param description the description of the task
	 * @param priority the priority of the task
	 */
	public ContainerTask(String name, String description, TaskPriority priority) {
		super(name, description, priority);
		
		this.subtasks = new ArrayList<Task>();
	}
	
	@Override
	public ArrayList<Task> getSubTasks() {
		return this.subtasks;
	}
	
	@Override
	public ContainerTask addTask(Task task) {
		this.subtasks.add(task);
		return this;
	}
	
	@Override
	public String toString() {
		return this.name + "[+]";
	}

}

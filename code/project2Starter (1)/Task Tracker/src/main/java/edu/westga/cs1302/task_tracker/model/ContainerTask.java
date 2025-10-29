package edu.westga.cs1302.task_tracker.model;

import java.util.ArrayList;

public class ContainerTask extends Task {

	private ArrayList<Task> subtasks;
	
	public ContainerTask (String name, String description, TaskPriority priority) {
		super(name, description, priority);
		this.subtasks = new ArrayList<Task>();
	}
	
	@Override
	public ArrayList<Task> getSubTasks(){
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

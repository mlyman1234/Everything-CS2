package edu.westga.cs1302.project_1;

public class Task {
	
	private final String name;
	private String description;
	private final int priority;
	
	public Task(String name, String description, int priority) {
		this.name = name;
		this.description = description;
		this.priority = priority;
	}

	public String getName() {
		return name;
	}

	public String getDescription() {
		return description;
	}

	public int getPriority() {
		return priority;
	}
	
}

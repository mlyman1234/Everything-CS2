package edu.westga.cs1302.project_1;



/** Stores information for a Task.
 * 
 * @author CS 1302
 * @version Fall 2025
 */
public class Task {
	
	private final String name;
	private String description;
	private final int priority;
	
	/** Create a new empty Task
	 * 
	 * @precondition none
	 * @postcondition none
	 * 
	 */
	public Task(String name, String description, int priority) {
		this.name = name;
		this.description = description;
		this.priority = priority;
	}

	/** Returns the Task's name
	 * 
	 * @precondition none
	 * @postcondition none
	 * @return name name of task
	 * 
	 */
	public String getName() {
		return name;
	}
	
	/** Returns the Task's description
	 * 
	 * @precondition none
	 * @postcondition none
	 * @return description description of task
	 * 
	 */
	public String getDescription() {
		return description;
	}
	
	/** Returns the Task's priority
	 * 
	 * @precondition none
	 * @postcondition none
	 * @return priority priority of task
	 * 
	 */
	public int getPriority() {
		return priority;
	}
	
	/** Returns the Task's name
	 * 
	 * @precondition none
	 * @postcondition none
	 * @return name name of task
	 * 
	 */
	public String toString() {
		return this.name;
	}
	
	/** Updates the description of the task
	 * 
	 * @precondition none
	 * @postcondition none
	 * @param description the new description
	 */
	public void updateDescription(String description) {
		this.description = description;
	}
	
}

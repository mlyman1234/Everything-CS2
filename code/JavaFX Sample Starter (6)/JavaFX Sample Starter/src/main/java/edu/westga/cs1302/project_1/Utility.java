package edu.westga.cs1302.project_1;

import java.util.ArrayList;

/** Gives utility to the Task class
 * 
 * @author CS 1302
 * @version Fall 2025
 */
public class Utility {

	/** Returns the number of tasks based on the given priority
	 * 
	 * @precondition none
	 * @postcondition none
	 * @return result the number of tasks with the selected priority
	 * @param tasks the list of tasks
	 * 		  priority the priority of tasks needing to be counted
	 */
	public static int numOfTasksByPriority(int priority, ArrayList<Task> tasks) {
		int result = 0;
		for (int i = 0; i < tasks.size(); i++) {
			if (tasks.get(i).getPriority() == priority) {
				result++;
			}
		}
		return result;
	}
}

package edu.westga.cs1302.project_1;

import java.util.ArrayList;

public class Utility {

	
	public static int numOfTasksByPriority(int priority, ArrayList<Task> tasks) {
		int result = 0;
		for(int i = 0; i < tasks.size(); i++) {
			if(tasks.get(i).getPriority() == priority) {
				result++;
			}
		}
		return result;
	}
}

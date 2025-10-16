package edu.westga.cs1302.task_tracker.model;

import java.util.Comparator;

public class TaskComparatorDescending implements Comparator<Task> {

	
	@Override
	public int compare(Task o1, Task o2) {
		var result = 0;
		
		if(o1.getPriority() == o2.getPriority()) {
			result = 0;
		}
		else if(o1.taskPriorityToInt() > o2.taskPriorityToInt()) {
			result = -1;
		}
		else if(o1.taskPriorityToInt() < o2.taskPriorityToInt()) {
			result = 1;
		}
		return result;
	}


	

}

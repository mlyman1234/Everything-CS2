package edu.westga.cs1302.task_tracker.model.ascending;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

import org.junit.jupiter.api.Test;

import edu.westga.cs1302.task_tracker.model.Task;
import edu.westga.cs1302.task_tracker.model.Task.TaskPriority;
import edu.westga.cs1302.task_tracker.model.TaskComparatorAscending;

class TestCompare {

	@Test
	void testMultipleTaskPriorities() {
		Task task1 = new Task("Cleaning", "Floors", TaskPriority.LOW);
		Task task2 = new Task("Cleaning", "Floors", TaskPriority.MEDIUM);
		Task task3 = new Task("Cleaning", "Floors", TaskPriority.HIGH);
		ArrayList<Task> taskList = new ArrayList<Task>();
		taskList.add(task1);
		taskList.add(task3);
		taskList.add(task2);
		TaskComparatorAscending comparator = new TaskComparatorAscending();
		Collections.sort(taskList, comparator);
		assertEquals(TaskPriority.LOW, taskList.get(0).getPriority());
        assertEquals(TaskPriority.MEDIUM, taskList.get(1).getPriority());
        assertEquals(TaskPriority.HIGH, taskList.get(2).getPriority());
	}



}

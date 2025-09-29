package edu.westga.cs1302.project_1.views.utility;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

import edu.westga.cs1302.project_1.Task;
import edu.westga.cs1302.project_1.Utility;

class testNumberOfTasksByPriority {

	@Test
	void testWhenListIsEmpty() {
		ArrayList<Task> tasks = new ArrayList<Task>();
		int result = Utility.numOfTasksByPriority(1, tasks);
		int expected = 0;
		assertEquals(result, expected); 
	}
	
	@Test
	void testWhenListHasOnlyOnePriorityAndItIsNotValid() {
		ArrayList<Task> tasks = new ArrayList<Task>();
		Task task1 = new Task("Clean", "Dishes", 2);
		tasks.add(task1);
		int result = Utility.numOfTasksByPriority(1, tasks);
		int expected = 0;
		assertEquals(result, expected);
	}
	
	@Test
	void testWhenListHasManyPrioritesThatAreNotValid() {
		ArrayList<Task> tasks = new ArrayList<Task>();
		Task task1 = new Task("Clean", "Dishes", 2);
		Task task2 = new Task("Clean", "Floor", 5);
		Task task3 = new Task("Clean", "Rugs", 4);
		tasks.add(task1);
		tasks.add(task2);
		tasks.add(task3);
		int result = Utility.numOfTasksByPriority(1, tasks);
		int expected = 0;
		assertEquals(result, expected);
	}
	
	@Test
	void testWhenListHasOnlyOnePriorityAndItsValid() {
		ArrayList<Task> tasks = new ArrayList<Task>();
		Task task1 = new Task("Clean", "Dishes", 2);
		tasks.add(task1);
		int result = Utility.numOfTasksByPriority(2, tasks);
		int expected = 1;
		assertEquals(result, expected);
	}
	
	@Test
	void testWhenListHasManyPrioritesThatAreValid() {
		ArrayList<Task> tasks = new ArrayList<Task>();
		Task task1 = new Task("Clean", "Dishes", 3);
		Task task2 = new Task("Clean", "Floor", 3);
		Task task3 = new Task("Clean", "Rugs", 4);
		tasks.add(task1);
		tasks.add(task2);
		tasks.add(task3);
		int result = Utility.numOfTasksByPriority(3, tasks);
		int expected = 2;
		assertEquals(result, expected);
	}
	

}

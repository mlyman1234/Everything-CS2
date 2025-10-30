package edu.westga.cs1302.task_tracker.model.descendingName;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import edu.westga.cs1302.task_tracker.model.DescendingName;
import edu.westga.cs1302.task_tracker.model.Task;
import edu.westga.cs1302.task_tracker.model.Task.TaskPriority;

class TestCompare {

	@Test
	void testO1IsNull() {
		Task o2 = new Task("name", "desc", TaskPriority.HIGH);
		DescendingName descending = new DescendingName();
		
		assertThrows(IllegalArgumentException.class, ()->{descending.compare(null, o2);});
	}

	@Test
	void testO2IsNull() {
		Task o1 = new Task("name", "desc", TaskPriority.HIGH);
		DescendingName descending = new DescendingName();
		
		assertThrows(IllegalArgumentException.class, ()->{descending.compare(o1, null);});
	}
	
	@Test
	void testO1FirstAndO2Second() {
		Task o1 = new Task("nama", "desc", TaskPriority.HIGH);
		Task o2 = new Task("zename", "desc", TaskPriority.MEDIUM);
		DescendingName descending = new DescendingName();
		
		int result = descending.compare(o1, o2);

		assertTrue(result > 0);
	}
	
	@Test
	void testO1SecondAndO2First() {
		Task o1 = new Task("zename", "desc", TaskPriority.MEDIUM);
		Task o2 = new Task("name", "desc", TaskPriority.HIGH);
		DescendingName descending = new DescendingName();
		
		int result = descending.compare(o1, o2);

		assertTrue(result < 0);
	}
	
	@Test
	void testO1FirstAndO2First() {
		Task o1 = new Task("name", "desc", TaskPriority.MEDIUM);
		Task o2 = new Task("name", "desc", TaskPriority.MEDIUM);
		DescendingName descending = new DescendingName();
		
		int result = descending.compare(o1, o2);

		assertTrue(result == 0);
	}

}

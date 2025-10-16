package edu.westga.cs1302.lab5.persistence.student_data_persistence_manager;

import static org.junit.jupiter.api.Assertions.*;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

import org.junit.jupiter.api.Test;

import edu.westga.cs1302.lab5.model.Student;
import edu.westga.cs1302.lab5.persistence.StudentDataPersistenceManager;

class TestLoadStudentData {

	@Test
	void test() {
		fail("Not yet implemented");
	}
	
	@Test
	void testHasOneValidStudentsInArray() throws IllegalArgumentException, IOException {
		Student[] classroom = new Student[1];
		classroom[0] = new Student("Joey", 88);
		StudentDataPersistenceManager.saveStudentData(classroom, "test-data.txt");
		Student[] test = StudentDataPersistenceManager.loadStudentData("test-data.txt");
		assertEquals(test, classroom);
	}
}



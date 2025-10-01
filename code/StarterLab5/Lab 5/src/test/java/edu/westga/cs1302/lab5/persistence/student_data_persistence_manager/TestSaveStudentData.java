package edu.westga.cs1302.lab5.persistence.student_data_persistence_manager;

import static org.junit.jupiter.api.Assertions.*;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

import org.junit.jupiter.api.Test;

import edu.westga.cs1302.lab5.model.Student;
import edu.westga.cs1302.lab5.persistence.StudentDataPersistenceManager;

class TestSaveStudentData {

	@Test
	void testNoStudentsInArray() throws IllegalArgumentException, IOException {
		File inputFile = new File("test-data.txt");
		StudentDataPersistenceManager.saveStudentData(new Student[0], "test-data.txt");
		try(Scanner reader = new Scanner(inputFile)){
		assertFalse(reader.hasNextLine(), "checking if file is empty (should have no lines");
		}
	}
	
	@Test
	void testNullArray() throws IllegalArgumentException, IOException {
		assertThrows(IllegalArgumentException.class, ()-> {
			StudentDataPersistenceManager.saveStudentData(null, "test-data.txt");
		});
		
	}
	@Test
	void testHasOnlyOneNullStudentsInArray() throws IllegalArgumentException, IOException {
		Student[] classroom = new Student[1];
		classroom[0] = null;
		File inputFile = new File("test-data.txt");
		StudentDataPersistenceManager.saveStudentData(classroom, "test-data.txt");
		try(Scanner reader = new Scanner(inputFile)){
		assertFalse(reader.hasNextLine(), "checking if file is empty (should have no lines");
		}
	}
	@Test
	void testHasMultipleNullStudentsInArray() throws IllegalArgumentException, IOException {
		Student[] classroom = new Student[3];
		classroom[0] = null;
		classroom[1] = null;
		classroom[2] = null;
		File inputFile = new File("test-data.txt");
		StudentDataPersistenceManager.saveStudentData(classroom, "test-data.txt");
		try(Scanner reader = new Scanner(inputFile)){
		assertFalse(reader.hasNext(), "checking if file is empty (should have line");
		}
	}
	
	@Test
	void testHasOneValidStudentsInArray() throws IllegalArgumentException, IOException {
		Student[] classroom = new Student[1];
		classroom[0] = new Student("Joey", 88);
		File inputFile = new File("test-data.txt");
		StudentDataPersistenceManager.saveStudentData(classroom, "test-data.txt");
		try(Scanner reader = new Scanner(inputFile)){
		assertTrue(reader.hasNextLine(), "checking if file is empty (should have line");
		assertEquals(reader.findInLine("Joey,88"), "Joey,88");
		reader.nextLine();
		assertFalse(reader.hasNextLine(), "checking if file is empty (should have no lines");
	}
}

	@Test
	void testHasMultipleValidStudentsInArray() throws IllegalArgumentException, IOException {
		Student[] classroom = new Student[3];
		classroom[0] = new Student("Joey", 88);
		classroom[1] = new Student("Martha", 68);
		classroom[2] = new Student("Mike", 70);
		File inputFile = new File("test-data.txt");
		StudentDataPersistenceManager.saveStudentData(classroom, "test-data.txt");
		try(Scanner reader = new Scanner(inputFile)){
		assertTrue(reader.hasNextLine(), "checking if file is empty (should have input on line 1");
		assertEquals(reader.findInLine("Joey,88"), "Joey,88");
		reader.nextLine();
		assertTrue(reader.hasNextLine(), "checking if file is empty (should have input on line 2");
		assertEquals(reader.findInLine("Martha,68"), "Martha,68");
		reader.nextLine();
		assertTrue(reader.hasNextLine(), "checking if file is empty (should have input on line 3");
		assertEquals(reader.findInLine("Mike,70"), "Mike,70");
		reader.nextLine();
		assertFalse(reader.hasNextLine(), "checking if file is empty (should have no input on line 4");
		}
	}
}
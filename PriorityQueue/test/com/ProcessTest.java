package com;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * 
 * @author Garry Ledford
 * 
 * JUnit tests for the Process class
 *
 */
public class ProcessTest {

	/**
	 * Test for initialization of a process and 
	 * verifying that the getters return the 
	 * input values from the constructor
	 */
	@Test
	public void test_initialization() {
		Priority inputPriority = new Priority(2);
		Priority expectedPriority = new Priority(2);
		String inputName = "TestProcessName";
		String expectedName = "TestProcessName";
		
		Process p = new Process(inputName, inputPriority);
		
		assertTrue(p.getPriority().getValue() == expectedPriority.getValue());
		assertTrue(p.getName() == expectedName);
	}
	
	/**
	 * Test for getting the name using the getter function
	 */
	@Test
	public void test_getName() {
		Priority inputPriority = new Priority(2);
		String inputName = "TestProcessName";
		String expectedName = "TestProcessName";
		
		Process p = new Process(inputName, inputPriority);
		
		assertTrue(p.getName() == expectedName);
	}

}

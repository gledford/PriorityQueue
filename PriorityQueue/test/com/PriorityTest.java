package com;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * 
 * @author Garry Ledford
 * 
 * JUnit tests for the Priority class
 *
 */
public class PriorityTest {

	/**
	 * Test for initialization and getting
	 * the actual value that was the input parameter
	 * from the constructor
	 */
	@Test
	public void test_initialization() {
		int inputValue = 2;
		int expectedValue = 2;
		Priority p = new Priority( inputValue );
		assertTrue(p.getValue() == expectedValue);
	}

}

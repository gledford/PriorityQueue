package com;

import java.util.LinkedList;
import java.util.Queue;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * 
 * @author Garry Ledford
 * 
 * JUnit tests for the PriorityQueueProcessor
 *
 */
public class PriorityQueueTest {

	/**
	 * Test for inserting a priority into a container
	 * and verifying that the maximum function returns that
	 * priority.
	 */
	@Test
	public void test_insertAndmaximum() {
		Priority inputPriority = new Priority(2);
		String inputName = "TestProcessName";
		Process p = new Process(inputName, inputPriority);
		
		Queue<Process> container = new LinkedList<Process>();
		
		PriorityQueueProcessor pQueueProcessor = new PriorityQueueProcessor();
		
		PriorityQueueProcessor.insert(p, container);
		
		assertTrue(PriorityQueueProcessor.maximum(container) == p);
	}
	
	/**
	 * Test for inserting a priority into a container 
	 * and verifying that the extractMax function returns that
	 * priority
	 */
	@Test
	public void test_extractMax() {
		Priority inputPriorityMax = new Priority(20);
		String inputNameMax = "TestProcessName";
		Process pMax = new Process(inputNameMax, inputPriorityMax);
		
		
		Priority inputPriority = new Priority(2);
		String inputName = "TestProcessName";
		Process p = new Process(inputName, inputPriority);
		
		Queue<Process> container = new LinkedList<Process>();
		
		PriorityQueueProcessor.insert(p, container);
		PriorityQueueProcessor.insert(pMax, container);
		
		assertTrue(PriorityQueueProcessor.extractMax(container) == pMax);
	}

	/**
	 * Test for attempting to insert a null process into 
	 * the container and expecting an exception
	 */
	@Test(expected=IllegalArgumentException.class)
	public void test_insertWithNullProcess() {
		Process p = null;
		Queue<Process> container = new LinkedList<Process>();
		
		PriorityQueueProcessor.insert(p, container);
	}
	
	/**
	 * Test for inserting a process into a null container
	 * and expecting an exception
	 */
	@Test(expected=IllegalArgumentException.class)
	public void test_insertWithNullContainer() {
		Priority inputPriority = new Priority(2);
		String inputName = "TestProcessName";
		Process p = new Process(inputName, inputPriority);
		
		Queue<Process> container = null;
		
		PriorityQueueProcessor.insert(p, container);
	}
	
	/**
	 * Test for calling maximum on a null container
	 * and expecting an exception
	 */
	@Test(expected=IllegalArgumentException.class)
	public void test_maximumWithNullContainer() {
		Queue<Process> container = null;
		
		PriorityQueueProcessor.maximum(container);
	}
	
	/**
	 * Test for calling extractMax on a null container
	 * and expecting an exception
	 */
	@Test(expected=IllegalArgumentException.class)
	public void test_extractMaxWithNullContainer() {
		Queue<Process> container = null;
		
		PriorityQueueProcessor.extractMax(container);
	}
	
	/**
	 * Test for calling maximum on an empty container and
	 * expecting an exception
	 */
	@Test(expected=IllegalArgumentException.class)
	public void test_maximumWithEmptyContainer() {
		Queue<Process> container = new LinkedList<Process>();
		PriorityQueueProcessor.maximum(container);
	}
	
	/**
	 * Test for calling extractMax on an empty container
	 * and expecting an exception
	 */
	@Test(expected=IllegalArgumentException.class)
	public void test_extractMaxWithEmptyContainer() {
		Queue<Process> container = new LinkedList<Process>();
		PriorityQueueProcessor.extractMax(container);
	}
}

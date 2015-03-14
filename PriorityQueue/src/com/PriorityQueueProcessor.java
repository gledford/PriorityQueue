package com;

import java.util.Queue;

/**
 * 
 * @author Garry Ledford
 * 
 * This class performs operations on sets of objects that have a Priority.
 * This class will take the container of Process objects and perform an
 * insert, maximum and extractMax.
 *
 */
public class PriorityQueueProcessor {
	
	/**
	 * Constructor
	 */
	public PriorityQueueProcessor(){}
	
	/**
	 * Takes the container of process objects and inserts the input process
	 * into the container. Performs NULL checks on the input parameters.
	 * 
	 * @param process
	 * @param container
	 */
	public static void insert(Process process, Queue<Process> container) {
		checkForNullProcess(process);
		checkForNullContainer(container);
		
		container.add(process);		
	}
	
	/**
	 * Takes the container of process objects and finds the process with the
	 * highest priority and returns a that Process. Checks for NULL input 
	 * containers.
	 * 
	 * @param container
	 * @return
	 */
	public static Process maximum(Queue<Process> container) {
		checkForNullContainer(container);
		
		if( false == container.isEmpty()) {
			Process maxPriorityProcess = findMaximumPriorityProcess(container);
			return maxPriorityProcess;			
		} 
		else {
			throw new IllegalArgumentException("The input PriorityProcessContainer is empty.");
		}
	}
	
	/**
	 * Takes the container of process objects and find the process with the
	 * highest priority and returns that process while removing that process
	 * from the container.Checks for a NULL container.
	 * 
	 * @param container
	 * @return
	 */
	public static Process extractMax(Queue<Process> container) {
		checkForNullContainer(container);
		
		if( false == container.isEmpty() ) {
			Process maxPriorityProcess = findMaximumPriorityProcess(container);
			container.remove(maxPriorityProcess);
			return maxPriorityProcess;			
		}
		else {
			throw new IllegalArgumentException("The input PriorityProcessContainer is empty.");
		}
	}
	
	/**
	 * Determines if the input process is NULL and if so, throws an
	 * IllegalArgumentException.
	 * 
	 * @param _process
	 */
	private static void checkForNullProcess(Process _process) {
		if( _process == null ) {
			throw new IllegalArgumentException("Null input Process parameter.");
		}
	}
	
	/**
	 * Determines if the input container is NULL and if so, throws an
	 * IllegalArgumentException.
	 * 
	 * @param _container
	 */
	private static void checkForNullContainer(Queue<Process> _container) {
		if( _container == null ) {
			throw new IllegalArgumentException("Null input PriorityProcessContainer parameter.");
		}
	}
	
	/**
	 * Searches through the input container for the process that has the highest 
	 * priority value and returns that process.
	 * 
	 * @param _container
	 * @return
	 */
	private static Process findMaximumPriorityProcess(Queue<Process> _container)
	{
		Process processWithMaxPriority;
		processWithMaxPriority = _container.peek();
		for(Process process : _container) {
			if(process.getPriority().getValue() > processWithMaxPriority.getPriority().getValue()) {
				processWithMaxPriority = process;
			}
		}
		return processWithMaxPriority;
	}
}

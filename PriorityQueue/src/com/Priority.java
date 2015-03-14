package com;

/**
 * 
 * @author Garry Ledford
 * 
 * This class holds the priority value for a process.
 *
 */
public class Priority {

	/**
	 * The actual priority value
	 */
	private int mValue;
	
	/**
	 * Constructor that takes an integer priority value as a
	 * parameter which will set the priority value to the
	 * input priority
	 * 
	 * @param priority
	 */
	public Priority( int priority ){
		setValue( priority );
	}
	
	/**
	 * Returns the actual priority value
	 * 
	 * @return
	 */
	public int getValue() {
		return mValue;
	}
	
	/**
	 * Sets the private integer priority value
	 * @param value
	 */
	public void setValue( int value ) {
		mValue = value;
	}
}

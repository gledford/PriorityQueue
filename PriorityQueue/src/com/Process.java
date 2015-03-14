package com;

/**
 * 
 * @author Garry Ledford
 *
 * This class is a process which contains a name and a priority value.
 *
 */
public class Process {

	private String mName;
	private Priority mPriority;
	
	/**
	 * Constructor that takes a name and a priority as input
	 * parameters.
	 * 
	 * @param name
	 * @param priority
	 */
	public Process( String name, Priority priority ) {
		setName(name);
		setPriority(priority);
	}

	/**
	 * Returns the private priority value
	 * 
	 * @return
	 */
	public Priority getPriority() {
		return mPriority;
	}

	/**
	 * Sets the private priority value
	 * 
	 * @param priority
	 */
	public void setPriority(Priority priority) {
		this.mPriority = priority;
	}

	/**
	 * Returns the private name value
	 * 
	 * @return
	 */
	public String getName() {
		return mName;
	}

	/**
	 * Sets the private name value
	 * 
	 * @param name
	 */
	public void setName(String name) {
		this.mName = name;
	}
}

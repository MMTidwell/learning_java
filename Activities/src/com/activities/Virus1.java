package com.activities;

//Creating Class Methods and Variables
//This is the superparent class, but does not hold the main() method
public class Virus1 {
	// "static" creates the class variable. Class variables can change
		// and hold the new variable. In this case we will be using it
		// as a counter, each time it runs the number will change based
		// on the counter
	static int virusCount = 0;
	private int newSeconds = 0;
	
	// "public" makes it possible to modify/use the var/method from 
		// antoher program that is using this var/method
	public Virus1() {
		virusCount++;
		// System.out.println(virusCount);
	}
	
	// "static" creates the class method
	static int getVirusCount() {
		// "return" will give what is returned to the var/method that 
			// called it
		return virusCount;
	}
	
	int getNewSeconds() {
		return newSeconds;
	}
	
	boolean setNewSeconds(int newValue) {
		if ((newValue > 59) & (newValue < 101)) {
			newSeconds = newValue;
			return true;
		} else {
			return false;
		}
	}
}

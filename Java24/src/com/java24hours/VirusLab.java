// To run this program you must run configurations and enter a number argument 
package com.java24hours;

public class VirusLab {
	// main class, needed in order to run the program
	public static void main(String[] arguments) {
		// this will take the argument that is passed as a string and turn 
			// it into a int
		int numViruses = Integer.parseInt(arguments[0]);
		// checks to see if the numViruses is greater than 0
		if (numViruses > 0) {
			// an array of Virus objects is created with the numVirus variable
				// determining the number of objects int he array
			Virus[] virii = new Virus[numViruses];
			// for loop was created to call the constructor method for each 
				// Virus object in the array
			for (int i = 0; i < numViruses; i++) {
				// runs the Virus method inside of the Virus class
				virii[i] = new Virus();
			}
			// uses the method getVirusCount from the Virus class to display
				// the virus count
			System.out.println("There are " + Virus.getVirusCount() + " viruses.");
		}
	}
}

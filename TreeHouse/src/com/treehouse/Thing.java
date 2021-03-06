package com.treehouse;

public class Thing {
	public static final String ANSI_RESET = "\u001B[0m";
	public static final String ANSI_RED = "\u001B[31m";
	public static final String ANSI_GREEN = "\u001B[32m";
	
	// takes in a assumption on what we are going to explore
	public static void explore(String assumption, boolean result) {
		StringBuilder sb = new StringBuilder();
		if (result) {
			// appends results to the sb variable
			sb.append(String.format("%sYAY!%s", ANSI_GREEN, ANSI_RESET));
		} else {
			sb.append(String.format("%sWAT???!%s", ANSI_RED, ANSI_RESET));
		}
		sb.append("  ");
		sb.append(assumption);
		if (!result) {
			sb.append(" (Your assumption is incorrect)");
		}
		System.out.println(sb.toString());
	}
	
	public static void main(String[] args) {
		int firstNumber = 12;
		int secondNumber = 12;
		// calls the explore method and passes in the perams
		explore("Primitives use double equales", 
				firstNumber == secondNumber);
		
		Object firstObj = new Object();
		Object secondObj = new Object();
		Object sameObj = firstObj;
		explore("Objects references use double equals to check if they refer to "
				+ "the same obj in memory, seemingly equal obj are not equal.",
				firstObj == sameObj);
		
		String firstString = "Mitt";
		String secondString = "Mitt";
		explore("Strings are obj and work like obj",
				firstString == secondString);
		
	}
}

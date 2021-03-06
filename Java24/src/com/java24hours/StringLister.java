package com.java24hours;

// imports the superclass utilities, this will allow access to the Collections obj
import java.util.*;

public class StringLister {
	// basic string array
	String[] names = {"Spanky", "Alfalfa", "Buckwheat", "Daria", "Stymie", "Marianne",
			"Scotty", "Tommy", "Chubby"};
	
	// StringLister takes a command line arg
	public StringLister(String[] moreNames) {
		// ArrayList will then create an object named list
		ArrayList<String> list = new ArrayList<String>();
		// loops through the string array names and adds them to the new list object
		for (int i = 0; i < names.length; i++) {
			list.add(names[i]);
		}
		// loops through the command line arg adding them to the ArrayList
		for (int i = 0; i < moreNames.length; i++) {
			list.add(moreNames[i]);
		}
		// Sorts the arrayList in alpha order by using the Collections class
		Collections.sort(list);
		for (String name : list) {
			System.out.println(name);
		}
	}
	
	public static void main (String[] args) {
		StringLister lister = new StringLister(args);
	}
}

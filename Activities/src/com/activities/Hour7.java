package com.activities;

public class Hour7 {
	public static void main (String[] args) {
		String grade = "A";
		switch (grade) {
			case "A":
				System.out.println("You got an A. Awesome!");
				break;
			case "B":
				System.out.println("You got a B. Beautiful!");
				break;
			case "C": 
				System.out.println("You got a C. A bit concerning!");
				break;
			default:
				System.out.println("You got an F. You will do well in Congress!");
		}
		System.out.println("");
		gradeIf();
	}
		
	public static void gradeIf() {
		String grade = "B";
		if (grade == "A") {
			System.out.println("You got an A. Awesome!");
		} else if (grade == "B") {
			System.out.println("You got a B. Beautiful!");
		} else if (grade == "C") {
			System.out.println("You got a C. A bit concerning!");
		} else {
			System.out.println("You got an F. You will do well in Congress!");
		}
	}
}
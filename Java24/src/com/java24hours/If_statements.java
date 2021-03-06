package com.java24hours;

public class If_statements {
	public static void main(String[] args) {
		long account = -17_000_000_000_000L;
		
		if (account < 0) {
			System.out.println("Account overdrawn; you need a bailout.");			
		}
		if (account <= 0) {
			System.out.println("You are flat broke.");
		};
		System.out.println("");
		less_than_greater_than();
	}
	
	
	public static void less_than_greater_than() {
		int elephant_weight = 900;
		int elephant_total = 12;
		int cleaning_expense = 200;
		
		if (elephant_weight > 780) {
			System.out.println("Elephant too big for tightrope act");
		};
		if (elephant_total >= 12) {
			cleaning_expense = cleaning_expense + 150;
			System.out.println(cleaning_expense);
		};
		System.out.println("");
		euqal_not_equal();
	}
	
	
	public static void euqal_not_equal() {
		String answer = "D";
		String right_answer = "C";
		int sudent_grade = 90;
		
		if (answer == right_answer) {
			sudent_grade += 10;
		};
		if (sudent_grade == 100) {
			System.out.println("Great Job!");
		} else {
			System.out.println("Try again");
		};
		System.out.println("");
		game();
	}
	
	
	public static void game() {
		int total = 0;
		int score = 7;
		
		if (score == 7) {
			System.out.println("You score a touchdown!");
		} else if (score == 3) {
			System.out.println("You kicked a field goal!");
		} else {
			System.out.println("You did not score anything");
		}
		
		total += score;
		System.out.println("Total score: " + total);
		System.out.println("");
		switch_statement();
	}


	private static void switch_statement() {
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
		ternary();
	}


	private static void ternary() {
		int skillLevel = 6;
		int skillLevel2 = 4;
		
//		(variable size check) ? true : false;
		int numberOfEnemies = (skillLevel > 5) ? 20 : 10;
		int numEnemies = (skillLevel2 > 5) ? 20 : 10;
		
		System.out.println(numberOfEnemies);
		System.out.println(numEnemies);
		System.out.println("");
	}
}

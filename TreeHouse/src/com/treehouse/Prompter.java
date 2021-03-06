package com.treehouse;

import java.util.Scanner;

// Prompter Class is used for all the I/O (input/output)
public class Prompter {
	private Game game;
	
	// constructor
	public Prompter(Game game) {
		this.game = game;
	}
	
	// prompt for guess
	public boolean promptForGuess() {
		// scanner will allow us to read a line from the console
		Scanner scanner = new Scanner(System.in);
		
		boolean isHit = false;
		boolean isAcceptable = false;
		
		do {
			System.out.print("Enter a letter:  ");
			// nextLine is a scanner helper method, which allows us to read the next line
			String guessInput = scanner.nextLine();
			// gets the first char
//			char guess = guessInput.charAt(0);
			
			// try/catch block used to check if the letter has already been used
			try {
				isHit = game.applyGuess(guessInput);
				isAcceptable = true;
			} catch (IllegalArgumentException iae) {
				System.out.printf("Please try again, " + iae.getMessage());
			}
			return isHit;
		} while (!isAcceptable);
	}
	
	// displays the current progress
	public void displayProgress() {
		System.out.printf(" You have %d tries left to solve:  %s%n", 
				game.getRemainingTries(), 
				game.getCurrentProgress());
	}
	
	public void displayOutcome() {
		if (game.isWon()) {
			System.out.printf("You won! And had %d tries remaining.%n", 
					game.getRemainingTries());
		} else {
			System.out.printf("Bummer the word was %s!%n", game.getAnswer());
		}
	}
}

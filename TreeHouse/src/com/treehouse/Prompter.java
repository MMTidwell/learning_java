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
		System.out.print("Enter a letter:  ");
		// nextLine is a scanner helper method, which allows us to read the next line
		String guessInput = scanner.nextLine();
		// gets the first char
		char guess = guessInput.charAt(0);
		return game.applyGuess(guess);
	}
	
	// displays the current progress
	public void displayProgress() {
		System.out.printf("You have %d tries left to solve:  %s%n", 
				game.getRemainingTries(), 
				game.getCurrentProgress());
	}
}
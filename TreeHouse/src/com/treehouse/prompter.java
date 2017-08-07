//DEALS WITH THE IO

package com.treehouse;

import java.util.Scanner;

public class prompter {
	// creates new game object
	private game game;
	
	// constructor 
	public prompter(game game) {
		this.game = game;
	}
	

	public boolean promptForGuess() {
		// calls the scanner method from util
		Scanner scanner = new Scanner(System.in);
		boolean isHit = false;
		boolean isAcceptable = false;
		
		// 
		do {
			// asks for input from the user
			System.out.println("Enter a letter");
			// gets the input from the user
			String guessInput = scanner.nextLine();
			
			// returns the guess
			try {
				isHit = game.applyGuess(guessInput);
				isAcceptable = true;
			} catch (IllegalArgumentException iae) {
				System.out.printf("%s.   Please try agian.   %n", iae.getMessage());
			}
		} while (! isAcceptable);
		return isHit;
	}
	
	// shows the user how many tires they have left, by using methods from the game class	
	public void displayProgress() {
		System.out.printf("You have %d tries left to solve: %s%n", 
						   game.getRemainingTries(), 
						   game.getCurrentProgress());
	}
	
	// results of the game
	public void displayOutcome() {
		// win
		if (game.isWon()) {
			System.out.printf("You won with %s tries remaining. The word was %s!", 
								game.getRemainingTries(),
								game.getAnswer());
		// loss
		} else {
			System.out.printf("Bummer the word was %s.   :( %n", game.getAnswer());
		}
	}
}

















package com.treehouse;

// Hangman Class is the main java file
public class Hangman {
	public static void main(String[] args) {
		// makes sure that someone passes in a value when the program is called
			// this will need to be done via Run Configurations>Args tab>secret 
			// word passed in as a arg. 
		if (args.length == 0) {
			// warning
			System.out.println("Usage:  java Hangman <answer>");
			// sends error message
			System.err.println("answer is required");
			// exists out of system
			System.exit(1);
		}
		
		// create instance of Game class, passing in the answer as the parameter
		Game game = new Game(args[0]);
		Prompter prompter = new Prompter(game);
		
		while (game.getRemainingTries() > 0 && !game.isWon()) {
			// uses the disolayProgress method from the Prompter class
			prompter.displayProgress();
			prompter.promptForGuess();
		}
		prompter.displayOutcome();
		
		
		// boolean created in order to run if statement bellow
//		boolean isHit = prompter.promptForGuess();
//		if (isHit) {
//			System.out.println("We got a hit!");
//		} else {
//			System.out.println("Opps we missed!");
//		}
	}
}

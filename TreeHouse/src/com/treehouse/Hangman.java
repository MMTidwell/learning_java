package com.treehouse;

// Hangman Class is the main java file
public class Hangman {
	public static void main(String[] args) {
		// create instance of Game class, passing in the answer as the parameter
		Game game = new Game("treehouse");
		Prompter prompter = new Prompter(game);
		
		while (game.getRemainingTries() > 0) {
			// uses the disolayProgress method from the Prompter class
			prompter.displayProgress();
			prompter.promptForGuess();
		}
		
		
		// boolean created in order to run if statement bellow
//		boolean isHit = prompter.promptForGuess();
//		if (isHit) {
//			System.out.println("We got a hit!");
//		} else {
//			System.out.println("Opps we missed!");
//		}
	}
}
package com.treehouse;

// Game Class is used for game logic
public class Game {
	public static final int MAX_MISSES = 7;
	private String answer;
	private String hits;
	private String misses;
	
	// constructor
	public Game(String answer) {
		this.answer = answer;
		hits = "";
		misses = "";
	}
	
	// checks to see if guessed letter is in the answer
	public boolean applyGuess(char letter) {
		// Checks to see if the guess has already been guessed
		if (misses.indexOf(letter) != -1 || hits.indexOf(letter) != -1) {
			throw new IllegalArgumentException(letter +  " has already been guessed.");
		}
		
		// boolean created to use in if statment bellow
		boolean isHit = answer.indexOf(letter) != -1;
		if (isHit) {
			hits += letter;
		} else {
			misses += letter;
		}
		return isHit;
	}
	
	// displays the current progress
	public String getCurrentProgress() {
		String progress = "";
		for (char letter : answer.toCharArray()) {
			char display = '_';
			if (hits.indexOf(letter) != -1) {
				display = letter;
			}
			progress += display;
		}
		return progress;
	}
	
	// How many tries are left??
	public int getRemainingTries() {
		return MAX_MISSES - misses.length();
	}
}











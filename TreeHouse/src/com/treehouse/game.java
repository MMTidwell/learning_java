//MAINTAINS THE LOGIC

package com.treehouse;

public class game {
	// define each string
	private String answer;
	private String hits;
	private String misses;
	public static final int MAX_MISSES = 7;
	
	// constructor 
	public game(String answer) {
		this.answer = answer.toLowerCase();
		hits = "";
		misses = "";
	}

	// Takes a char and returns a char
	// Is a good way to create common functionality and not clutter up methods
	private char normalizedGuess(char letter) {
		if (! Character.isLetter(letter)) {
			throw new IllegalArgumentException("A letter is required.");
		}
		
		letter = Character.toLowerCase(letter);
		
		if (misses.indexOf(letter) != -1 || hits.indexOf(letter) != -1) {
			throw new IllegalArgumentException(letter + " has already been guessed");
		}
		return letter;
	}
	
	public boolean applyGuess(String letters) {
		if (letters.length() == 0) {
			throw new IllegalArgumentException("No letter found.");
		}
		return applyGuess(letters.charAt(0));
	}
	
	public boolean applyGuess(char letter) {
		// check to see if guess have already been used
		letter = normalizedGuess(letter);
		// checks to see if the guess is in the answer
		boolean isHit = answer.indexOf(letter) != -1;
		if (isHit) {
			hits += letter;
		} else {
			misses += letter;
		}
		return isHit;
	}
	
	// returns _ for unguessed letters
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
	
	// provides the number for tries
	public int getRemainingTries() {
		return MAX_MISSES - misses.length();
	}
	
	// lets the game know if it won or not
	public boolean isWon() {
		return getCurrentProgress().indexOf('_') == -1;
	}
	
	// returns the answer
	public String getAnswer() {
		return answer;
	}
}














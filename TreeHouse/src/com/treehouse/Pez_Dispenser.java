package com.treehouse;

public class Pez_Dispenser {
	// if we set this variable to "private" then we can not change the value of the variable
	// final will not allow the value of the variable to be changed
	final private String characterName;
	
	public Pez_Dispenser(String characterName) {
		this.characterName = characterName;
	}
	
	// This will allow access to the characterName String
	public String getTheCharacterName() {
		return characterName;
	}
}
/*
 * We are building a tweet counter. Here are some things that we will need to consider
 * 		- Author
 * 		- When it was posted
 * 		- Description
 * 		- Most popular hashtag used (#)
 * 		- Who was mentioned (@)
 * 		- Who tweeted the most
 */

package com.teamtreehouse;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.io.Serializable;


// implements Comparable - make it to where you can compare 2 or more objects
// Serializable - takes a obj and storing its rep in a state that can be loaded
// <Treet> - is used to specify what will be compared 
public class Treet implements Comparable<Treet>, Serializable {
	// declaring the private variables that are listed above
	private String mAuthor;
	private String mDescription;
	private Date mCreationDate;
	
	// constructor
	public Treet(String author, String description, Date creationDate) {
		mAuthor = author;
		mDescription = description;
		mCreationDate = creationDate;
	}
	
	// Override will tell the compiler that we are intending to 
		// override the method
	@Override
	// returns a string representation of the obj
	public String toString() {
		return String.format("Treet:  \"%s\" by %s on %s\n\n", 
				mDescription, mAuthor, mCreationDate);
	}
	
	@Override
	public int compareTo(Treet other) {
		if (equals(other)) {
			return 0;
		}
		int dateCmp = mCreationDate.compareTo(other.mCreationDate);
		if (dateCmp == 0) {
			return mDescription.compareTo(other.mDescription);
		}
		return dateCmp;
	}
	
	// creating the getters for author, description, and creationDate
	// we are not creating setters with these in order to make them immutable
	public String getAuthor() {
		return mAuthor;
	}
	
	public String getDiscription() {
		return mDescription;
	}
	
	public Date getDate() {
		return mCreationDate;
	}
	
	// takes the string mDiscription, changes to lower case, then splits it based 
		// on the regex passed in
	public List<String> getWords() {
		String[] words = mDescription.toLowerCase().split("[^\\w#@']+");
		return Arrays.asList(words);
	}
	
	// Using the helper method bellow to create list
	public List<String> getHashTags() {
		return getWordsPrefixedWith("#");
	}
	
	public List<String> getMentions() {
		return getWordsPrefixedWith("@");
	}
	
	// Creating a list and storing it into results ArrayList
	private List<String> getWordsPrefixedWith(String prefix) {
		List<String> results = new ArrayList<String>();
		for (String word : getWords()) {
			if (word.startsWith(prefix)) {
				results.add(word);
			}
		}
		return results;
	} 
}












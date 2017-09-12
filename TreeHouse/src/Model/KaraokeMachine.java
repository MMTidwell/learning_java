/*
 * Creates the UI for Karaoke
 * 
 * Here is a list of videos:
 * Deftones Passenger - https://www.youtube.com/watch?v=Um7ySTHsCf0
 * Third Eye Blind - Mine - https://www.youtube.com/watch?v=HdcX5AwAEK8
 * A Perfect Circle - Weak and Powerless - https://www.youtube.com/watch?v=s-GsLh6dazI
 * Puscifer - Conditions of my Parole - https://www.youtube.com/watch?v=7E-_J5WWkoc
 */
package Model;

import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.List;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Queue;

public class KaraokeMachine {	
	private SongBook mSongBook;
	private BufferedReader mReader;
	private Queue<Song> mSongQueue;
	private Map<String, String> mMenu;

	// constructor 
	public KaraokeMachine(SongBook songBook) {
		mSongBook = songBook;
		// this is going to read from the console
		mReader = new BufferedReader(new InputStreamReader(System.in));
		mSongQueue = new ArrayDeque<Song>();
		mMenu = new HashMap<String, String>();
		
		// adds to the mMenu variable
		mMenu.put("add", "Add a new song to the song book.");
		mMenu.put("play", "Play for next song.");
		mMenu.put("choose", "Choose a song to sing!");
		mMenu.put("quit", "Give up. Exit the program.");
	}
	
	public void run() {
		// loops until we get the value that we want
		String choice = "";
		do {
			try {
				choice = promptAction();
				switch (choice) {
					case "add" :
						Song song = promptNewSong();
						mSongBook.addSong(song);
						System.out.printf("%s added! %n%n", song);
						break;
					case "choose" :
						String artist = promptArtist();
						Song artistSong = promptSongForArtist(artist);
						mSongQueue.add(artistSong);
						System.out.printf("You chose: %s%n", artistSong);
						break;
					case "play" :
						playNext();
						break;
					case "quit" :
						System.out.println("Thanks for playing!");
						break;
					default :
						System.out.printf("Unknown choice: %s, Try again %n%n%n", choice);
					}
			} catch (IOException ioe){
				System.out.println("Problem with input");
				ioe.printStackTrace();
			}
		} while (!choice.equals("quit"));
	}
	
	// gets the artist
	private String promptArtist() throws IOException {
		System.out.println("Available artists: ");
		List<String> artists = new ArrayList<>(mSongBook.getArtist());
		int index = promptForIndex(artists);
		return artists.get(index);
	}
	
	/*
	 * thows IOException - is taking place of the try/catch portion of the method
	 * This ability is added in via import java.io.IOException
	 */
	private String promptAction() throws IOException {
		System.out.printf("There are %d songs available and %d in the queue. %n Your options are: %n",
				mSongBook.getSongCount(),
				mSongQueue.size());
		// loops through the mMenu variable, prints out each key/value pairs
		for (Map.Entry<String, String> option : mMenu.entrySet()) {
			System.out.printf("%s - %s %n",
					option.getKey(),
					option.getValue());
		}
		// speaks to the user and attempts to get a answer via command line
		System.out.println("What do you want to do:  ");
		String choice = mReader.readLine();
		return choice.trim().toLowerCase();
	}
	
	// Prompt to add new song
	private Song promptNewSong() throws IOException {
		System.out.println("Enter the artist's name:  ");
		String artist = mReader.readLine();
		
		System.out.println("Enter the title:  ");
		String song = mReader.readLine();
		
		System.out.println("Enter the URL of the song:  ");
		String videoUrl = mReader.readLine();
		return new Song(artist, song, videoUrl);
	}
	
	// prompt for song for artist
	private Song promptSongForArtist(String artist) throws IOException {
		List<Song> songs = mSongBook.getSongsForArtist(artist);
		List<String> songTitles = new ArrayList<>();
		for (Song song:songs) {
			songTitles.add(song.getTitle());
		}
		System.out.printf("Available songs for %s: %n", artist);
		int index = promptForIndex(songTitles);
		return songs.get(index);
	}
	
	// Display a list of numbered items 
	private int promptForIndex(List<String> options) throws IOException{
		int counter = 1;
		for (String option:options) {
			System.out.printf("%d.)  %s%n", counter, option);
			counter++;
		}
		System.out.println("Your choice:  ");
		String optionAsString = mReader.readLine();
		int choice = Integer.parseInt(optionAsString.trim());
		return choice - 1;
	}
	
	//
	public void playNext() {
		Song song = mSongQueue.poll();
		if (song == null) {
			System.out.println("Sorry there are no songs on the queue. Use choose from the menu to add some!");
		} else {
			System.out.printf("%n%n%n Open %s to hear %s by %s %n%n%n",
					song.getVideoUrl(),
					song.getTitle(),
					song.getArtist());
		}
	}
	
}






















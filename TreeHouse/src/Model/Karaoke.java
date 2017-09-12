package Model;

public class Karaoke {
	public static void main(String[] args) {
		// creates and adds a new song
		Song song = new Song("Deftones", "Passenger", "https://www.youtube.com/watch?v=KS0wIduy8yY");
		// creates new songBook
		SongBook songBook = new SongBook();
		System.out.printf("Adding %s%n", song);
		// adds the song to the songBook
		songBook.addSong(song);
		System.out.printf("There are %d songs.%n", songBook.getSongCount());
	}
}

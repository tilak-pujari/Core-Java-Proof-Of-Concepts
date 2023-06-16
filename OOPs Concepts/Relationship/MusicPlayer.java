package Relationship;

public class MusicPlayer {
	String company;
	int noOfSongs;
	boolean on = true;

	MusicPlayer(String company, int noOfSongs, boolean on) {
		this.company = company;
		this.noOfSongs = noOfSongs;
		this.on = on;
	}

	public void Print() {
		System.out.println(company + " Music Player has " + noOfSongs
				+ " Songs\nStatus of Music Player is On=" + on);
	}

}

package Assesmentpack;

public class Main {
	public static void main(String[] args) {
	    RecentlyPlayedStore store = new RecentlyPlayedStore(3);

	    store.addSong("user1", "S1");
	    store.addSong("user1", "S2");
	    store.addSong("user1", "S3");

	    System.out.println("The playlist would look like -> " + store.getRecentlyPlayed("user1"));

	    store.addSong("user1", "S4");

	    System.out.println("When S4 song is played -> " + store.getRecentlyPlayed("user1"));

	    store.addSong("user1", "S2");

	    System.out.println("When S2 song is played -> " + store.getRecentlyPlayed("user1"));

	    store.addSong("user1", "S1");

	    System.out.println("When S1 song is played -> " + store.getRecentlyPlayed("user1"));
	}
}

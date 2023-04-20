package Assesmentpack;

import java.util.*;

public class RecentlyPlayedStore {
    private final int capacity;
    private final Map<String, LinkedList<String>> userToSongs;

    public RecentlyPlayedStore(int capacity) {
        this.capacity = capacity;
        userToSongs = new HashMap<>();
    }

    public void addSong(String user, String song) {
        LinkedList<String> songs = userToSongs.computeIfAbsent(user, k -> new LinkedList<>());
        if (songs.contains(song)) {
            songs.remove(song);
        }
        songs.addFirst(song);
        if (songs.size() > capacity) {
            songs.removeLast();
        }
    }

    public List<String> getRecentlyPlayed(String user) {
        LinkedList<String> songs = userToSongs.getOrDefault(user, new LinkedList<>());
        return new ArrayList<>(songs);
    }
}

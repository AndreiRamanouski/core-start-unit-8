package task46;

import java.util.LinkedList;
import java.util.List;

public class Album {
    private String name;
    private String artist;
    private List<Song> songs;

    public Album(String name, String artist, List<Song> songs) {
        this.name = name;
        this.artist = artist;
        this.songs = songs;
    }

    public boolean addSong(String name, double duration) {
        boolean returnedValue = true;
        for (Song song : songs) {
            if (song.getTitle().equals(name)) {
                returnedValue = false;
            }
        }
        if (returnedValue) {
            returnedValue = songs.add(new Song(name, duration));
        }
        return returnedValue;
    }

    public Song findSong(String name) {
        Song returnedValue = null;
        for (Song song : songs) {
            if (song.getTitle().equals(name)) {
                returnedValue = song;
            }
        }
        return returnedValue;
    }

    public boolean addToPlaylist(int numberOfSong, LinkedList<Song> songLinkedList) {
        boolean returnedValue = false;
        if (songs.size() > numberOfSong && numberOfSong != 0) {
            songLinkedList.add(songs.get(numberOfSong));
            returnedValue = true;
        }
        return returnedValue;

    }

    public boolean addToPlaylist(String nameOfSong, LinkedList<Song> songLinkedList) {
        boolean returnedValue = false;
        for (Song song : songs){
            if(song.getTitle().equals(nameOfSong)){
                songLinkedList.add(song);
                returnedValue = true;
            }
        }
        return returnedValue;
    }

}

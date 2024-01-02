package Challenge.playListChallenge;

import java.util.ArrayList;
import java.util.LinkedList;

public class Album {
    // write code here
    private String name;
    private String artist;
    private ArrayList<Song> songs;

    public Album(String name, String artist){
        this.name=name;
        this.artist=artist;
        songs = new ArrayList<Song>();
    }

    private Song findSong(String songName){
        for(var song : songs){
            if(song.getTitle().equals(songName)){
                return song;
            }
        }

        return null;
    }

    public boolean addSong(String title, double duration){
        if(findSong(title) == null){
            songs.add(new Song(title, duration));
            return true;
        }

        return false;
    }

    public boolean addToPlayList(String title, LinkedList<Song> playList){
        Song checkedSong = findSong(title);
        if(checkedSong!=null){
            playList.push(checkedSong);
            return true;
        }

        return false;
    }

    public boolean addToPlayList(int trackNumber, LinkedList<Song> playList){
        int index = trackNumber-1;
        if(index>=0 && index<=songs.size()){
            playList.add(songs.get(index));
            return true;
        }

        return false;

    }
}
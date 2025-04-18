package Playlist;

import Music.Music;

import java.util.ArrayList;

public class Playlist {
    private String title;
    private ArrayList<Music> playList = new ArrayList<Music>();
    private User owner;
    //methods
    public void editTitle(String title){
        this.title = title;
    }
    public void addMusic(Music music){
        if (playList.contains(music)) {
            throw new InvalidOperationException("this music already exists in your playlist");
        }
        playList.add(music);

    }
    public void removeMusic(Music music){

    }

}

package Playlist;

import Music.Music;
import Validators.PasswordValidator;

import java.util.ArrayList;

public class Playlist {
    private String title;
    private ArrayList<Music> playList = new ArrayList<Music>();
    private User owner;
    //methods
    public void editTitle(String title){
        this.title = title;
    }
    public void addMusic(Music music , String password) {
        if (PasswordValidator.PasswordValidator(password, this)) {
            if (playList.contains(music)) {
                throw new InvalidOperationException("this music already exists in your playlist");
            }
            playList.add(music);

        }else throw new InvalidOperationException("your password is incorrect , try again");
    }
    public void removeMusic (Music music){

    }

}

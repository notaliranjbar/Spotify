package Playlist;

import Music.Music;
import Validators.PasswordValidator;

import java.util.ArrayList;

public class Playlist {
    private String title;
    private ArrayList<Music> playList = new ArrayList<Music>();
    private User owner;
    //methods


    public void editTitle(String title , String password){
        if(PasswordValidator.PasswordValidator(password, this)) this.title = title;
        else throw new InvalidOperationException("your password is incorrect , try again");
    }
    public void addMusic(Music music , String password) {
        if (PasswordValidator.PasswordValidator(password, this)) {
            if (playList.contains(music)) {
                throw new InvalidOperationException("this music already exists in your playlist");
            }
            playList.add(music);

        }else throw new InvalidOperationException("your password is incorrect , try again");
    }
    public void removeMusic (Music music , string password){
        if(!(playList.contains(music))) throw new InvalidOperationException("this music doesnt exist on your playlist");
        if(PasswordValidator.PasswordValidator(password , this)) playList.remove(music);
        else throw new InvalidOperationException("your password is incorrect , try again");
    }
    //getters
    public String getTitle(){
        return title;
    }
    public ArrayList<Music> getPlayList(){
        return playList;
    }
    public User getOwner(){
        return owner;
    }


}

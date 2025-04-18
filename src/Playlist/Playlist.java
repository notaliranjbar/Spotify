package Playlist;

import Exceptions.InvalidOperationException;
import Music.Music;
import User.User;
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
    public void removeMusic (Music music , String password){
        if(!(playList.contains(music))) throw new InvalidOperationException("this music doesnt exist on your playlist");
        if(PasswordValidator.PasswordValidator(password , this)) playList.remove(music);
        else throw new InvalidOperationException("your password is incorrect , try again");
    }
    public ArrayList<Music> searchInPlayList(String title){
        ArrayList<Music> resultMusics = new ArrayList<Music>;
        for(Music music : playList){
            if(music.getTitle().equals(title)) resultMusics.add(music);
        }
        if(!(resultMusics.isEmpty())) return resultMusics;
        else return null;
    }
    public Music searchInPlayList(String title , String singerName){
        for(Music music : playList){
            if(music.getTitle().equals(title) && music.getSinger().getUsername().equals(singerName)) return music;
        }
        return null;
    }
    public void playPlayList(){
        for (Music music : playList){
            music.play();
        }
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

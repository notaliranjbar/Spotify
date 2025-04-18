package Behaviors;

import Exceptions.InvalidOperationException;
import Music.Music;

public class RegularBehavior implements UserBehavior {
    private int playinglimit;

    //constructor
    public void RegularBehavior(){
        this.playinglimit = 5;
    }
    //getter
    public int getPlayingLimit(){
        return this.playinglimit;
    }
    //methods
    @Override
    public void creatPlaylist(String title , User owner){
        throw new InvalidOperationException("you have to but premium to create a playlist");
    }

    @Override
    public void playMusic(Music music){
        if(music == null)throw new InvalidOperationException("choose a music to play");
        if (this.playinglimit == 0) throw new InvalidOperationException("music playing limit is reached");
        music.play();
        this.playinglimit--;
        System.out.println(music.getTitle() + "is playing");
    }

}

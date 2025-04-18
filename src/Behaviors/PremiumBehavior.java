package Behaviors;

import Exceptions.InvalidOperationException;
import Music.Music;
import Playlist.Playlist;
import User.User;

public class PremiumBehavior implements UserBehavior {
    private int month;
    // getter
    public int getMonth() {
        return month;
    }
    //setter
    public void setMonth(int month) {
        this.month = month;
    }
    //constructor
    public PremiumBehavior(int month){
        this.setMonth(month);
    }
    @Override
    public void buyPremium(User owner , int month){
        if(owner == null) throw new InvalidOperationException("select owner to buy");
        this.month += month;
    }
    @Override
    public void createPlaylist(String Title , User owner){
        if (owner == null) throw new InvalidOperationException("select owner to make playlist");
        Playlist playlist = new Playlist(Title , owner);
        owner.addPlaylist(playlist);

    }
    @Override
    public void playMusic(Music music){
        music.play();
    }

}

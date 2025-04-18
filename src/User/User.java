package User;

import Behaviors.RegularBehavior;
import Behaviors.UserBehavior;
import Exceptions.InvalidOperationException;
import Music.Music;
import Playlist.Playlist;

import java.util.ArrayList;

public class User {
    private String username;
    private static ArrayList<User> allUsers = new ArrayList<User>();
    private String password;


    ArrayList<User> followingList = new ArrayList<User>();
    ArrayList<User> followerList = new ArrayList<User>();


    ArrayList<Playlist> Playlists = new ArrayList<Playlist>();
    private UserBehavior userBehavior;



    //constructor
    public User(String username, String password){
        this.username = username;
        this.password = password;
        this.userBehavior = new RegularBehavior();
        if(allUsers.contains(this)) throw new InvalidOperationException("this Username is token");
        if(password.length() < 8) throw new InvalidOperationException("pass word length must be at least 8");
        allUsers.add(this);
    }
    //methods
    public void follow(User user){
        if(followingList.contains(user)) throw new InvalidOperationException("you already follow this User");
        if(!(allUsers.contains(user))) throw new InvalidOperationException("this user does not exist");

        this.followingList.add(user);
        user.followerList.add(this);
    }


    public void createPlayList(String Title){
        userBehavior.createPlaylist(Title , this);
    }


    public void PlayMusic(Music music){
        userBehavior.playMusic(music);
    }


    public void buyPremium(int month){
        userBehavior.buyPremium(this, month);
    }

    //setters
    public void setUsername(String username){
        for(User user : allUsers){
            if(user.username.equals(username))throw new InvalidOperationException("username already exists");
        }
        this.username = username;
    }
    public void setPassword(String password){
        if(password.length() < 8) throw new InvalidOperationException("password length must be at least 8");
        this.password = password;
    }
    public void setBehavior(UserBehavior userBehavior){
        if(userBehavior == null) throw new InvalidOperationException("userBehavior cannot be null");
        this.userBehavior = userBehavior;
    }
    public void addPlaylist(Playlist playlist){
        if (Playlists == null) throw new InvalidOperationException("Playlists doesnt exist");
        if (Playlists.contains(playlist)) throw new InvalidOperationException("playlist already exists");
        if(userBehavior instanceof RegularBehavior){throw new InvalidOperationException("buy premium to add playlist");}
        Playlists.add(playlist);
    }

    //getters
    public String getUsername(){
        return username;
    }

    public ArrayList<User> getAllUsers(){
        return allUsers;
    }

    public String getPassword(){
        return password;
    }

    public ArrayList<User> getFollowingList(){
        return followingList;
    }

    public ArrayList<User> getFollowerList(){
        return followerList;
    }

    public UserBehavior getUserBehavior(){
        return userBehavior;
    }
    public ArrayList<Playlist> getPlaylists(){
        return Playlists;
    }

}

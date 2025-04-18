package User;

import Behaviors.UserBehavior;

import java.util.ArrayList;

public class User {
    private String username;
    private static ArrayList<String> allUsers = new ArrayList<String>();
    private String password;
    ArrayList<User> followingList = new ArrayList<User>();
    ArrayList<User> followerList = new ArrayList<User>();
    private UserBehavior userBehavior;

    //getters
    public String getUsername(){
        return username;
    }
    public ArrayList<String> getAllUsers(){
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

}

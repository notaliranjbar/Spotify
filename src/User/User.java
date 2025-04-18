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


}

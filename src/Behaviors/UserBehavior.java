package Behaviors;

import Music.Music;
import User.User;

public interface UserBehavior {
    void createPlaylist (String Title, User Owner);
    void playMusic (Music music);
    void buyPremium (User owner, int month);
}
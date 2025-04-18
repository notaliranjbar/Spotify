package Behaviors;

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
}

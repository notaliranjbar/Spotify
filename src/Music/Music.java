package Music;

import java.util.ArrayList;

public class Music {
    private String title;
    private User singer;
    private int numberofStreams;
    public static ArrayList<Music> allMusics = new ArrayList<Music>();
    //constructor
    public void Music(String title , User singer){
        for(Music music : allMusics){
            if(music.title.equals(title) , music.singer.equals(singer)){
                throw new InvalidOperationException("this Music already exists..");
            }
        }
        this.singer = singer;
        this.title = title;
         allMusics.add(this);
    }
    //getters
    public ArrayList<Music> getMusics(){
        return allMusics;
    }
    public String getTitle(){
        return title;
    }
    public User getSinger(){
        return singer;
    }
    public int getNumberofStreams(){
        return numberofStreams;
    }
    //setters
    public void setTitle(String title){
        this.title = title;
    }
    public void setSinger(User singer){
        this.singer = singer;
    }
    //methods
    public void play(){
        System.out.println("song:" + title +"\nartist:" + singer.username + "is now playing");
        this.numberofStreams++;

    }
    public ArrayList<Music> search(String title){
        ArrayList<Music> resultMusics = new ArrayList<Music>();
        for(Music music : allMusics){
            if(music.title.equals(title)){
                resultMusics.add(music);
            }

        }
        if(!resultMusics.isEmpty())
        return resultMusics;
        else return null;
    }
}

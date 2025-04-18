package Music;

import java.util.ArrayList;

public class Music {
    public String title;
    public User singer;
    int numberofStreams;
    public static ArrayList<Music> allMusics = new ArrayList<Music>();
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
    public void play(){
        System.out.println("song:" + title +"\nartist:" + singer.username + "is now playing");
        this.numberofStreams++;

    }
    public void search(String title){

    }
}

package ru.shonin.music;

import java.util.ArrayList;
import java.util.List;

public class Album {
    String title;
    String author;
    List <MusicTrack> tracks;
    

    public Album(String title){
        this.title = title;
        tracks = new ArrayList<MusicTrack>();
    }
    public Album(String title,String author){
        this(title);
        this.author = author;
    }

    public void addTrack(MusicTrack track){
        tracks.add(track);
    }
    
    public String getTitle (){
        return title;
    }
    
    public String getAuthor(){
        return author;
    }
    
    @Override
    public String toString(){
        String tempStr = "Альбом: " + title + " Автор: " + author + "\n";
        for(MusicTrack track : tracks){
            if (track != null){
                tempStr +=  "-" + track.title + "\n";
            }
        }
        return tempStr;
    }
}


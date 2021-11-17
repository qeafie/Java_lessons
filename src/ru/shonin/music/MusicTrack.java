package ru.shonin.music;

public class MusicTrack {
    String title;
    String author;
    Album album;

    public MusicTrack(String title) {
        this.title = title;
    }

    public MusicTrack(String title, String author) {
        this(title);
        this.author = author;
    }

    public MusicTrack(String title, String author, Album album) {
        this(title,author);
        this.album = album;
    }

    public String toString(){
        String temp;
        if (author == null){
            author = album.author;
            temp = "Автор: " + author;
        }
        else {
            temp = "Авторы: " + author + " " + album.author;
        }
        return "Название: " + title + " / " + temp;
    }
}
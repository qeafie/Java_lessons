public class Album {
    String title;
    String author;
    MusicTrack[] tracks;
    int countMusicTrack;

    public Album(String title){
        this.title = title;
        tracks = new MusicTrack[10];
        countMusicTrack = 0;
    }
    public Album(String title,String author){
        this(title);
        this.author = author;
    }

    public void addTrack(MusicTrack track){
        tracks[countMusicTrack++] = track;
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


package dashboard.music_player;

import java.util.ArrayList;
public class MusicSystem {
    public ArrayList<Song>songsList = new ArrayList<>();
    int songPointer = 0;
    private int volume = 30;
    public void playSong(){
        System.out.println();
    }

    public void increaseVolume(){
        volume++;
    }
    public void  decreaseVolume(){
        volume--;
    }
    public void playNextSong(){
        songPointer++;
        playSong();
    }

    public void playPreviousSong(){
        songPointer--;
        playSong();
    }
    public void addSong(Song song){}

    public ArrayList<Song> getSongsList() {
        return songsList;
    }

    public void setSongsList(ArrayList<Song> songsList) {
        this.songsList = songsList;
    }
}
class Song {
    private String songName;
    private String authorName;
    private String movieName;
    private int duration;

    Song(String songName, String authorName, String movieName, int duration) {
        this.songName = songName;
        this.authorName = authorName;
        this.movieName = movieName;
        this.duration = duration;
    }

    @Override
    public String toString() {
        return songName + " " + authorName + " " + movieName + " " + duration;
    }

}
//class Radio{
//    Radio obj;
//
//
//    //SINGLETON
//    private Radio(){
//
//    }
//
//    public Radio getRadioObject(){
//        if(obj == null){
//            obj = new Radio();
//        }
//
//        return obj;
//    }
//}

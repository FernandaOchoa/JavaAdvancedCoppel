package javaadvancedoctubre.Jueves;

import sun.audio.AudioPlayer;
import sun.audio.AudioStream;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * Created by monsh on 19/10/2017.
 */
public class Hola {
    String song;
    
    public void PlayMusic(String song) throws IOException {
        this.song = song;
        InputStream in = new FileInputStream(song);
        AudioStream as = new AudioStream(in);
        
        AudioPlayer.player.start(as);
    }
}

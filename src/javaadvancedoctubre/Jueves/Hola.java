package javaadvancedoctubre.Jueves;

import javaadvancedoctubre.Jueves.ejemplo.interfaces.PlayMusic;
import sun.audio.AudioPlayer;
import sun.audio.AudioStream;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * Created by monsh on 19/10/2017.
 */
public class Hola implements PlayMusic{
    String song;

    @Override
    public void PlayMusic(String song) {
        this.song = song;
        try{
        InputStream in = new FileInputStream(song);
        AudioStream as = new AudioStream(in);
        
        AudioPlayer.player.start(as);
        }catch(IOException ioe){
            ioe.printStackTrace();
        }
    }

   
}

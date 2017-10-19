package javaadvancedoctubre.Jueves.ejemplo;

import javaadvancedoctubre.Jueves.ejemplo.clases.Audio;

public class Main {
   
    public static void main(String[] args) {
        Song("onlyone.wav");
    }

    private static void Song (String song) {
        Thread audio = new Thread(){
            public void run(){
                Audio justin = new Audio();
                justin.PlayMusic(song);
            }
        };
        audio.start();
    }
    
}

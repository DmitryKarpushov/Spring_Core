package org.example.Spring_Core;

/**
 * @author Дмитрий Карпушов 04.09.2022
 */
public class MusicPlayer {
    private Music music;

    //IoC
    public MusicPlayer(Music music) {
        this.music = music;
    }

    public void playMusic(){
        System.out.println("Playing: "+music.getSong());
    }
}

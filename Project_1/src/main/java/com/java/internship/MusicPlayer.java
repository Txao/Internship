package com.java.internship;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class MusicPlayer {
    private Music rockMusic;
    private Music classicalMusic;

    // IoC
    @Autowired
    public MusicPlayer(@Qualifier("rockMusic") Music rock, @Qualifier("classicalMusic") Music classic) {
        this.rockMusic = rock;
        this.classicalMusic = classic;
    }

    public void playMusic(Genres genre) {
        switch (genre) {
            case ROCK:
                System.out.println(this.rockMusic.getSongByIndex((int)(Math.random() * 3)));
                break;

            case CLASSICAL:
                System.out.println(this.classicalMusic.getSongByIndex((int)(Math.random() * 3)));
                break;
        }
    }

    public Music getRockMusic() {
        return rockMusic;
    }

    public void setRockMusic(Music rockMusic) {
        this.rockMusic = rockMusic;
    }

    public Music getClassicalMusic() {
        return classicalMusic;
    }

    public void setClassicalMusic(Music classicalMusic) {
        this.classicalMusic = classicalMusic;
    }
}

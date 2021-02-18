package com.java.internship;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class MusicPlayer {
    private List<Music> musicList;
    private Music music;

    private String name;
    private int volume;

    public MusicPlayer() {}

    // IoC
    public MusicPlayer(List<Music> musicList) {
        this.musicList = musicList;
    }

    @Autowired
    public MusicPlayer(@Qualifier("someRockMusic") Music music) {
        this.music = music;
    }

    public void playMusicList() {
        for (Music music : this.musicList)
            System.out.println("Playing: " + music.getSong());
    }

    public void playMusic() {
        System.out.println("Playing: " + this.music.getSong());
    }

    public void add(Music music) {
        this.musicList.add(music);
    }

    public List<Music> getMusicList() {
        return musicList;
    }

    public void setMusicList(List<Music> musicList) {
        this.musicList = musicList;
    }

    public Music getMusic() {
        return music;
    }

    public void setMusic(Music music) {
        this.music = music;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }
}

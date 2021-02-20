package com.java.internship;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.List;

public class MusicPlayer {
    private List<Music> musicList;

    // IoC
    public MusicPlayer(List<Music> musicList) {
        this.musicList = musicList;
    }

    public void playMusic() {
        Music temp = this.musicList.get((int)(Math.random() * musicList.size()));
        System.out.println(temp.getSongByIndex((int)(Math.random() * temp.getSize())));
    }

    public List<Music> getMusicList() {
        return musicList;
    }

    public void setMusicList(List<Music> musicList) {
        this.musicList = musicList;
    }
}

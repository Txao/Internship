package com.java.internship;

import java.util.List;

public class MusicPlayer {
    private List<Music> musicList;

    private String name;
    private int volume;

    public MusicPlayer() {
        //
    }

    // IoC
    public MusicPlayer(List<Music> musicList) {
        this.musicList = musicList;
    }

    public void playMusicList() {
        for (Music music : this.musicList)
            System.out.println("Playing: " + music.getSong());
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

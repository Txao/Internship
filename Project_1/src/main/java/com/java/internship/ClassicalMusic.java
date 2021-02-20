package com.java.internship;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

public class ClassicalMusic implements Music {
    private final List<String> songList;
    private int size;

    public ClassicalMusic() {
        this.songList = new ArrayList<>();
        this.songList.add("Beethoven - Moonlight Sonata");
        this.songList.add("Tchaikovsky - 8th Symphony");
        this.songList.add("Vivaldi - Winter");

        this.size = 3;
    }

    @Override
    public int getSize() {
        return this.size;
    }

    @Override
    public String getSongByIndex(int index) {
        return this.songList.get(index);
    }

    @Override
    public String getSongs() {
        String songs = "";

        for (String song : this.songList)
            songs += (song + "\t");

        return songs;
    }
}
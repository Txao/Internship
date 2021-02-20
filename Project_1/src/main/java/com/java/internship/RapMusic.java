package com.java.internship;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class RapMusic implements Music {
    private final List<String> songList;
    private int size;

    public RapMusic() {
        this.songList = new ArrayList<>();

        addMusic("Eminem - Rap God");
        addMusic("The Game - Hate It Or Love It");
        addMusic("50 CENT - P.I.M.P.");
    }

    public void addMusic(String song) {
        this.songList.add(song);
        size++;
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
            songs += (song + "\n");

        return songs;
    }
}

package com.java.internship;

import java.util.ArrayList;
import java.util.List;

public class RapMusic implements Music {
    private final List<String> songList;
    private int size;

    public RapMusic() {
        this.songList = new ArrayList<>();
        this.songList.add("Eminem - Rap God");
        this.songList.add("The Game - Hate It Or Love It");
        this.songList.add("50 CENT - P.I.M.P.");

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
            songs += (song + "\n");

        return songs;
    }
}

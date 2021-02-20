package com.java.internship;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class RockMusic implements Music {
    private final List<String> songList;
    private int size;

    public RockMusic() {
        this.songList = new ArrayList<>();
        this.songList.add("AC/DC - Big Gun");
        this.songList.add("Metallica - Nothing Else Matters");
        this.songList.add("Led Zeppelin - Stairway to Heaven");

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

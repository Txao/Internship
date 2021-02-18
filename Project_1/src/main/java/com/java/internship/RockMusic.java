package com.java.internship;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class RockMusic implements Music {
    private final List<String> songList;
    private final Genres genre = Genres.ROCK;

    public RockMusic() {
        this.songList = new ArrayList<>();
        songList.add("AC/DC - Big Gun");
        songList.add("Metallica - Nothing Else Matters");
        songList.add("Led Zeppelin - Stairway to Heaven");
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

    @Override
    public Genres getGenres() {
        return this.genre;
    }
}

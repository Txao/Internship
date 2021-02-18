package com.java.internship;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class ClassicalMusic implements Music {
    private final List<String> songList;
    private final Genres genre = Genres.CLASSICAL;

    public ClassicalMusic() {
        this.songList = new ArrayList<>();
        songList.add("Beethoven - Moonlight Sonata");
        songList.add("Tchaikovsky - 8th Symphony");
        songList.add("Vivaldi - Winter");
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

    @Override
    public Genres getGenres() {
        return this.genre;
    }
}
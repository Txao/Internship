package com.java.internship;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );

        Music music1 = context.getBean("someRockMusic", RockMusic.class);
        Music music2 = context.getBean("someClassicMusic", ClassicalMusic.class);

        MusicPlayer musicPlayer = new MusicPlayer(music1);
        musicPlayer.playMusic();

        context.close();
    }
}

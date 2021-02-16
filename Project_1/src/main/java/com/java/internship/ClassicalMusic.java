package com.java.internship;

import org.springframework.stereotype.Component;

@Component ("someClassicMusic")
public class ClassicalMusic implements Music {
    @Override
    public String getSong() {
        return "Moonlight Sonata";
    }
}

package com.java.internship;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import java.util.ArrayList;
import java.util.List;

@Configuration
@ComponentScan("com.java.internship")
@PropertySource("classpath:musicPlayer.properties")
public class SpringConfig {
    //
}

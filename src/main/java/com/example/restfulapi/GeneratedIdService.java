package com.example.restfulapi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class GeneratedIdService {

    private Random random = new Random();

    @Autowired
    public void setRandom(Random random) {
        this.random = random;
    }

    public String getId() {
        return "ABCD" + random.nextInt(10);
    }
}

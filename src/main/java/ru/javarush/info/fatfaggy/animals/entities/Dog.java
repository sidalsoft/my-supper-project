package ru.javarush.info.fatfaggy.animals.entities;

import org.springframework.stereotype.Component;

@Component
public class Dog {
    private String name = "Dog1";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

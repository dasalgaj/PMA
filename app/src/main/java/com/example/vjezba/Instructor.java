package com.example.vjezba;

import java.io.Serializable;

public class Instructor implements Serializable {
    public String key;
    public String name;
    public String title;

    public Instructor(String key, String name, String title) {
        this.key = key;
        this.name = name;
        this.title = title;
    }

    //GETTER
    public String getKey() {
        return key;
    }

    public String getName() {
        return name;
    }

    public String getTitle() {
        return title;
    }

    //SETTER
    public void setKey(String key) {
        this.key = key;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}

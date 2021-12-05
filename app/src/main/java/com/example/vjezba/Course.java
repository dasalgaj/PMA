package com.example.vjezba;

import androidx.annotation.NonNull;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.ArrayList;

public class Course implements Serializable {
    public ArrayList<Instructor> instructors;
    public String title;

    public Course(ArrayList<Instructor> instructors, String title) {
        this.instructors = instructors;
        this.title = title;
    }

    //GETTER
    public ArrayList<Instructor> getInstructors() {
        return instructors;
    }

    public String getTitle() {
        return title;
    }

    //SETTER
    public void setInstructors(ArrayList<Instructor> instructors) {
        this.instructors = instructors;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}

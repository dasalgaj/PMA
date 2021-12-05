package com.example.vjezba;

import java.util.ArrayList;

public class CoursesResponse {
    public ArrayList<Course> courses;

    public CoursesResponse(ArrayList<Course> courses) {
        this.courses = courses;
    }

    //GETTER
    public ArrayList<Course> getCourses() {
        return courses;
    }

    //SETTER
    public void setCourses(ArrayList<Course> courses) {
        this.courses = courses;
    }
}

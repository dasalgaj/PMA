package com.example.vjezba;

import java.util.ArrayList;
import java.util.List;

public class StudentList {
    private static StudentList single_instance = null;
    private List<Student> studentArrayList = new ArrayList<>();


    public static StudentList getInstance()
    {
        if(single_instance == null){
            single_instance = new StudentList();
        }
        return single_instance;
    }

    public void AddStudent(Student student)
    {
        this.studentArrayList.add(student);
    }

    public List<Student> ReturnList()
    {
        return this.studentArrayList;
    }
}

package com.example.vjezba;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;
import java.util.List;

public class StartActivity extends AppCompatActivity {

    private RecyclerView mRecyclerView;
    private Button oBtnDodaj;
    List<Student> studenti = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);

        Student student = new Student();
        student.ime = "-";
        student.prezime = "-";
        student.predmet = "-";
        studenti.add(student);

        StudentList studentList = StudentList.getInstance();
        List<Student> studentiSingleton;
        studentiSingleton = (List<Student>) studentList.ReturnList();
        studenti.addAll(studentiSingleton);

        mRecyclerView = (RecyclerView)findViewById(R.id.recyclerView);
        MyRecyclerAdapter mAdapter = new MyRecyclerAdapter(studenti);
        mRecyclerView.setAdapter(mAdapter);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));

        oBtnDodaj = (Button)findViewById(R.id.btnDodaj);
        oBtnDodaj.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent oDodajStudentaIntent = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(oDodajStudentaIntent);
                finish();
            }
        });
    }
}
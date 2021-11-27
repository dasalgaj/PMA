package com.example.vjezba;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class SummaryActivity extends AppCompatActivity {

    private TextView oIme;
    private TextView oPrezime;
    private TextView oDatum;
    private TextView oPredmet;
    private TextView oProfesor;
    private TextView oGodina;
    private TextView oSatiPredavanja;
    private TextView oSatiLV;
    private Button oBtnVrati;
    Student student = new Student();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_summary);

        student = (Student) getIntent().getSerializableExtra("objStudent");

        oIme = (TextView)findViewById(R.id.tvIme);
        oIme.setText("Ime: " + student.ime);

        oPrezime = (TextView)findViewById(R.id.tvPrezime);
        oPrezime.setText("Prezime: " + student.prezime);

        oDatum = (TextView)findViewById(R.id.tvDatum);
        oDatum.setText("Datum rođenja: " + student.datum_rodenja);

        oPredmet = (TextView)findViewById(R.id.tvPredmet);
        oPredmet.setText("Predmet: " + student.predmet);

        oProfesor = (TextView)findViewById(R.id.tvProfesor);
        oProfesor.setText("Profesor: " + student.profesor);

        oGodina = (TextView)findViewById(R.id.tvGodina);
        oGodina.setText("Akademska godina: " + student.akademska_godina);

        oSatiPredavanja = (TextView)findViewById(R.id.tvSatiPredavanja);
        oSatiPredavanja.setText("Sati predavanja: " + student.sati_predavanja);

        oSatiLV = (TextView)findViewById(R.id.tvSatiLV);
        oSatiLV.setText("Sati LV: " + student.sati_LV);


        oBtnVrati = (Button)findViewById(R.id.btnVrati);
        oBtnVrati.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                StudentList studentList = com.example.vjezba.StudentList.getInstance();
                studentList.AddStudent(student);
                finish();
                //moveTaskToBack(true);
            }
        });
    }
}
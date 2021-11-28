package com.example.vjezba;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

public class SummaryFragment extends Fragment {

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

    public FragmentsListener fragmentsListener;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_summary, container, false);

        oIme = (TextView)view.findViewById(R.id.tvIme);
        oPrezime = (TextView)view.findViewById(R.id.tvPrezime);
        oDatum = (TextView)view.findViewById(R.id.tvDatum);
        oPredmet = (TextView)view.findViewById(R.id.tvPredmet);
        oProfesor = (TextView)view.findViewById(R.id.tvProfesor);
        oGodina = (TextView)view.findViewById(R.id.tvGodina);
        oSatiPredavanja = (TextView)view.findViewById(R.id.tvSatiPredavanja);
        oSatiLV = (TextView)view.findViewById(R.id.tvSatiLV);

        oBtnVrati = (Button)view.findViewById(R.id.btnVrati);

        oBtnVrati.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startIntent = new Intent(getActivity(), StartActivity.class);

                if (fragmentsListener.getIme() != null) {
                    student.ime = fragmentsListener.getIme();
                }
                else{
                    student.ime = "";
                }
                if (fragmentsListener.getPrezime() != null) {
                    student.prezime = fragmentsListener.getPrezime();
                }
                else{
                    student.prezime = "";
                }
                student.datum_rodenja = fragmentsListener.getDatum();
                student.predmet = fragmentsListener.getPredmet();
                student.profesor = fragmentsListener.getProfesor();
                student.akademska_godina = fragmentsListener.getGodina();
                student.sati_predavanja = fragmentsListener.getSatiPredavanja();
                student.sati_LV = fragmentsListener.getSatiLV();

                StudentList studentList = com.example.vjezba.StudentList.getInstance();
                studentList.AddStudent(student);

                startIntent.putExtra("objStudent", student);

                startActivity(startIntent);
            }
        });

        return view;
    }

    @Override
    public void onResume(){
        super.onResume();

        if(fragmentsListener != null) {
            if(fragmentsListener.getIme() != null) {
                oIme.setText("Ime: " + fragmentsListener.getIme());
            }
            else{
                oIme.setText("Ime:");
            }
            if(fragmentsListener.getPrezime() != null) {
                oPrezime.setText("Prezime: " + fragmentsListener.getPrezime());
            }
            else{
                oPrezime.setText("Prezime:");
            }
            if(fragmentsListener.getDatum() != null) {
                oDatum.setText("Datum rođenja: " + fragmentsListener.getDatum());
            }
            else{
                oDatum.setText("Datum rođenja:");
            }
            if(fragmentsListener.getPredmet() != null) {
                oPredmet.setText("Predmet: " + fragmentsListener.getPredmet());
            }
            else{
                oPredmet.setText("Predmet:");
            }
            if(fragmentsListener.getProfesor() != null) {
                oProfesor.setText("Profesor: " + fragmentsListener.getProfesor());
            }
            else{
                oProfesor.setText("Profesor:");
            }
            if(fragmentsListener.getGodina() != null) {
                oGodina.setText("Akademska godina: " + fragmentsListener.getGodina());
            }
            else{
                oGodina.setText("Akademska godina:");
            }
            if(fragmentsListener.getSatiPredavanja() != null) {
                oSatiPredavanja.setText("Sati predavanja: " + fragmentsListener.getSatiPredavanja());
            }
            else{
                oSatiPredavanja.setText("Sati predavanja:");
            }
            if(fragmentsListener.getSatiLV() != null) {
                oSatiLV.setText("Sati LV: " + fragmentsListener.getSatiLV());
            }
            else{
                oSatiLV.setText("Sati LV:");
            }
        }
    }
}
package com.example.vjezba;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import java.util.ArrayList;
import java.util.List;

public class MyStatePager extends FragmentStateAdapter implements FragmentsListener{


    public MyStatePager(@NonNull FragmentManager fragmentManager, @NonNull Lifecycle lifecycle) {
        super(fragmentManager, lifecycle);
    }

    public Student student = new Student();

    @NonNull
    @Override
    public Fragment createFragment(int position) {

        Fragment fragment;

        switch (position)
        {
            case 1:
                fragment = new StudentInfoFragment();
                ((StudentInfoFragment)fragment).fragmentsListener = this;
                break;
            case 2:
                fragment = new SummaryFragment();
                ((SummaryFragment)fragment).fragmentsListener = this;
                break;
            default:
                fragment = new PersonalInfoFragment();
                ((PersonalInfoFragment)fragment).fragmentsListener = this;
                break;
        }

        return fragment;
    }

    @Override
    public int getItemCount() {
        return 3;
    }

    //SETTER
    @Override
    public void setIme(String ime) {
        student.ime = ime;
    }

    @Override
    public void setPrezime(String prezime) {
        student.prezime = prezime;
    }

    @Override
    public void setPredmet(Course predmet) {
        student.predmet = predmet;
    }

    @Override
    public void setDatum(String datum) {
        student.datum_rodenja = datum;
    }

    @Override
    public void setGodina(String godina) {
        student.akademska_godina = godina;
    }

    @Override
    public void setSatiPredavanja(String satiPredavanja) {
        student.sati_predavanja = satiPredavanja;
    }

    @Override
    public void setSatiLV(String satiLV) {
        student.sati_LV = satiLV;
    }

    @Override
    public void setProfesor(Instructor profesor) {
        student.profesor = profesor;
    }

    //GETTER
    @Override
    public String getIme() {
        return student.ime;
    }

    @Override
    public String getPrezime() {
        return student.prezime;
    }

    @Override
    public Course getPredmet() {
        return student.predmet;
    }

    @Override
    public String getDatum() {
        return student.datum_rodenja;
    }

    @Override
    public String getGodina() {
        return student.akademska_godina;
    }

    @Override
    public String getSatiPredavanja() {
        return student.sati_predavanja;
    }

    @Override
    public String getSatiLV() {
        return student.sati_LV;
    }

    @Override
    public Instructor getProfesor() {
        return student.profesor;
    }
}

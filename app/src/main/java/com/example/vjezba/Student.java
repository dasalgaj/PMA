package com.example.vjezba;

import java.io.Serializable;

public class Student implements Serializable {
    String ime;
    String prezime;
    String datum_rodenja;
    Course predmet;
    Instructor profesor;
    String akademska_godina;
    String sati_predavanja;
    String sati_LV;

    public String VratiImePrezime()
    {
        return ime + " " + prezime;
    }

    public Course VratiPredmet()
    {
        return predmet;
    }
}

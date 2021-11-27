package com.example.vjezba;

import java.io.Serializable;

public class Student implements Serializable {
    String ime;
    String prezime;
    String datum_rodenja;
    String predmet;
    String profesor;
    String akademska_godina;
    String sati_predavanja;
    String sati_LV;

    public String VratiImePrezime()
    {
        return ime + " " + prezime;
    }

    public String VratiPredmet()
    {
        return predmet;
    }
}

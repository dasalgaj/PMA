package com.example.vjezba;

import java.io.Serializable;

public class Student implements Serializable, FragmentsListener {
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

    @Override
    public void setIme(String ime) {
        this.ime = ime;
    }

    @Override
    public void setPrezime(String prezime) {
        this.prezime = prezime;
    }

    @Override
    public void setPredmet(String predmet) {
        this.predmet = predmet;
    }

    @Override
    public void setDatum(String datum) {
        this.datum_rodenja = datum;
    }

    @Override
    public void setGodina(String godina) {
        this.akademska_godina = godina;
    }

    @Override
    public void setSatiPredavanja(String satiPredavanja) {
        this.sati_predavanja = satiPredavanja;
    }

    @Override
    public void setSatiLV(String satiLV) {
        this.sati_LV = satiLV;
    }

    @Override
    public void setProfesor(String profesor) {
        this.profesor = profesor;
    }

    @Override
    public String getIme() {
        return this.ime;
    }

    @Override
    public String getPrezime() {
        return this.prezime;
    }

    @Override
    public String getPredmet() {
        return this.predmet;
    }

    @Override
    public String getDatum() {
        return this.datum_rodenja;
    }

    @Override
    public String getGodina() {
        return this.akademska_godina;
    }

    @Override
    public String getSatiPredavanja() {
        return this.sati_predavanja;
    }

    @Override
    public String getSatiLV() {
        return this.sati_LV;
    }

    @Override
    public String getProfesor() {
        return this.profesor;
    }
}

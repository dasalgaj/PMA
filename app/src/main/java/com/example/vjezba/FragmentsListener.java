package com.example.vjezba;

public interface FragmentsListener {
    void setIme(String ime);
    void setPrezime(String prezime);
    void setPredmet(Course predmet);
    void setDatum(String datum);
    void setGodina(String godina);
    void setSatiPredavanja(String satiPredavanja);
    void setSatiLV(String satiLV);
    void setProfesor(Instructor profesor);

    String getIme();
    String getPrezime();
    Course getPredmet();
    String getDatum();
    String getGodina();
    String getSatiPredavanja();
    String getSatiLV();
    Instructor getProfesor();
}

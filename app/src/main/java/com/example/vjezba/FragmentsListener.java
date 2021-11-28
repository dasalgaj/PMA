package com.example.vjezba;

public interface FragmentsListener {
    void setIme(String ime);
    void setPrezime(String prezime);
    void setPredmet(String predmet);
    void setDatum(String datum);
    void setGodina(String godina);
    void setSatiPredavanja(String satiPredavanja);
    void setSatiLV(String satiLV);
    void setProfesor(String profesor);

    String getIme();
    String getPrezime();
    String getPredmet();
    String getDatum();
    String getGodina();
    String getSatiPredavanja();
    String getSatiLV();
    String getProfesor();
}

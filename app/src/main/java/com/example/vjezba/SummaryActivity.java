package com.example.vjezba;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SummaryActivity extends AppCompatActivity {

    private String sIme;
    private String sPrezime;
    private String sDatum;
    private String sPredmet;
    private String sProfesor;
    private String sGodina;
    private String sSatiPredavanja;
    private String sSatiLV;
    private TextView oIme;
    private TextView oPrezime;
    private TextView oDatum;
    private TextView oPredmet;
    private TextView oProfesor;
    private TextView oGodina;
    private TextView oSatiPredavanja;
    private TextView oSatiLV;
    private Button oBtnVrati;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_summary);

        final Bundle oExtras = getIntent().getExtras();

        sIme = oExtras.getString("ime");
        oIme = (TextView)findViewById(R.id.tvIme);
        oIme.setText("Ime: " + sIme);

        sPrezime = oExtras.getString("prezime");
        oPrezime = (TextView)findViewById(R.id.tvPrezime);
        oPrezime.setText("Prezime: " + sPrezime);

        sDatum = oExtras.getString("datum");
        oDatum = (TextView)findViewById(R.id.tvDatum);
        oDatum.setText("Datum rođenja: " + sDatum);

        sPredmet = oExtras.getString("predmet");
        oPredmet = (TextView)findViewById(R.id.tvPredmet);
        oPredmet.setText("Predmet: " + sPredmet);

        sProfesor = oExtras.getString("profesor");
        oProfesor = (TextView)findViewById(R.id.tvProfesor);
        oProfesor.setText("Profesor: " + sProfesor);

        sGodina = oExtras.getString("godina");
        oGodina = (TextView)findViewById(R.id.tvGodina);
        oGodina.setText("Akademska godina: " + sGodina);

        sSatiPredavanja = oExtras.getString("satiPredavanja");
        oSatiPredavanja = (TextView)findViewById(R.id.tvSatiPredavanja);
        oSatiPredavanja.setText("Sati predavanja: " + sSatiPredavanja);

        sSatiLV = oExtras.getString("satiLV");
        oSatiLV = (TextView)findViewById(R.id.tvSatiLV);
        oSatiLV.setText("Sati LV: " + sSatiLV);

        oBtnVrati = (Button)findViewById(R.id.btnVrati);
        oBtnVrati.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                moveTaskToBack(true);
            }
        });
    }
}
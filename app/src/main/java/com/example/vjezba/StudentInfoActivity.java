package com.example.vjezba;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.content.Intent;
import android.widget.EditText;
import android.widget.TextView;

import com.google.android.material.textfield.TextInputEditText;

public class StudentInfoActivity extends AppCompatActivity {

    private Button oBtnUpisi;
    private String sIme;
    private String sPrezime;
    private String sDatum;
    private String sPredmet;
    private String sProfesor;
    private String sGodina;
    private String sSatiPredavanja;
    private String sSatiLV;
    private TextInputEditText oInputPredmet;
    private TextInputEditText oInputProfesor;
    private TextInputEditText oInputGodina;
    private TextInputEditText oInputSatiPredavanja;
    private TextInputEditText oInputSatiLV;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student_info);

        final Bundle oExtras = getIntent().getExtras();
        sIme = oExtras.getString("ime");
        sPrezime = oExtras.getString("prezime");
        sDatum = oExtras.getString("datum");

        oInputPredmet = (TextInputEditText)findViewById(R.id.etPredmet);
        oInputProfesor = (TextInputEditText)findViewById(R.id.etProfesor);
        oInputGodina = (TextInputEditText)findViewById(R.id.etGodina);
        oInputSatiPredavanja = (TextInputEditText)findViewById(R.id.etSatiPredavanja);
        oInputSatiLV = (TextInputEditText)findViewById(R.id.etSatiLV);

        oBtnUpisi = (Button)findViewById(R.id.btnUpisi);
        oBtnUpisi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sPredmet = oInputPredmet.getText().toString();
                sProfesor = oInputProfesor.getText().toString();
                sGodina = oInputGodina.getText().toString();
                sSatiPredavanja = oInputSatiPredavanja.getText().toString();
                sSatiLV = oInputSatiLV.getText().toString();
                Intent oUpisiPredmetIntent = new Intent(getApplicationContext(), SummaryActivity.class);
                oUpisiPredmetIntent.putExtra("ime", sIme);
                oUpisiPredmetIntent.putExtra("prezime", sPrezime);
                oUpisiPredmetIntent.putExtra("datum", sDatum);
                oUpisiPredmetIntent.putExtra("predmet", sPredmet);
                oUpisiPredmetIntent.putExtra("profesor", sProfesor);
                oUpisiPredmetIntent.putExtra("godina", sGodina);
                oUpisiPredmetIntent.putExtra("satiPredavanja", sSatiPredavanja);
                oUpisiPredmetIntent.putExtra("satiLV", sSatiLV);

                startActivity(oUpisiPredmetIntent);
            }
        });
    }
}
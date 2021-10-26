package com.example.vjezba;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SummaryActivity extends AppCompatActivity {

    private String sImePrezime;
    private String sPredmet;
    private TextView oImePrezime;
    private TextView oPredmet;
    private Button oBtnVrati;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_summary);

        final Bundle oExtras = getIntent().getExtras();

        sImePrezime = oExtras.getString("imePrezime");
        oImePrezime = (TextView)findViewById(R.id.tvImePrezime);
        oImePrezime.setText("Ime i prezime: " + sImePrezime);

        sPredmet = oExtras.getString("predmet");
        oPredmet = (TextView)findViewById(R.id.tvPredmet);
        oPredmet.setText("Predmet: " + sPredmet);

        oBtnVrati = (Button)findViewById(R.id.btnVrati);
        oBtnVrati.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                moveTaskToBack(true);
            }
        });
    }
}
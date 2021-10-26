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
    private String sImePrezime;
    private String sPredmet;
    private TextInputEditText oInputPredmet;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student_info);

        final Bundle oExtras = getIntent().getExtras();
        sImePrezime = oExtras.getString("imePrezime");

        oInputPredmet = (TextInputEditText)findViewById(R.id.etPredmet);

        oBtnUpisi = (Button)findViewById(R.id.btnUpisi);
        oBtnUpisi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sPredmet = oInputPredmet.getText().toString();
                Intent oUpisiPredmetIntent = new Intent(getApplicationContext(), SummaryActivity.class);
                oUpisiPredmetIntent.putExtra("imePrezime", sImePrezime);
                oUpisiPredmetIntent.putExtra("predmet", sPredmet);
                if (sPredmet.matches(""))
                {
                    oInputPredmet.setError("Niste unijeli predmet");
                }
                else
                {
                    startActivity(oUpisiPredmetIntent);
                }
            }
        });
    }
}
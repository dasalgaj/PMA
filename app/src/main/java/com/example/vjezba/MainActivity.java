package com.example.vjezba;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.content.Intent;

import com.google.android.material.textfield.TextInputEditText;

public class MainActivity extends AppCompatActivity {

    private Button oBtnDalje;
    private TextInputEditText oInputImePrezime;
    private String sImePrezime;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        oInputImePrezime = (TextInputEditText)findViewById(R.id.etImePrezime);

        oBtnDalje = (Button)findViewById(R.id.btnDalje);
        oBtnDalje.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sImePrezime = oInputImePrezime.getText().toString();
                Intent oUpisiStudentIntent = new Intent(getApplicationContext(), StudentInfoActivity.class);
                oUpisiStudentIntent.putExtra("imePrezime", sImePrezime);
                if (sImePrezime.matches(""))
                {
                    oInputImePrezime.setError("Niste unijeli ime i prezime");
                }
                else
                {
                    startActivity(oUpisiStudentIntent);
                }
            }
        });
    }
}
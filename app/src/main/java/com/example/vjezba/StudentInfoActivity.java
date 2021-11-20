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
    private TextInputEditText oInputPredmet;
    private TextInputEditText oInputProfesor;
    private TextInputEditText oInputGodina;
    private TextInputEditText oInputSatiPredavanja;
    private TextInputEditText oInputSatiLV;
    private Student student = new Student();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student_info);

        student = (Student) getIntent().getSerializableExtra("objStudent");

        oInputPredmet = (TextInputEditText)findViewById(R.id.etPredmet);
        oInputProfesor = (TextInputEditText)findViewById(R.id.etProfesor);
        oInputGodina = (TextInputEditText)findViewById(R.id.etGodina);
        oInputSatiPredavanja = (TextInputEditText)findViewById(R.id.etSatiPredavanja);
        oInputSatiLV = (TextInputEditText)findViewById(R.id.etSatiLV);

        oBtnUpisi = (Button)findViewById(R.id.btnUpisi);
        oBtnUpisi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                student.predmet = oInputPredmet.getText().toString();
                student.profesor = oInputProfesor.getText().toString();
                student.akademska_godina = oInputGodina.getText().toString();
                student.sati_predavanja = oInputSatiPredavanja.getText().toString();
                student.sati_LV = oInputSatiLV.getText().toString();
                Intent oUpisiPredmetIntent = new Intent(getApplicationContext(), SummaryActivity.class);
                oUpisiPredmetIntent.putExtra("objStudent", student);

                startActivity(oUpisiPredmetIntent);
                finish();
            }
        });
    }
}
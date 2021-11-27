package com.example.vjezba;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

public class SummaryFragment extends Fragment {

    private TextView oIme;
    private TextView oPrezime;
    private TextView oDatum;
    private TextView oPredmet;
    private TextView oProfesor;
    private TextView oGodina;
    private TextView oSatiPredavanja;
    private TextView oSatiLV;
    private Button oBtnVrati;
    Student student = new Student();

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_summary, container, false);

        Bundle bundle = getArguments();
        student = (Student)bundle.getSerializable("objStudent");

        oIme = (TextView)view.findViewById(R.id.tvIme);
        oIme.setText("Ime: " + student.ime);

        oPrezime = (TextView)view.findViewById(R.id.tvPrezime);
        oPrezime.setText("Prezime: " + student.prezime);

        oDatum = (TextView)view.findViewById(R.id.tvDatum);
        oDatum.setText("Datum rođenja: " + student.datum_rodenja);

        oPredmet = (TextView)view.findViewById(R.id.tvPredmet);
        oPredmet.setText("Predmet: " + student.predmet);

        oProfesor = (TextView)view.findViewById(R.id.tvProfesor);
        oProfesor.setText("Profesor: " + student.profesor);

        oGodina = (TextView)view.findViewById(R.id.tvGodina);
        oGodina.setText("Akademska godina: " + student.akademska_godina);

        oSatiPredavanja = (TextView)view.findViewById(R.id.tvSatiPredavanja);
        oSatiPredavanja.setText("Sati predavanja: " + student.sati_predavanja);

        oSatiLV = (TextView)view.findViewById(R.id.tvSatiLV);
        oSatiLV.setText("Sati LV: " + student.sati_LV);

        oBtnVrati = (Button)view.findViewById(R.id.btnVrati);

        oBtnVrati.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getActivity().finish();
            }
        });

        return view;
    }
}
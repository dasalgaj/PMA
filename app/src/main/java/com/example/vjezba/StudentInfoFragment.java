package com.example.vjezba;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.google.android.material.textfield.TextInputEditText;

public class StudentInfoFragment extends Fragment {

    private TextInputEditText oInputPredmet;
    private TextInputEditText oInputProfesor;
    private TextInputEditText oInputGodina;
    private TextInputEditText oInputSatiPredavanja;
    private TextInputEditText oInputSatiLV;

    public FragmentsListener fragmentsListener;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_student_info, container, false);

        oInputPredmet = (TextInputEditText)view.findViewById(R.id.etPredmet);
        oInputProfesor = (TextInputEditText)view.findViewById(R.id.etProfesor);
        oInputGodina = (TextInputEditText)view.findViewById(R.id.etGodina);
        oInputSatiPredavanja = (TextInputEditText)view.findViewById(R.id.etSatiPredavanja);
        oInputSatiLV = (TextInputEditText)view.findViewById(R.id.etSatiLV);

        oInputPredmet.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                fragmentsListener.setPredmet(oInputPredmet.getText().toString());
            }
        });

        oInputProfesor.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                fragmentsListener.setProfesor(oInputProfesor.getText().toString());
            }
        });

        oInputGodina.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                fragmentsListener.setGodina(oInputGodina.getText().toString());
            }
        });

        oInputSatiPredavanja.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                fragmentsListener.setSatiPredavanja(oInputSatiPredavanja.getText().toString());
            }
        });

        oInputSatiLV.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                fragmentsListener.setSatiLV(oInputSatiLV.getText().toString());
            }
        });

        return view;
    }
}
package com.example.vjezba;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import com.example.vjezba.FragmentsListener;
import com.example.vjezba.R;
import com.google.android.material.textfield.TextInputEditText;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class StudentInfoFragment extends Fragment implements Callback<CoursesResponse> {

    private Spinner oSpinnerPredmet;
    private Spinner oSpinnerProfesor;
    private TextInputEditText oInputGodina;
    private TextInputEditText oInputSatiPredavanja;
    private TextInputEditText oInputSatiLV;
    private View view;

    private ArrayList<Course> courses = new ArrayList<>();

    public FragmentsListener fragmentsListener;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ApiManager.getInstance().service().getCourses().enqueue(this);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_student_info, container, false);

        oSpinnerPredmet = (Spinner)view.findViewById(R.id.spinnerTitle);
        oSpinnerProfesor = (Spinner)view.findViewById(R.id.spinnerName);
        oInputGodina = (TextInputEditText)view.findViewById(R.id.etGodina);
        oInputSatiPredavanja = (TextInputEditText)view.findViewById(R.id.etSatiPredavanja);
        oInputSatiLV = (TextInputEditText)view.findViewById(R.id.etSatiLV);

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

    @Override
    public void onResponse(@NonNull Call<CoursesResponse> call, @NonNull Response<CoursesResponse> response) {
        if (response.isSuccessful() && response.body() != null) {

            for (int i = 0; i < response.body().courses.size(); i++) {

                if (response.body().getCourses().get(i).getInstructors() != null) {
                    courses.add(response.body().getCourses().get(i));
                }

            }
        }

        PredmetSpinnerAdapter predmetSpinnerAdapter = new PredmetSpinnerAdapter(getActivity(), android.R.layout.simple_spinner_item, courses);
        oSpinnerPredmet.setAdapter(predmetSpinnerAdapter);

        oSpinnerPredmet.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View v, int position, long id) {
                fragmentsListener.setPredmet(courses.get(position));

                ProfesorSpinnerAdapter profesorSpinnerAdapter = new ProfesorSpinnerAdapter(getActivity(), android.R.layout.simple_spinner_item, fragmentsListener.getPredmet().getInstructors());
                oSpinnerProfesor.setAdapter(profesorSpinnerAdapter);

                oSpinnerProfesor.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                    @Override
                    public void onItemSelected(AdapterView<?> parent, View v, int position, long id) {
                        fragmentsListener.setProfesor(fragmentsListener.getPredmet().getInstructors().get(position));
                    }

                    @Override
                    public void onNothingSelected(AdapterView<?> parent) {

                    }
                });
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    }

    @Override
    public void onFailure(@NonNull Call<CoursesResponse> call, @NonNull Throwable t) {
        t.printStackTrace();
    }
}
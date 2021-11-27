package com.example.vjezba;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.google.android.material.textfield.TextInputEditText;

public class StudentInfoFragment extends Fragment {

    private TextInputEditText oInputPredmet;
    private TextInputEditText oInputProfesor;
    private TextInputEditText oInputGodina;
    private TextInputEditText oInputSatiPredavanja;
    private TextInputEditText oInputSatiLV;
    private Button oBtnUpisi;
    private Student student = new Student();

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_student_info, container, false);

        Bundle bundle = getArguments();
        student = (Student)bundle.getSerializable("objStudent");

        oInputPredmet = (TextInputEditText)view.findViewById(R.id.etPredmet);
        oInputProfesor = (TextInputEditText)view.findViewById(R.id.etProfesor);
        oInputGodina = (TextInputEditText)view.findViewById(R.id.etGodina);
        oInputSatiPredavanja = (TextInputEditText)view.findViewById(R.id.etSatiPredavanja);
        oInputSatiLV = (TextInputEditText)view.findViewById(R.id.etSatiLV);

        oBtnUpisi = (Button)view.findViewById((R.id.btnUpisi));

        oBtnUpisi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                StudentInfoFragment fragment1 = new StudentInfoFragment();
                SummaryFragment fragment2 = new SummaryFragment();

                student.predmet = oInputPredmet.getText().toString();
                student.profesor = oInputProfesor.getText().toString();
                student.akademska_godina = oInputGodina.getText().toString();
                student.sati_predavanja = oInputSatiPredavanja.getText().toString();
                student.sati_LV = oInputSatiLV.getText().toString();

                Bundle bundle = new Bundle();
                bundle.putSerializable("objStudent", student);
                fragment2.setArguments(bundle);

                FragmentTransaction ft = getActivity().getSupportFragmentManager().beginTransaction();

                ft.replace(R.id.container1, fragment2);
                ft.addToBackStack(null);

                ft.commit();
            }
        });

        return view;
    }
}
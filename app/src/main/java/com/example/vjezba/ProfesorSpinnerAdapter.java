package com.example.vjezba;

import android.content.Context;
import android.graphics.BitmapFactory;
import android.os.StrictMode;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;

public class ProfesorSpinnerAdapter extends ArrayAdapter<Instructor> {
    private Context context;
    private ArrayList<Instructor> instructors;

    public ProfesorSpinnerAdapter(@NonNull Context context, int textViewResourceId, ArrayList<Instructor> instructors) {
        super(context, textViewResourceId, instructors);
        this.context = context;
        this.instructors = instructors;
    }

    @Override
    public int getCount(){
        return instructors.size();
    }

    @Override
    public Instructor getItem(int position){
        return instructors.get(position);
    }

    @Override
    public long getItemId(int position){
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        TextView label = (TextView) super.getView(position, convertView, parent);

        label.setText(instructors.get(position).getName());

        return label;
    }

    @Override
    public View getDropDownView(int position, View convertView, ViewGroup parent) {
        TextView label = (TextView) super.getDropDownView(position, convertView, parent);

        label.setText(instructors.get(position).getName());

        return label;
    }
}

package com.example.vjezba;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;

import java.util.ArrayList;

public class PredmetSpinnerAdapter extends ArrayAdapter<Course> {
    private Context context;
    private ArrayList<Course> courses;

    public PredmetSpinnerAdapter(@NonNull Context context, int textViewResourceId, ArrayList<Course> courses) {
        super(context, textViewResourceId, courses);
        this.context = context;
        this.courses = courses;
    }

    @Override
    public int getCount(){
        return courses.size();
    }

    @Override
    public Course getItem(int position){
        return courses.get(position);
    }

    @Override
    public long getItemId(int position){
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        TextView label = (TextView) super.getView(position, convertView, parent);

        label.setText(courses.get(position).getTitle());

        return label;
    }

    @Override
    public View getDropDownView(int position, View convertView, ViewGroup parent) {
        TextView label = (TextView) super.getDropDownView(position, convertView, parent);

        label.setText(courses.get(position).getTitle());

        return label;
    }
}

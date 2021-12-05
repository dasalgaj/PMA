package com.example.vjezba;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class MyRecyclerAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    List<Student> studenti;

    public MyRecyclerAdapter(List<Student> students)
    {
        studenti = students;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType)
    {
        // create a new view
        if (viewType == 0)
        {
            View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.my_header, viewGroup, false);
            return new HeaderViewHolder(view);
        }
        else
        {
            View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.my_row, viewGroup, false);
            return new StudentViewHolder(view);
        }
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position)
    {
        if (getItemViewType(position) == 0)
        {
            HeaderViewHolder headerViewHolder = (HeaderViewHolder) holder;
            headerViewHolder.txtHeader.setText("Studenti");
        }
        else
        {
            StudentViewHolder studHolder = (StudentViewHolder) holder;
            studHolder.txtImePrezime.setText(studenti.get(position).VratiImePrezime());
            studHolder.txtPredmet.setText(studenti.get(position).predmet.title);
        }
    }

    class HeaderViewHolder extends RecyclerView.ViewHolder {
        TextView txtHeader;
        public HeaderViewHolder(@NonNull View itemView) {
            super(itemView);
            txtHeader = itemView.findViewById(R.id.tvHeader);
        }
    }

    class StudentViewHolder extends RecyclerView.ViewHolder{
        TextView txtImePrezime;
        TextView txtPredmet;
        public StudentViewHolder(@NonNull View itemView){
            super(itemView);
            txtImePrezime = itemView.findViewById(R.id.txtImePrezime);
            txtPredmet = itemView.findViewById(R.id.txtPredmet);
        }
    }

    @Override
    public int getItemCount() {
        return studenti.size();
    }

    @Override
    public int getItemViewType(int position) {
        return position;
    }
}

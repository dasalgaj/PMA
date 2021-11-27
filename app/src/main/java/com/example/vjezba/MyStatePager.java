package com.example.vjezba;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.viewpager2.adapter.FragmentStateAdapter;

public class MyStatePager extends FragmentStateAdapter {


    public MyStatePager(@NonNull FragmentManager fragmentManager, @NonNull Lifecycle lifecycle) {
        super(fragmentManager, lifecycle);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {

        switch(position){
            case 0:
                return new PersonalInfoFragment();
            case 1:
                return new StudentInfoFragment();
            default:
                return new SummaryFragment();
        }
    }

    @Override
    public int getItemCount() {
        return 3;
    }
}

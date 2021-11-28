package com.example.vjezba;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.viewpager2.adapter.FragmentStateAdapter;

public class MyStatePager extends FragmentStateAdapter {


    public MyStatePager(@NonNull FragmentManager fragmentManager, @NonNull Lifecycle lifecycle) {
        super(fragmentManager, lifecycle);
    }

    public Student student = new Student();

    @NonNull
    @Override
    public Fragment createFragment(int position) {

        Fragment fragment;

        switch (position)
        {
            case 1:
                fragment = new StudentInfoFragment();
                ((StudentInfoFragment)fragment).fragmentsListener = student;
                break;
            case 2:
                fragment = new SummaryFragment();
                ((SummaryFragment)fragment).fragmentsListener = student;
                break;
            default:
                fragment = new PersonalInfoFragment();
                ((PersonalInfoFragment)fragment).fragmentsListener = student;
                break;
        }

        return fragment;
    }

    @Override
    public int getItemCount() {
        return 3;
    }
}

package com.example.vjezba;

import static com.example.vjezba.PersonalInfoFragment.REQUEST_IMAGE_CAPTURE;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
import androidx.viewpager2.widget.MarginPageTransformer;
import androidx.viewpager2.widget.ViewPager2;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;
import com.google.android.material.textfield.TextInputEditText;

import java.util.ArrayList;
import java.util.List;

public class CreateNewRecordActivity extends AppCompatActivity {

    private ViewPager2 mViewPager;
    private Button oBtnDalje;
    private List<Fragment> arrayList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_new_record);

        mViewPager = (ViewPager2)findViewById(R.id.viewPager);

        arrayList.add(new PersonalInfoFragment());
        arrayList.add(new StudentInfoFragment());
        arrayList.add(new SummaryFragment());

        MyStatePager mStatePager;
        mStatePager = new MyStatePager(getSupportFragmentManager(), getLifecycle());

        mViewPager.setAdapter(mStatePager);
    }
}
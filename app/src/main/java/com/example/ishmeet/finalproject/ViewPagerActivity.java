package com.example.ishmeet.finalproject;

import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.ishmeet.finalproject.Adapter.ViewPagerAdapter;
import com.example.ishmeet.finalproject.fragment.Pic1Fragment;
import com.example.ishmeet.finalproject.fragment.Pic2Fragment;
import com.example.ishmeet.finalproject.fragment.Pic3Fragment;

import java.util.ArrayList;

public class ViewPagerActivity extends AppCompatActivity {

    private ViewPager viewPager;
    private ArrayList<Fragment> fragmentList = new ArrayList<Fragment>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_pager);
        initial();
    }

    private void initial() {
        viewPager = (ViewPager) findViewById(R.id.view_pager);
        fragmentList.add(new Pic1Fragment());
        fragmentList.add(new Pic2Fragment());
        fragmentList.add(new Pic3Fragment());
        ViewPagerAdapter viewPagerAdapter = new ViewPagerAdapter(this.getSupportFragmentManager());
        viewPagerAdapter.setContent(fragmentList);
        viewPager.setAdapter(viewPagerAdapter);

    }

}

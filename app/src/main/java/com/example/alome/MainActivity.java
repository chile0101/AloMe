package com.example.alome;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Html;
import android.util.Log;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    private SliderAdapter sliderAdapter;
    private WrapContentViewPager mMsgSelectionPager;
    private TabLayout tabLayout;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mapping();
        sliderAdapter = new SliderAdapter(this);


        mMsgSelectionPager.setAdapter(sliderAdapter);
        tabLayout.setupWithViewPager(mMsgSelectionPager, true);

    }
    public void mapping(){
        mMsgSelectionPager = (WrapContentViewPager) findViewById(R.id.slideViewPaper);
        tabLayout = (TabLayout) findViewById(R.id.dotsLayout);
    }

    WrapContentViewPager.OnPageChangeListener viewListener = new WrapContentViewPager.OnPageChangeListener() {
        @Override
        public void onPageScrolled(int i, float v, int i1) {

        }

        @Override
        public void onPageSelected(int i) {
           // addDotsIndicator(i);
        }

        @Override
        public void onPageScrollStateChanged(int i) {

        }
    };




}

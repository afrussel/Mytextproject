package io.left.mytextproject;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.content.res.ResourcesCompat;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import cn.trinea.android.view.autoscrollviewpager.AutoScrollViewPager;
import io.left.mytextproject.adapter.ImagePagerAdapter;

/**
 * Created by sohag on 11/28/16.
 */

public class IntroScreenActivity extends AppCompatActivity implements View.OnClickListener {

    private AutoScrollViewPager viewPager;
    private TextView indexText, bigTitle;
    private ImageView indexView,logoView;
    private Button createProfile, fbRegister, privacy_policy, term_service;

    private Button innerViewPagerDemo;
    private List<Integer> imageIdList;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intro_screen);


        viewPager = (AutoScrollViewPager) findViewById(R.id.view_pager);
        logoView = (ImageView) findViewById(R.id.appLogo);
        bigTitle = (TextView) findViewById(R.id.bigTitle_welcome);
        indexText = (TextView) findViewById(R.id.textView_joinToYO);
        indexView = (ImageView) findViewById(R.id.imageView_tabIndicator);
        imageIdList = new ArrayList<Integer>();
        imageIdList.add(R.drawable.join_to_yo_1);
        imageIdList.add(R.drawable.join_to_yo_2);
        imageIdList.add(R.drawable.join_to_yo_3);

        viewPager.setAdapter(new ImagePagerAdapter(this, imageIdList).setInfiniteLoop(true));
        viewPager.setOnPageChangeListener(new MyOnPageChangeListener());

        viewPager.setInterval(4000);
        viewPager.startAutoScroll();
    }

    @Override
    public void onClick(View v) {

    }


    public class MyOnPageChangeListener implements ViewPager.OnPageChangeListener {

        @Override
        public void onPageSelected(int position) {

            int index = ((position) % (imageIdList.size()) + 1);

            if (index == 1) {
                logoView.setBackground(ResourcesCompat.getDrawable(getResources(), R.drawable.logo_small, null));
                bigTitle.setText(getResources().getString(R.string.welcome_1));
                indexText.setText(getResources().getString(R.string.join_to_yo_1));
                indexView.setBackground(ResourcesCompat.getDrawable(getResources(), R.drawable.tab_indicator_1, null));
            } else if (index == 2) {
                logoView.setBackground(ResourcesCompat.getDrawable(getResources(), R.drawable.logo_small, null));
                bigTitle.setText(getResources().getString(R.string.welcome_2));
                indexText.setText(getResources().getString(R.string.join_to_yo_2));
                indexView.setBackground(ResourcesCompat.getDrawable(getResources(), R.drawable.tab_indicator_2, null));
            } else if (index == 3) {
                logoView.setBackground(ResourcesCompat.getDrawable(getResources(), R.drawable.logo_small, null));
                bigTitle.setText(getResources().getString(R.string.welcome_3));
                indexText.setText(getResources().getString(R.string.join_to_yo_3));
                indexView.setBackground(ResourcesCompat.getDrawable(getResources(), R.drawable.tab_indicator_3, null));
            }

        }

        @Override
        public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
        }

        @Override
        public void onPageScrollStateChanged(int arg0) {
        }
    }

    @Override
    protected void onPause() {
        super.onPause();
        // stop auto scroll when onPause
        viewPager.stopAutoScroll();
    }

    @Override
    protected void onResume() {
        super.onResume();
        // start auto scroll when onResume
        viewPager.startAutoScroll();
    }


    @Override
    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putBoolean("dummy", true);
    }

}

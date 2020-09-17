package com.example.trouvaille;


import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.CompositePageTransformer;
import androidx.viewpager2.widget.MarginPageTransformer;
import androidx.viewpager2.widget.ViewPager2;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.OvershootInterpolator;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.ArrayList;
import java.util.List;

public class DetailsActivity extends AppCompatActivity {

    private ViewPager2 viewPager2;
    private Handler sliderHandler = new Handler();
    private TextView name,address,time,contact;
    Button aboutButton;
    Button reviewsButton;
    FloatingActionButton fab;
    OvershootInterpolator interpolator = new OvershootInterpolator();
    private boolean isFabClicked;
    private LinearLayout linearLayout;
    ArrayList<SliderItem> sliderItems = new ArrayList<SliderItem>();
     int POS,VAL;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        Toolbar toolbar = (Toolbar)findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        linearLayout = (LinearLayout)findViewById(R.id.linearLayout);
        aboutButton = (Button)findViewById(R.id.aboutButton);
        reviewsButton = (Button)findViewById(R.id.reviewsButton);
        fab = (FloatingActionButton)findViewById(R.id.fabButton);
        name = (TextView) findViewById(R.id.nameTextView);
        address = (TextView) findViewById(R.id.addressTextView);
        time = (TextView) findViewById(R.id.timingTextView);
        contact = (TextView) findViewById(R.id.contactTextView);
        isFabClicked = true;
        aboutButton.setEnabled(false);
        reviewsButton.setEnabled(false);
        aboutButton.animate().alpha(0f);
        reviewsButton.animate().alpha(0f);
        viewPager2 = findViewById(R.id.viewPagetImageSlider);


        sliderItems = (ArrayList<SliderItem>) getIntent().getSerializableExtra("list");

        final int pos = getIntent().getExtras().getInt("pos");
        final int val = getIntent().getExtras().getInt("val");

        POS = pos;
        VAL = val;


        if (pos != -1) {
            DetailsClass dt;
            switch (val) {
                case 1:
                    dt = DetailsClass.foodInfo[pos];
                    break;
                case 2:
                    dt = DetailsClass.cafeInfo[pos];
                    break;
                case 3:
                    dt = DetailsClass.shoppingInfo[pos];
                    break;
                case 4:
                    dt = DetailsClass.hotelInfo[pos];
                    break;
                case 5:
                    dt = DetailsClass.moviesInfo[pos];
                    break;
                case 6:
                    dt = DetailsClass.gamingInfo[pos];
                    break;
                default:
                    dt = DetailsClass.foodInfo[pos];
            }

            setTitle(dt.name);
            name.setText(dt.name);
            address.setText(dt.address);
            time.setText(dt.timings);
            contact.setText(dt.contact);

            viewPager2.setAdapter(new SliderAdapter(sliderItems, viewPager2));

            viewPager2.setClipToPadding(false);
            viewPager2.setClipChildren(false);
            viewPager2.setOffscreenPageLimit(3);
            viewPager2.getChildAt(0).setOverScrollMode(RecyclerView.OVER_SCROLL_NEVER);

            CompositePageTransformer compositePageTransformer = new CompositePageTransformer();
            compositePageTransformer.addTransformer(new MarginPageTransformer(40));
            compositePageTransformer.addTransformer(new ViewPager2.PageTransformer() {
                @Override
                public void transformPage(@NonNull View page, float position) {
                    float r = 1 - Math.abs(position);
                    page.setScaleY(0.85f + r * 0.15f + 0.1f);
                }
            });

            viewPager2.setPageTransformer(compositePageTransformer);
            viewPager2.registerOnPageChangeCallback(new ViewPager2.OnPageChangeCallback() {
                @Override
                public void onPageSelected(int position) {
                    super.onPageSelected(position);
                    sliderHandler.removeCallbacks(sliderRunnable);
                    sliderHandler.postDelayed(sliderRunnable, 2000);
                }
            });

            fab.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                      if(isFabClicked)
                      {
                           isFabClicked = !isFabClicked;
                           fab.animate().setInterpolator(interpolator).rotationBy(180f).setDuration(300).start();
                           aboutButton.animate().alpha(1f);
                           reviewsButton.animate().alpha(1f);
                           aboutButton.setEnabled(true);
                           reviewsButton.setEnabled(true);
                      }
                      else
                      {
                           isFabClicked = !isFabClicked;
                           fab.animate().setInterpolator(interpolator).rotationBy(180f).setDuration(300).start();
                          aboutButton.animate().alpha(0f);
                          reviewsButton.animate().alpha(0f);
                          aboutButton.setEnabled(false);
                          reviewsButton.setEnabled(false);

                      }
                }
            });
            final ArrayList<SliderItem> finalSliderItems = sliderItems;
            aboutButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(DetailsActivity.this,AboutActivity.class);
                    intent.putExtra("list", finalSliderItems);
                    intent.putExtra("pos",pos);
                    intent.putExtra("val",val);
                    startActivity(intent);
                }
            });

            reviewsButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(DetailsActivity.this,ReviewActivity.class);
                    intent.putExtra("list", finalSliderItems);
                    intent.putExtra("pos",pos);
                    intent.putExtra("val",val);
                    startActivity(intent);

                }
            });

            final ArrayList<SliderItem> finalSliderItems1 = sliderItems;
            linearLayout.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                         Intent intent = new Intent(DetailsActivity.this,DisplayImagesActivity.class);
                         intent.putExtra("list", finalSliderItems1);
                         intent.putExtra("pos",pos);
                         intent.putExtra("val",val);
                         startActivity(intent);
                }
            });

        }
    }

        private Runnable sliderRunnable = new Runnable() {
            @Override
            public void run() {
                viewPager2.setCurrentItem(viewPager2.getCurrentItem() + 1);

            }
        };


}




























package com.example.trouvaille;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.content.ContextCompat;
import androidx.viewpager2.widget.ViewPager2;
import android.os.Bundle;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import java.util.ArrayList;
import java.util.List;

public class DisplayImagesActivity extends AppCompatActivity {

    private OnboardingAdapter onboardingAdapter;
    private LinearLayout layoutOnboardingIndicators;


    ArrayList<SliderItem> sliderItems = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_images);

        Toolbar toolbar = (Toolbar)findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        sliderItems = (ArrayList<SliderItem>) getIntent().getSerializableExtra("list");
        final int pos = getIntent().getExtras().getInt("pos");
        final int val = getIntent().getExtras().getInt("val");

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

            layoutOnboardingIndicators = findViewById(R.id.layoutOnBoardingIndicators);
            setOnboardingItems(dt);
            final ViewPager2 onBoardingViewPager = findViewById(R.id.onBoardingViewPager);
            onBoardingViewPager.setAdapter(onboardingAdapter);
            setUpOnboardingIndicators();
            setCurrentOnboardingIndicator(0);
            onBoardingViewPager.registerOnPageChangeCallback(new ViewPager2.OnPageChangeCallback() {
                @Override
                public void onPageSelected(int position) {
                    super.onPageSelected(position);
                    setCurrentOnboardingIndicator(position);
                }
            });


        }
    }

    public void setOnboardingItems(DetailsClass dt){

        List<OnboardingItem> onboardingItems = new ArrayList<>();

        for(int i=0;i<3;i++)
        {

            OnboardingItem item1 = new OnboardingItem();
            item1.setImage(sliderItems.get(i).getImage());
            onboardingItems.add(item1);
        }



        onboardingAdapter = new OnboardingAdapter(onboardingItems);
    }

    private void setUpOnboardingIndicators()
    {
        ImageView[] indicators = new ImageView[onboardingAdapter.getItemCount()];
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(
                ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT
        );
        layoutParams.setMargins(8,0,8,0);
        for(int i=0;i<indicators.length;i++)
        {
            indicators[i] = new ImageView(getApplicationContext());
            indicators[i].setImageDrawable(ContextCompat.getDrawable(
                    getApplicationContext(),
                    R.drawable.onboarding_indicator_inactive
            ));
            indicators[i].setLayoutParams(layoutParams);
            layoutOnboardingIndicators.addView(indicators[i]);
        }
    }

    private void setCurrentOnboardingIndicator(int index)
    {
        int childCount = layoutOnboardingIndicators.getChildCount();
        for(int i=0;i<childCount;i++)
        {
            ImageView imageView = (ImageView)layoutOnboardingIndicators.getChildAt(i);
            if(i==index)
            {
                imageView.setImageDrawable(
                        ContextCompat.getDrawable(
                                getApplicationContext(),R.drawable.onboarding_indicator_active
                        )
                );

            }else
            {
                imageView.setImageDrawable(
                        ContextCompat.getDrawable(
                                getApplicationContext(),R.drawable.onboarding_indicator_inactive
                        )
                );
            }
        }


    }

}










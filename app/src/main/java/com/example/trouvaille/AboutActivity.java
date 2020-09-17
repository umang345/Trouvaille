package com.example.trouvaille;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;
import android.widget.TextView;

import java.util.ArrayList;

public class AboutActivity extends AppCompatActivity {

    TextView nameTextView, aboutTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);

        Toolbar toolbar = (Toolbar)findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);




        ArrayList<SliderItem> sliderItems = new ArrayList<>();
        sliderItems = (ArrayList<SliderItem>) getIntent().getSerializableExtra("list");
        nameTextView = (TextView) findViewById(R.id.nameTextView);
        aboutTextView = (TextView) findViewById(R.id.aboutTextView);
        int pos = getIntent().getExtras().getInt("pos");
        int val = getIntent().getExtras().getInt("val");

        DetailsClass dt = null;
        if (pos != -1) {
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
        }
        
        nameTextView.setText(dt.name);
        aboutTextView.setText(dt.about);

    }
}
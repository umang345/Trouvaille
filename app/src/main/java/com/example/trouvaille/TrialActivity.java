package com.example.trouvaille;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class TrialActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_trial);

        Intent intent = getIntent();
        int pos = intent.getIntExtra("pos",-1);
        int val = intent.getIntExtra("val",-1);
        TextView textView = (TextView)findViewById(R.id.trialTextView);
        textView.setText("");
        StringBuilder stringBuilder = new StringBuilder("");
        if(pos!=-1) {
            DetailsClass dt;
            switch (val)
            {
                case 1 :
                    dt = DetailsClass.foodInfo[pos];
                    break;
                case 2 :
                    dt = DetailsClass.cafeInfo[pos];
                    break;
                case 3 :
                    dt = DetailsClass.shoppingInfo[pos];
                    break;
                case 4 :
                    dt = DetailsClass.hotelInfo[pos];
                    break;
                case 5 :
                    dt = DetailsClass.moviesInfo[pos];
                    break;
                case 6 :
                    dt = DetailsClass.gamingInfo[pos];
                    break;
                default:
                    dt = DetailsClass.foodInfo[pos];
            }

            stringBuilder.append(dt.name).append("\n\n");
            stringBuilder.append(dt.address).append("\n\n");
            stringBuilder.append(dt.timings).append("\n\n");
            stringBuilder.append(dt.about).append("\n\n");
        }

        textView.setText(stringBuilder.toString());

    }
}
package com.example.trouvaille;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Handler;
import android.preference.PreferenceManager;
import android.util.Log;
import android.widget.ImageView;

public class SplashScreen extends AppCompatActivity {
    private static int SPLASH_TIME_OUT = 1500;
    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);


        imageView = (ImageView)findViewById(R.id.imageView);


        new Handler().postDelayed(new Runnable(){
            @Override
            public void run() {


                    Intent registerIntent = new Intent(SplashScreen.this,Register.class);
                    registerIntent.putExtra("code",1);
                    startActivity(registerIntent);


                finish();
            }
        },SPLASH_TIME_OUT);
    }
}
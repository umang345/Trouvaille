package com.example.trouvaille;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class EntertainmentList extends AppCompatActivity {

    public void onClickEntertainment(View view)
    {
          int tag = Integer.parseInt(view.getTag().toString());
          switch (tag)
          {
              case 1 :
                  Intent foodIntent = new Intent(EntertainmentList.this,FoodActivity.class);
                  startActivity(foodIntent);
                  break;
              case 2 :
                  Intent cafeIntent = new Intent(EntertainmentList.this,CafeActivity.class);
                  startActivity(cafeIntent);
                  break;
              case 3 :
                  Intent shoppingIntent = new Intent(EntertainmentList.this,ShoppingActivity.class);
                  startActivity(shoppingIntent);
                  break;
              case 4 :
                  Intent hotelIntent = new Intent(EntertainmentList.this,HotelActivity.class);
                  startActivity(hotelIntent);
                  break;
              case 5 :
                  Intent movieIntent = new Intent(EntertainmentList.this,MoviesActivity.class);
                  startActivity(movieIntent);
                  break;
              case 6 :
                  Intent gameIntent = new Intent(EntertainmentList.this,GamingActivity.class);
                  startActivity(gameIntent);
                  break;

          }


    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_entertainment_list);

        Toolbar toolbar = (Toolbar)findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
    }
}
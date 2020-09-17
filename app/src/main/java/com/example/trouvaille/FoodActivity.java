package com.example.trouvaille;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import java.io.Serializable;
import java.util.ArrayList;

public class FoodActivity extends AppCompatActivity {

    int photo[] = {R.drawable.kfc1
                    ,R.drawable.barbequenation1
                    ,R.drawable.miamor1
                    ,R.drawable.mashaya3
                    ,R.drawable.orchid3
                    ,R.drawable.burgerking2};
    String name[] = {"KFC"
                    ,"Barbeque Nation"
                    ,"Mi Amor"
                    ,"Mashaya"
                    ,"Orchid"
                    ,"Burger King"};
    ListView mList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food);

        Toolbar toolbar = (Toolbar)findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);




        mList = (ListView)findViewById(R.id.listview);
        CustomAdapter customAdapter = new CustomAdapter();
        mList.setAdapter(customAdapter);

        mList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                ArrayList<SliderItem> list = new ArrayList<>();

                      Intent intent = new Intent(FoodActivity.this,DetailsActivity.class);
                      intent.putExtra("pos",position);
                      intent.putExtra("val",1);

                      switch (position)
                      {
                          case 0 :
                              list.add(new SliderItem(R.drawable.kfc1));
                              list.add(new SliderItem(R.drawable.kfc2));
                              list.add(new SliderItem(R.drawable.kfc3));
                              break;
                          case 1 :
                              list.add(new SliderItem(R.drawable.barbequenation1));
                              list.add(new SliderItem(R.drawable.barbequenation2));
                              list.add(new SliderItem(R.drawable.barbequenation3));
                              break;
                          case 2 :
                              list.add(new SliderItem(R.drawable.miamor1));
                              list.add(new SliderItem(R.drawable.miamor2));
                              list.add(new SliderItem(R.drawable.miamor3));
                              break;
                          case 3 :
                              list.add(new SliderItem(R.drawable.mashaya1));
                              list.add(new SliderItem(R.drawable.mashaya2));
                              list.add(new SliderItem(R.drawable.mashaya3));
                              break;
                          case 4 :
                              list.add(new SliderItem(R.drawable.orchid1));
                              list.add(new SliderItem(R.drawable.orchid2));
                              list.add(new SliderItem(R.drawable.orchid3));
                              break;
                          case 5 :
                              list.add(new SliderItem(R.drawable.burgerking1));
                              list.add(new SliderItem(R.drawable.burgerking2));
                              list.add(new SliderItem(R.drawable.burgerking3));
                              break;
                      }

                      intent.putExtra("list",list);

                      startActivity(intent);
            }
        });





    }

    class CustomAdapter extends BaseAdapter {

        @Override
        public int getCount() {
            return photo.length;
        }

        @Override
        public Object getItem(int position) {
            return null;
        }

        @Override
        public long getItemId(int position) {
            return 0;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            View view = getLayoutInflater().inflate(R.layout.custom_list_item,null);
            ImageView mImageView = (ImageView)view.findViewById(R.id.imageView);
            TextView mTextView = (TextView)view.findViewById(R.id.textView);

            mImageView.setImageResource(photo[position]);
            mTextView.setText(name[position]);

            return view;
        }
    }


}
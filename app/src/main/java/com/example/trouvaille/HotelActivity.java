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

import java.util.ArrayList;

public class HotelActivity extends AppCompatActivity {

    int photo[] = {R.drawable.fortuneinn1
            ,R.drawable.lemontree3
            ,R.drawable.krishnasagar1
            ,R.drawable.radissonblu1
            ,R.drawable.vaishallinn1};
    String name[] = {"Fortune Inn Grazia"
            ,"Lemon Tree"
            ,"Krishna Sagar"
            ,"Radisson Blu"
            ,"Vaishalli Inn"};
    ListView mList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hotel);

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

                Intent intent = new Intent(HotelActivity.this,DetailsActivity.class);
                intent.putExtra("pos",position);
                intent.putExtra("val",4);

                switch (position)
                {
                    case 0 :
                        list.add(new SliderItem(R.drawable.fortuneinn1));
                        list.add(new SliderItem(R.drawable.fortuneinn2));
                        list.add(new SliderItem(R.drawable.fortuneinn3));
                        break;
                    case 1 :
                        list.add(new SliderItem(R.drawable.lemontree1));
                        list.add(new SliderItem(R.drawable.lemontree2));
                        list.add(new SliderItem(R.drawable.lemontree3));
                        break;
                    case 2 :
                        list.add(new SliderItem(R.drawable.krishnasagar1));
                        list.add(new SliderItem(R.drawable.krishnasagar2));
                        list.add(new SliderItem(R.drawable.krishnasagar3));
                        break;
                    case 3 :
                        list.add(new SliderItem(R.drawable.radissonblu1));
                        list.add(new SliderItem(R.drawable.radissonblu2));
                        list.add(new SliderItem(R.drawable.radissonblu3));
                        break;
                    case 4 :
                        list.add(new SliderItem(R.drawable.vaishallinn1));
                        list.add(new SliderItem(R.drawable.vaishallinn2));
                        list.add(new SliderItem(R.drawable.vaishallinn3));
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
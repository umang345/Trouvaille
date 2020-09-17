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

public class MoviesActivity extends AppCompatActivity {

    int photo[] = {R.drawable.wave1
            ,R.drawable.pvredm1
            ,R.drawable.srs1
            ,R.drawable.galaxie1
            ,R.drawable.carnival1};
    String name[] = {"Wave Cinema"
            ,"PVR EDM"
            ,"SRS Cinema"
            ,"Galaxie Multiplex"
            ,"Carnival Cinema"};
    ListView mList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_movies);

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

                Intent intent = new Intent(MoviesActivity.this,DetailsActivity.class);
                intent.putExtra("pos",position);
                intent.putExtra("val",5);

                switch (position)
                {
                    case 0 :
                        list.add(new SliderItem(R.drawable.wave1));
                        list.add(new SliderItem(R.drawable.wave2));
                        list.add(new SliderItem(R.drawable.wave3));
                        break;
                    case 1 :
                        list.add(new SliderItem(R.drawable.pvredm1));
                        list.add(new SliderItem(R.drawable.pvredm2));
                        list.add(new SliderItem(R.drawable.pvredm3));
                        break;
                    case 2 :
                        list.add(new SliderItem(R.drawable.srs1));
                        list.add(new SliderItem(R.drawable.srs2));
                        list.add(new SliderItem(R.drawable.srs3));
                        break;
                    case 3 :
                        list.add(new SliderItem(R.drawable.galaxie1));
                        list.add(new SliderItem(R.drawable.galaxie2));
                        list.add(new SliderItem(R.drawable.galaxie3));
                        break;
                    case 4 :
                        list.add(new SliderItem(R.drawable.carnival1));
                        list.add(new SliderItem(R.drawable.carnival2));
                        list.add(new SliderItem(R.drawable.carnival3));
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
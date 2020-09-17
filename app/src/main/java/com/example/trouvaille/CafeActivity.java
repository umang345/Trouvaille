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

public class CafeActivity extends AppCompatActivity {

    int photo[] = {R.drawable.readerscafe2
            ,R.drawable.cafewink3
            ,R.drawable.ccd1
            ,R.drawable.barista1
            ,R.drawable.frostnfun3};
    String name[] = {"Reader's Cafe"
            ,"Cafe Wink"
            ,"Cafe Coffee Day"
            ,"Barista Lavazza"
            ,"Frost n Fun"};
    ListView mList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cafe);

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

                Intent intent = new Intent(CafeActivity.this,DetailsActivity.class);
                intent.putExtra("pos",position);
                intent.putExtra("val",2);

                switch (position)
                {
                    case 0 :
                        list.add(new SliderItem(R.drawable.readerscafe1));
                        list.add(new SliderItem(R.drawable.readerscafe2));
                        list.add(new SliderItem(R.drawable.readerscafe3));
                        break;
                    case 1 :
                        list.add(new SliderItem(R.drawable.cafewink1));
                        list.add(new SliderItem(R.drawable.cafewink2));
                        list.add(new SliderItem(R.drawable.cafewink3));
                        break;
                    case 2 :
                        list.add(new SliderItem(R.drawable.ccd1));
                        list.add(new SliderItem(R.drawable.ccd2));
                        list.add(new SliderItem(R.drawable.ccd3));
                        break;
                    case 3 :
                        list.add(new SliderItem(R.drawable.barista1));
                        list.add(new SliderItem(R.drawable.barista2));
                        list.add(new SliderItem(R.drawable.barista3));
                        break;
                    case 4 :
                        list.add(new SliderItem(R.drawable.frostnfun1));
                        list.add(new SliderItem(R.drawable.frostnfun2));
                        list.add(new SliderItem(R.drawable.frostnfun3));
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
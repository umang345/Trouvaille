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

public class ShoppingActivity extends AppCompatActivity {

    int photo[] = {R.drawable.shipramall3
            ,R.drawable.opulent2
            ,R.drawable.pacific1
            ,R.drawable.indirapuram1
            ,R.drawable.gaurmall3};
    String name[] = {"Shipra Mall"
            ,"Opulent Mall"
            ,"Pacific Mall"
            ,"Indirapuram Habitat Center"
            ,"Gaur Central Mall"};
    ListView mList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shopping);

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

                Intent intent = new Intent(ShoppingActivity.this,DetailsActivity.class);
                intent.putExtra("pos",position);
                intent.putExtra("val",3);

                switch (position)
                {
                    case 0 :
                        list.add(new SliderItem(R.drawable.shipramall1));
                        list.add(new SliderItem(R.drawable.shipramall2));
                        list.add(new SliderItem(R.drawable.shipramall3));
                        break;
                    case 1 :
                        list.add(new SliderItem(R.drawable.opulent1));
                        list.add(new SliderItem(R.drawable.opulent2));
                        list.add(new SliderItem(R.drawable.opulent3));
                        break;
                    case 2 :
                        list.add(new SliderItem(R.drawable.pacific1));
                        list.add(new SliderItem(R.drawable.pacific2));
                        list.add(new SliderItem(R.drawable.pacific3));
                        break;
                    case 3 :
                        list.add(new SliderItem(R.drawable.indirapuram1));
                        list.add(new SliderItem(R.drawable.indirapuram2));
                        list.add(new SliderItem(R.drawable.indirapuram3));
                        break;
                    case 4 :
                        list.add(new SliderItem(R.drawable.gaurmall1));
                        list.add(new SliderItem(R.drawable.gaurmall2));
                        list.add(new SliderItem(R.drawable.gaurmall3));
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
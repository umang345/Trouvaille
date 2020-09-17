package com.example.trouvaille;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class ReviewActivity extends AppCompatActivity {

    private ArrayList<SliderItem> sliderItems = new ArrayList<>();
    String array[];
    ListView mList;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_review);

        Toolbar toolbar = (Toolbar)findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);



        sliderItems = (ArrayList<SliderItem>) getIntent().getSerializableExtra("list");
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
        array = dt.reviews.trim().split("&&&&");
        mList = (ListView)findViewById(R.id.reviewListView);
        ReviewCustomAdapter customAdapter = new ReviewCustomAdapter();
        mList.setAdapter(customAdapter);





    }

    class ReviewCustomAdapter extends BaseAdapter {

        @Override
        public int getCount() {
            return array.length;
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
            View view = getLayoutInflater().inflate(R.layout.custom_review_list_item,null);

            TextView mTextView = (TextView)view.findViewById(R.id.reviewTextView);
            mTextView.setText(array[position]);

            return view;
        }
    }
}
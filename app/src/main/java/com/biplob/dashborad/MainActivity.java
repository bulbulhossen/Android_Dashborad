package com.biplob.dashborad;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private GridView gridView;
    private GridViewAdapter customGridAdapter;
    ArrayList<ImageItem> imageItems = new ArrayList<ImageItem>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //Set Grid View Item

        Bitmap one = BitmapFactory.decodeResource(this.getResources(), R.drawable.home);
        Bitmap two = BitmapFactory.decodeResource(this.getResources(), R.drawable.rate);
        Bitmap three = BitmapFactory.decodeResource(this.getResources(), R.drawable.watch);
        Bitmap four = BitmapFactory.decodeResource(this.getResources(), R.drawable.search);
        Bitmap five = BitmapFactory.decodeResource(this.getResources(), R.drawable.news);
        Bitmap six = BitmapFactory.decodeResource(this.getResources(), R.drawable.user2);

        imageItems.add(new ImageItem(one, "Current Market"));
        imageItems.add(new ImageItem(two, "Market Ratting"));
        imageItems.add(new ImageItem(three, "Watch List"));
        imageItems.add(new ImageItem(four, "Search Compnay"));
        imageItems.add(new ImageItem(five, "Market News"));
        imageItems.add(new ImageItem(six, "User Setting"));

        gridView = (GridView) findViewById(R.id.gridView);
        customGridAdapter = new GridViewAdapter(this, R.layout.row_grid, imageItems);


        gridView.setAdapter(customGridAdapter);
        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View v, int position, long id) {

            }
        });
    }
}

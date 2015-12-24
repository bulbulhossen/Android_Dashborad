package com.biplob.dashborad;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;

import java.util.ArrayList;

public class Grid_main_Activity extends AppCompatActivity {

    private GridView gridView;
    private GridViewAdapter customGridAdapter;
    ArrayList<Gridview_ImageItem> imageItems = new ArrayList<Gridview_ImageItem>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.grid_layout);


        //Set Grid View Item

        Bitmap one = BitmapFactory.decodeResource(this.getResources(), R.drawable.home);
        Bitmap two = BitmapFactory.decodeResource(this.getResources(), R.drawable.rate);
        Bitmap three = BitmapFactory.decodeResource(this.getResources(), R.drawable.watch);
        Bitmap four = BitmapFactory.decodeResource(this.getResources(), R.drawable.search);
        Bitmap five = BitmapFactory.decodeResource(this.getResources(), R.drawable.news);
        Bitmap six = BitmapFactory.decodeResource(this.getResources(), R.drawable.user2);

        imageItems.add(new Gridview_ImageItem(one, "Current Market"));
        imageItems.add(new Gridview_ImageItem(two, "Market Ratting"));
        imageItems.add(new Gridview_ImageItem(three, "Watch List"));
        imageItems.add(new Gridview_ImageItem(four, "Search Compnay"));
        imageItems.add(new Gridview_ImageItem(five, "Market News"));
        imageItems.add(new Gridview_ImageItem(six, "User Setting"));

        gridView = (GridView) findViewById(R.id.gridView);
        customGridAdapter = new GridViewAdapter(this, R.layout.row_grid, imageItems);


        gridView.setAdapter(customGridAdapter);
        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View v, int position, long id) {

            }
        });
    }
}

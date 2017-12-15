package com.example.lenovo.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;



import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.support.design.widget.CollapsingToolbarLayout;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.widget.ImageView;
import android.widget.TextView;


public class PracticalDetailActivity extends AppCompatActivity {
    public static final String EXTRA_POSITION = "position";

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_practical);
        setSupportActionBar((Toolbar) findViewById(R.id.toolbar));
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        CollapsingToolbarLayout collapsingToolbar = (CollapsingToolbarLayout) findViewById(R.id.collapsing_toolbar);
        int postion = getIntent().getIntExtra(EXTRA_POSITION, 0);
        Resources resources = getResources();
        String[] places = resources.getStringArray(R.array.workshop_practicals);
        collapsingToolbar.setTitle(places[postion % places.length]);
        String[] placeName = resources.getStringArray(R.array.workshop_practicals);
        ((TextView) findViewById(R.id.place_detail)).setText(placeName[postion % placeName.length]);
        String[] placeDetails = resources.getStringArray(R.array.practical_desc);
        ((TextView) findViewById(R.id.place_achievement)).setText(placeDetails[postion % placeDetails.length]);

        TypedArray placePictures = resources.obtainTypedArray(R.array.practical_pic);
        ((ImageView) findViewById(R.id.imgs1)).setImageDrawable(placePictures.getDrawable(postion % placePictures.length()));
        placePictures.recycle();
    }
}


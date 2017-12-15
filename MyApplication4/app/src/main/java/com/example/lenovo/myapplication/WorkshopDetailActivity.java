package com.example.lenovo.myapplication;


        import android.content.res.Resources;
        import android.content.res.TypedArray;
        import android.os.Bundle;
        import android.support.design.widget.CollapsingToolbarLayout;
        import android.support.v7.app.AppCompatActivity;
        import android.support.v7.widget.Toolbar;
        import android.widget.ImageView;
        import android.widget.TextView;


public class WorkshopDetailActivity extends AppCompatActivity {
    public static final String EXTRA_POSITION = "position";

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_workshop_detail);
        setSupportActionBar((Toolbar) findViewById(R.id.toolbar));
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        CollapsingToolbarLayout collapsingToolbar = (CollapsingToolbarLayout) findViewById(R.id.collapsing_toolbar);
        int postion = getIntent().getIntExtra(EXTRA_POSITION, 0);
        Resources resources = getResources();
        String[] places = resources.getStringArray(R.array.workshop_title);
        collapsingToolbar.setTitle(places[postion % places.length]);
        String[] placetitle = resources.getStringArray(R.array.workshop_title);
        ((TextView) findViewById(R.id.place_title)).setText(placetitle[postion % placetitle.length]);
        String[] placetopic = resources.getStringArray(R.array.workshop_topics);
        ((TextView) findViewById(R.id.place_topic)).setText(placetopic[postion % placetopic.length]);
        String[] placeContact = resources.getStringArray(R.array.workshop_desc);
        ((TextView) findViewById(R.id.place_detail)).setText(placeContact[postion % placeContact.length]);
        String[] placeDetails = resources.getStringArray(R.array.workshop_members);
        ((TextView) findViewById(R.id.place_member)).setText(placeDetails[postion % placeDetails.length]);
        ((TextView) findViewById(R.id.place_contact)).setText(resources.getStringArray(R.array.workshop_contact)[postion % placeDetails.length]);
        ((TextView) findViewById(R.id.place_future)).setText(resources.getStringArray(R.array.workshop_future)[postion % placeDetails.length]);
        TypedArray placePictures = resources.obtainTypedArray(R.array.workshop_pic);
        ((ImageView) findViewById(R.id.image)).setImageDrawable(placePictures.getDrawable(postion % placePictures.length()));
        placePictures.recycle();
    }
}


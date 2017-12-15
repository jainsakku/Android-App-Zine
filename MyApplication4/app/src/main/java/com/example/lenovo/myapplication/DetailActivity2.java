package com.example.lenovo.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailActivity2 extends AppCompatActivity {

    private static final String BUNDLE_EXTRAS2 = "BUNDLE_EXTRAS2";
    private static final String EXTRA_QUOTE2 = "EXTRA_QUOTE2";
    private static final String EXTRA_ATTR2 = "EXTRA_ATTR2";
    private static final String gimage2 = "gimage2";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail2);

        Bundle extras = getIntent().getBundleExtra(BUNDLE_EXTRAS2);
        final Toolbar toolbar =(Toolbar)findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar();

        setTitle(extras.getString(EXTRA_ATTR2));

        ((TextView)findViewById(R.id.lbl_quote_text2)).setText(extras.getString(EXTRA_QUOTE2));
        ((TextView)findViewById(R.id.lbl_quote_attribution2)).setText(extras.getString(EXTRA_ATTR2));
        ((ImageView)findViewById(R.id.imgs2)).setImageResource(extras.getInt(gimage2));
    }
}

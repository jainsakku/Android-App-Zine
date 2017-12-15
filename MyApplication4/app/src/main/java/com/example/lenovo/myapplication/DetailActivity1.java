package com.example.lenovo.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailActivity1 extends AppCompatActivity {

    private static final String BUNDLE_EXTRAS1 = "BUNDLE_EXTRAS1";
    private static final String EXTRA_QUOTE1 = "EXTRA_QUOTE1";
    private static final String EXTRA_ATTR1 = "EXTRA_ATTR1";
    private static final String gimage1 = "gimage1";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail1);
        Bundle extras = getIntent().getBundleExtra(BUNDLE_EXTRAS1);
        final Toolbar toolbar =(Toolbar)findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar();

        setTitle(extras.getString(EXTRA_ATTR1));

        ((TextView)findViewById(R.id.lbl_quote_text1)).setText(extras.getString(EXTRA_QUOTE1));
        ((TextView)findViewById(R.id.lbl_quote_attribution1)).setText(extras.getString(EXTRA_ATTR1));
        ((ImageView)findViewById(R.id.imgs1)).setImageResource(extras.getInt(gimage1));

    }
}

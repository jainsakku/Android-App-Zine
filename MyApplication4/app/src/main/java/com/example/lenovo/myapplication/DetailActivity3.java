package com.example.lenovo.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailActivity3 extends AppCompatActivity {

    private static final String BUNDLE_EXTRAS3 = "BUNDLE_EXTRAS3";
    private static final String EXTRA_QUOTE3 = "EXTRA_QUOTE3";
    private static final String EXTRA_ATTR3 = "EXTRA_ATTR3";
    private static final String gimage3 = "gimage3";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail3);

        Bundle extras = getIntent().getBundleExtra(BUNDLE_EXTRAS3);
        final Toolbar toolbar =(Toolbar)findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar();

        setTitle(extras.getString(EXTRA_ATTR3));

        ((TextView)findViewById(R.id.lbl_quote_text3)).setText(extras.getString(EXTRA_QUOTE3));
        ((TextView)findViewById(R.id.lbl_quote_attribution3)).setText(extras.getString(EXTRA_ATTR3));
        ((ImageView)findViewById(R.id.imgs3)).setImageResource(extras.getInt(gimage3));

    }
}

package com.example.lenovo.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;

import java.util.ArrayList;

public class ListActivity extends AppCompatActivity implements DerpAdapter.ItemClickCallback{

    private static final String BUNDLE_EXTRAS = "BUNDLE_EXTRAS";
    private static final String EXTRA_QUOTE = "EXTRA_QUOTE";
    private static final String EXTRA_ATTR = "EXTRA_ATTR";
    private static final String gimage = "gimage";






    private RecyclerView recView;
    private DerpAdapter adapter;
    private ArrayList listData;
    private GridLayoutManager Glayout;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);
        final Toolbar toolbar =(Toolbar)findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar();
        setTitle("first year");


        listData= (ArrayList) DerpData.getListData();
        Glayout = new GridLayoutManager(ListActivity.this, 2);

        recView=(RecyclerView)findViewById(R.id.rec_list);
        //LayoutManager grid layout or staggered or linear
        recView.setLayoutManager(Glayout);

        adapter = new DerpAdapter(DerpData.getListData(),this);
        recView.setAdapter(adapter);
        adapter.setItemClickCallback(this);



    }

    @Override
    public void onItemClick(int p) {

        ListItem item=(ListItem) listData.get(p);
        Intent i =new Intent(this,DetailActivity.class);

        Bundle extras = new Bundle();
        extras.putString(EXTRA_QUOTE, item.getTitle());
        extras.putString(EXTRA_ATTR, item.getSubtitle());
        extras.putInt(gimage,item.getImageResId());





        i.putExtra(BUNDLE_EXTRAS,extras);
        startActivity(i);

    }

    @Override
    public void onSecondaryIconClick(int p) {
        ListItem item = (ListItem) listData.get(p);
        //update our data

        //pass new data to adapter and update
        adapter.setListData(listData);
        adapter.notifyDataSetChanged();

    }
}

package com.example.lenovo.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;

import java.util.ArrayList;

public class ListActivity1 extends AppCompatActivity implements DerpAdapter1.ItemClickCallback1{

    private static final String BUNDLE_EXTRAS1 = "BUNDLE_EXTRAS1";
    private static final String EXTRA_QUOTE1 = "EXTRA_QUOTE1";
    private static final String EXTRA_ATTR1 = "EXTRA_ATTR1";
    private static final String gimage1 = "gimage1";

    private RecyclerView recView1;
    private DerpAdapter1 adapter1;
    private ArrayList listData1;
    private GridLayoutManager Glayout1;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list1);
        final Toolbar toolbar =(Toolbar)findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar();
        setTitle("Third Year");

        listData1= (ArrayList) DerpData1.getListData1();
        Glayout1 = new GridLayoutManager(ListActivity1.this, 2);

        recView1=(RecyclerView)findViewById(R.id.rec_list1);
        //LayoutManager grid layout or staggered or linear
        recView1.setLayoutManager(Glayout1);

        adapter1 = new DerpAdapter1(DerpData1.getListData1(),this);
        recView1.setAdapter(adapter1);
        adapter1.setItemClickCallback1(this);



    }

    @Override
    public void onItemClick1(int q) {

        ListItem1 item=(ListItem1) listData1.get(q);
        Intent i =new Intent(this,DetailActivity1.class);

        Bundle extras1 = new Bundle();
        extras1.putString(EXTRA_QUOTE1, item.getTitle1());
        extras1.putString(EXTRA_ATTR1, item.getSubtitle1());
        extras1.putInt(gimage1,item.getImageResId1());

        i.putExtra(BUNDLE_EXTRAS1,extras1);
        startActivity(i);

    }


}

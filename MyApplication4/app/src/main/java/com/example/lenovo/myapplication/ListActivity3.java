package com.example.lenovo.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;

import java.util.ArrayList;

public class ListActivity3 extends AppCompatActivity implements DerpAdapter3.ItemClickCallback3{

    private static final String BUNDLE_EXTRAS3 = "BUNDLE_EXTRAS3";
    private static final String EXTRA_QUOTE3 = "EXTRA_QUOTE3";
    private static final String EXTRA_ATTR3 = "EXTRA_ATTR3";
    private static final String gimage3 = "gimage3";


    private RecyclerView recView3;
    private DerpAdapter3 adapter3;
    private ArrayList listData3;
    private GridLayoutManager Glayout3;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list3);
        final Toolbar toolbar =(Toolbar)findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar();
        setTitle("Workshop");

        listData3= (ArrayList) DerpData3.getListData3();
        Glayout3 = new GridLayoutManager(ListActivity3.this, 2);

        recView3=(RecyclerView)findViewById(R.id.rec_list3);
        //LayoutManager grid layout or staggered or linear
        recView3.setLayoutManager(Glayout3);

        adapter3 = new DerpAdapter3(DerpData3.getListData3(),this);
        recView3.setAdapter(adapter3);
        adapter3.setItemClickCallback3(this);



    }

    @Override
    public void onItemClick3(int p) {

        ListItem3 item=(ListItem3) listData3.get(p);
        Intent i =new Intent(this,DetailActivity3.class);

        Bundle extras = new Bundle();
        extras.putString(EXTRA_QUOTE3, item.getTitle3());
        extras.putString(EXTRA_ATTR3, item.getSubtitle3());
        extras.putInt(gimage3,item.getImageResId3());

        i.putExtra(BUNDLE_EXTRAS3,extras);
        startActivity(i);

    }


}

package com.example.lenovo.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;

import java.util.ArrayList;

public class ListActivity2 extends AppCompatActivity implements DerpAdapter2.ItemClickCallback2{

    private static final String BUNDLE_EXTRAS2 = "BUNDLE_EXTRAS2";
    private static final String EXTRA_QUOTE2 = "EXTRA_QUOTE2";
    private static final String EXTRA_ATTR2 = "EXTRA_ATTR2";
    private static final String gimage2 = "gimage2";


    private RecyclerView recView2;
    private DerpAdapter2 adapter2;
    private ArrayList listData2;
    private GridLayoutManager Glayout2;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list2);
        final Toolbar toolbar =(Toolbar)findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar();
        setTitle("Fourth Year");
        listData2= (ArrayList) DerpData2.getListData2();
        Glayout2 = new GridLayoutManager(ListActivity2.this, 2);

        recView2=(RecyclerView)findViewById(R.id.rec_list2);
        //LayoutManager grid layout or staggered or linear
        recView2.setLayoutManager(Glayout2);

        adapter2 = new DerpAdapter2(DerpData2.getListData2(),this);
        recView2.setAdapter(adapter2);
        adapter2.setItemClickCallback2(this);



    }

    @Override
    public void onItemClick2(int r) {

        ListItem2 item=(ListItem2) listData2.get(r);
        Intent i =new Intent(this,DetailActivity2.class);

        Bundle extras2 = new Bundle();
        extras2.putString(EXTRA_QUOTE2, item.getTitle2());
        extras2.putString(EXTRA_ATTR2, item.getSubtitle2());
        extras2.putInt(gimage2,item.getImageResId2());

        i.putExtra(BUNDLE_EXTRAS2,extras2);
        startActivity(i);

    }


}


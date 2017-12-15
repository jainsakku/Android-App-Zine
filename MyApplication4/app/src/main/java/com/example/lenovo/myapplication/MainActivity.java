package com.example.lenovo.myapplication;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;

import android.support.design.widget.TabLayout;

import android.support.v4.view.ViewPager;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.view.View;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity
        {
      TabLayout tabLayout;
    ViewPager viewPager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        setTitle("Zine");
        viewPager = (ViewPager) findViewById(R.id.viewpager);
        setupViewPager(viewPager);

        tabLayout = (TabLayout) findViewById(R.id.tabs);
        tabLayout.setupWithViewPager(viewPager);


        final DrawerLayout drawer  = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected( MenuItem menuItem){
                int id =menuItem.getItemId();
                if (id==R.id.Home)
                { startActivity(new Intent(MainActivity.this,MainActivity.class));
                setTitle("Home");}
               else if (id==R.id.Aboutus)
                { startActivity(new Intent(MainActivity.this,Ourmentor1.class));}

                else if (id==R.id. Contactus)
                { MainActivity.this.startActivity(new Intent(MainActivity.this,contact.class));}
                else if (id==R.id. Achievements)
                { MainActivity.this.startActivity(new Intent(MainActivity.this,Achivements.class));}
                else if (id==R.id.FAQ)
                { startActivity(new Intent(MainActivity.this,faq1.class));}
                else if (id==R.id.Projects)
                { startActivity(new Intent(MainActivity.this,ProjectsActivity.class));}
                else if (id==R.id.Query)
                { startActivity(new Intent(MainActivity.this,FAQactivity.class));
                }

                else if (id==R.id.workshop)
                { startActivity(new Intent(MainActivity.this,ListActivity3.class));
                }


                else if (id==R.id.Register)
                { startActivity(new Intent(MainActivity.this,RegisterActivity.class));
                }
                else if (id==R.id.year2)
                { startActivity(new Intent(MainActivity.this,ListActivity.class));
                }
                else if (id==R.id.year3)
                { startActivity(new Intent(MainActivity.this,ListActivity1.class));
                }
                else if (id==R.id.year4)
                { startActivity(new Intent(MainActivity.this,ListActivity2.class));
                }










                menuItem.setChecked(true);

               drawer.closeDrawers();
                return true;
            }
        });

    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id==R.id.action_settings)
        {

                Intent intent= new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("http:/www.zine.co.in"));
                startActivity(intent);

        }

        //noinspection SimplifiableIfStatement



        return super.onOptionsItemSelected(item);
    }





    private void setupViewPager(ViewPager viewPager) {
        ViewPagerAdapter adapter = new ViewPagerAdapter(getSupportFragmentManager());
        adapter.addFragment(new home(), "HOME");
        adapter.addFragment(new Ourmentor(), "OUR MENTOR");

        viewPager.setAdapter(adapter);
    }
    class ViewPagerAdapter extends FragmentPagerAdapter {
        private final List<Fragment> mFragmentList = new ArrayList<>();
        private final List<String> mFragmentTitleList = new ArrayList<>();

        public ViewPagerAdapter(FragmentManager manager) {
            super(manager);
        }

        @Override
        public Fragment getItem(int position) {
            return mFragmentList.get(position);
        }

        @Override
        public int getCount() {
            return mFragmentList.size();
        }

        public void addFragment(Fragment fragment, String title) {
            mFragmentList.add(fragment);
            mFragmentTitleList.add(title);
        }

        @Override
        public CharSequence getPageTitle(int position) {
            return mFragmentTitleList.get(position);
        }
    }
}

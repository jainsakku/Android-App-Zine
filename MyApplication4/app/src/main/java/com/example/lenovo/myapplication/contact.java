package com.example.lenovo.myapplication;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.app.FragmentTransaction;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;





public class contact extends AppCompatActivity
{   public void Meenal(View v) {

    Uri mUri = Uri.parse("smsto:+9478789319");
    Intent mIntent = new Intent(Intent.ACTION_SENDTO, mUri);
    mIntent.setPackage("com.whatsapp");
    startActivity(mIntent);
}
    public void Tejeswar(View v) {

        Uri mUri = Uri.parse("smsto:+7424825250");
        Intent mIntent = new Intent(Intent.ACTION_SENDTO, mUri);
        mIntent.setPackage("com.whatsapp");
        startActivity(mIntent);
    }
    public void Kusum(View v) {

        Uri mUri = Uri.parse("smsto:+8003704225");
        Intent mIntent = new Intent(Intent.ACTION_SENDTO, mUri);
        mIntent.setPackage("com.whatsapp");
        startActivity(mIntent);
    }
    public void Anshul(View v) {

        Uri mUri = Uri.parse("smsto:+8506012696");
        Intent mIntent = new Intent(Intent.ACTION_SENDTO, mUri);
        mIntent.setPackage("com.whatsapp");
        startActivity(mIntent);
    }

    public void Kriti(View v) {

        Uri mUri = Uri.parse("smsto:+9828042882");
        Intent mIntent = new Intent(Intent.ACTION_SENDTO, mUri);
        mIntent.setPackage("com.whatsapp");
        startActivity(mIntent);


    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


    }}

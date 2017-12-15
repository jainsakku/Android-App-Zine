package com.example.lenovo.myapplication;

/**
 * Created by lenovo on 7/31/2017.
 */

public class ListItem1{

    private String title;
    private String subtitle;
    private boolean favourite = false;
    int imageResId1;

    public ListItem1(String title, String subtitle, int imageResId1) {
        this.title=title;
        this.subtitle=subtitle;
        this.imageResId1=imageResId1;


    }


    public String getSubtitle1() {
        return subtitle;
    }

    public void setSubtitle1(String subtitle) {
        this.subtitle = subtitle;
    }

    public boolean isFavourite() {
        return favourite;
    }

    public void setFavourite(boolean favourite) {
        this.favourite = favourite;
    }

    private int imageResId;

    public String getTitle1() {
        return title;
    }

    public void setTitle1(String title) {
        this.title = title;
    }

    public int getImageResId1() {
        return imageResId1;
    }

    public void setImageResId(int imageResId) {
        this.imageResId = imageResId;
    }



}

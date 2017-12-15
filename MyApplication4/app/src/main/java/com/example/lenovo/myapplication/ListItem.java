package com.example.lenovo.myapplication;

/**
 * Java Representation of our data to be displayed in the recycler view
 * Created by Admin on 6/10/2017.
 */

public class ListItem {

    private String title;
    private String subtitle;
    private boolean favourite = false;

    public ListItem(String title, String subtitle, int imageResId) {
        this.title=title;
        this.subtitle=subtitle;
        this.imageResId=imageResId;


    }


    public String getSubtitle() {
        return subtitle;
    }

    public void setSubtitle(String subtitle) {
        this.subtitle = subtitle;
    }

    public boolean isFavourite() {
        return favourite;
    }

    public void setFavourite(boolean favourite) {
        this.favourite = favourite;
    }

    private int imageResId;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getImageResId() {
        return imageResId;
    }

    public void setImageResId(int imageResId) {
        this.imageResId = imageResId;
    }



}

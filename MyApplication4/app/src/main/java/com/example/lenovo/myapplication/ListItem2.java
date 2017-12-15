package com.example.lenovo.myapplication;

/**
 * Created by Admin on 7/31/2017.
 */

public class ListItem2 {

    private String title2;
    private String subtitle2;
    private boolean favourite2 = false;

    public ListItem2(String title2, String subtitle2, int imageResId2) {
        this.title2=title2;
        this.subtitle2=subtitle2;
        this.imageResId2=imageResId2;
    }

    public String getSubtitle2() {
        return subtitle2;
    }

    public void setSubtitle2(String subtitle2) {
        this.subtitle2 = subtitle2;
    }

    public boolean isFavourite2() {
        return favourite2;
    }

    public void setFavourite2(boolean favourite2) {
        this.favourite2 = favourite2;
    }

    private int imageResId2;

    public String getTitle2() {
        return title2;
    }

    public void setTitle2(String title2) {
        this.title2 = title2;
    }

    public int getImageResId2() {
        return imageResId2;
    }

    public void setImageResId2(int imageResId2) {
        this.imageResId2 = imageResId2;
    }
}

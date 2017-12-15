package com.example.lenovo.myapplication;

/**
 * Created by Admin on 7/31/2017.
 */



/**
 * Created by Admin on 7/31/2017.
 */

public class ListItem3 {

    private String title3;
    private String subtitle3;
    private boolean favourite3 = false;

    public ListItem3(int imageResId3,String subtitle3,  String title3) {
        this.title3=title3;
        this.subtitle3=subtitle3;
        this.imageResId3=imageResId3;
    }

    public String getSubtitle3() {
        return subtitle3;
    }

    public void setSubtitle3(String subtitle3) {
        this.subtitle3 = subtitle3;
    }

    public boolean isFavourite3() {
        return favourite3;
    }

    public void setFavourite3(boolean favourite3) {
        this.favourite3 = favourite3;
    }

    private int imageResId3;

    public String getTitle3() {
        return title3;
    }

    public void setTitle3(String title3) {
        this.title3 = title3;
    }

    public int getImageResId3() {
        return imageResId3;
    }

    public void setImageResId3(int imageResId3) {
        this.imageResId3 = imageResId3;
    }
}


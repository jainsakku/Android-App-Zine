package com.example.lenovo.myapplication;

public class Game2 {
    private String name;


    private int imageSource;
    private String projectdetail;
    private String projectmembers;

    public Game2(int imageSource, String name, String projectdetail, String projectmembers) {
        this.name = name;
        this.imageSource = imageSource;
        this.projectdetail = projectdetail;
        this.projectmembers = projectmembers;

    }

    public String getName() {
        return name;
    }

    public int getImageSource() {
        return imageSource;
    }

    public String getProjectdetail() {
        return projectdetail;
    }

    public String getProjectmembers() {
        return projectmembers;
    }
}
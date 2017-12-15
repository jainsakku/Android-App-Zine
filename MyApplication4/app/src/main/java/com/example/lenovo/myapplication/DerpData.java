package com.example.lenovo.myapplication;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Admin on 6/10/2017.
 */


public class DerpData {


    public static List <ListItem> getListData() {
        List <ListItem> data = new ArrayList <>();

        data.add(new ListItem("Branch:\n  Engineering \n \nAchievements\nFinalists in the event B.R.I.C.K.S. atKshitij 2017(IIT Kharagpur) \n \n ","Ronak Gupta", R.drawable.rg));

        data.add(new ListItem("Branch:\n Electronics And Communication Engineering \n \nAchievements\nFinalists in theevent B.R.I.C.K.S.at Kshitij 2017(IIT Kharagpur)","HardikAjmera", R.drawable.rg));

        data.add(new ListItem("Branch:\n Computer Science Engineering \n \nAchievements\nFinalists in Kshitij 2017(IIT Kharagpur)","Saksham Jain", R.drawable.saksham));

        data.add(new ListItem("Branch:\n Mechanical Engineering \n \nAchievements\nFinalists in the event Conquest atKshitij 2017(IIT Kharagpur)","devnath Nair", R.drawable.devnath));

        data.add(new ListItem("Branch:\n Electronics And Communication Engineering \n \nAchievements\nFinalists inB.R.I.C.K.S.event atKshitij 2017(IIT Kharagpur)","KusumMeena", R.drawable.kusum));

        data.add(new ListItem("Branch:\n Civil Engineering \n \nAchievements\nFinalists in Kshitij 2017(IIT Kharagpur)","MeenalPunia", R.drawable.meenal));

        data.add(new ListItem("Branch:\nMecanical Engineering \n \nAchievements\nFinalists in the event Conquest atKshitij 2017(IIT Kharagpur)","NimeshKhandelwal", R.drawable.nimesh));



        data.add(new ListItem("Branch:\n Mechanical Engineering \n \nAchievements\nFinalists in Kshitij 2017(IIT Kharagpur)","Ramachandran", R.drawable.rg));

        data.add(new ListItem("Branch:\n Electronics And Communication Engineering \n \nAchievements\nFinalists in the event Conquest atKshitij 2017(IIT Kharagpur)","RohanChauhan", R.drawable.rohan));

        data.add(new ListItem("Branch:\n Computer Science Engineering \n \nAchievements\nFinalists in the event Conquest atKshitij 2017(IIT Kharagpur)","TejeshwarSaini", R.drawable.tejeshwar));

        data.add(new ListItem("Branch:\n Electrical Engineering \n \nAchievements\nFinalists in Kshitij 2017(IIT Kharagpur)","Varun Sharma", R.drawable.varun));

        data.add(new ListItem("Branch:\n Mechanical Engineering \n \nAchievements\nFinalists in Kshitij 2017(IIT Kharagpur)","VikalpSaini", R.drawable.vikalp));

        //Repeat process 4 times, so that we have enough data to demonstrate a scrollable
        //RecyclerView



        return data;
    }
}
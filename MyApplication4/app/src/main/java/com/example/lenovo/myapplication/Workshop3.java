package com.example.lenovo.myapplication;

import android.content.res.Resources;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;

import java.util.ArrayList;

import it.moondroid.coverflow.components.ui.containers.FeatureCoverFlow;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import java.util.ArrayList;

import it.moondroid.coverflow.components.ui.containers.FeatureCoverFlow;

public class Workshop3 extends AppCompatActivity
{
    private FeatureCoverFlow coverFlow;
    private CoverFlowAdapter2 adapter;
    private ArrayList<Game2> games;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_projects);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        setTitle("Projects");
        coverFlow = (FeatureCoverFlow) findViewById(R.id.cf);
        Resources resources = getResources();
        settingDummyData();
        adapter = new CoverFlowAdapter2(this, games);
        coverFlow.setAdapter(adapter);
        coverFlow.setOnScrollPositionListener(onScrollListener());




    }
    private FeatureCoverFlow.OnScrollPositionListener onScrollListener() {
        return new FeatureCoverFlow.OnScrollPositionListener() {
            @Override
            public void onScrolledToPosition(int position) {
                Log.v("MainActiivty", "position: " + position);
            }

            @Override
            public void onScrolling() {
                Log.i("ProjectActivity", "scrolling");
            }
        };
    }


    private void settingDummyData() {
        games = new ArrayList<>();
        games.add(new Game2(R.drawable.timer, "555 timer ic","Practical description\nLets use this awesome 555 Timer IC for some synchronized LED blinking. Make the LED dance on your commands.",""));

        games.add(new Game2(R.drawable.opamp,"Opamp" ,"Practical Description-\nUsing OP-AMP for the blinking of several LED's at a time.", ""));
        games.add(new Game2(R.drawable.differential, "Differential drive","Practical Description-\nMake a Robot which will act according to your instructions and have a competetion with the bots of your fellow members. So you will get the real feeling of robotics here at the very first time in your life.",""));
        games.add(new Game2(R.drawable.arduino, "Arduino","Practical Description-\nLets use the most used Microcontroller for the Robotics and make a Ultrasonic sensor work according to your instructions",""));
        games.add(new Game2(R.drawable.android,"Android App Development"," Description-\nYou will be taught the basics of making an Android App using the official Android Studio IDE.\n FutureScope-Android is fast emerging as the most used OS on mobile phones. Acquiring the skills of creating basic apps for the same in the lecture, you can nurture them further and who knows we may all be using your app soon!\nTopics included-\nHistory of Operating System of Phones;\nWhat is Android?;\nDevelopment of Android;\\nAndroid Architecture;\\nAndroid Layout;\\nDeveloping your own Android App.\n","Hardik Ajmera\nSaksham Jain\nRonak Gupta"));
        games.add(new Game2(R.drawable.mechanical, "Basic Mechanical","Description-This lecture aims at providing enough knowledge to build a Mechanically feasible design of a bot\nFuture Scope-\n After attending this, you will be able to use various type of gears, will know their mechanism of working, and from then you will see the world in a new perspective of mechanics.\nTopics Include-\nMechanical tools,\\nActuators,\\nSteering Mechanisms,\\nTypes of wheels,\\nPower Transmission,\\nDesigning Softwares","Vikalp Saini\nVarun Sharma\n devnath nair"));
        games.add(new Game2(R.drawable.aero,"Aeromodelling" ,"Decription-\nThis lecture aims at teaching the basics of Aeromodelling and Aerodynamics.\nFuture Scope-fter attending this lecture, you would be able to understand how these flying machines soar high up in the air and understand how to make a model aeroplane on your own\n Topics Include-\nIntroduction,\\nBasic Aerodynamics Terms, \\nParts of Aeroplanes,\nDIY,\nTypes of Helicopter and its Mechanism,\nQuadcopters and its Stabilization\n","Tejeswar Saini\n Hardik ajmera\n devnath nair"));
        games.add(new Game2(R.drawable.matlab, "Matlab","Description-\nMatlab is used as a calculator that can simplify our work a lot. It has multidisciplinary applications as in Mathematics, Software, Electronic and Electrical Engineering and many more. It is an authentic software\nFuture Scope-\nSince it useful in almost every field of education and research, Learning Matlab can give us a boost in our technical and research career. Image and video processing is a vital application. It is easy to code many algorithm in Matlab which are difficult to implement in other environments.\n Topics Include-\nIntroduction to Matlab software\\nUses,\\nApplication in various fields,\\nImage processing,\\nSimulation (simulink).","Kusum Meena\nRohan Chouhan"));
        games.add(new Game2(R.drawable.web, "Web development","Description-\nThis Lecture aims at teaching how to make a website and make it interactive and also to connect with the database and the servers\n Future Scope-\nThis Lecture aims at teaching how to make a website and make it interactive and also to connect with the database and the servers","Meenal Choudhary\ndevnath Nair"));
        games.add(new Game2(R.drawable.algo, "Algo and psuedocpdes","Description-\nThis lecture aims at teaching the basics of computer programming and fundamentals of programming of Arduino and Raspberry Pi\n Future Scope-\nAfter attending this lecture, you would be able to write a program code on your own, control the brains of your robots, and use a mini-computer which can fit into your pockets!\n Topics Included-\nIntroduction to programming languages,\\nBasics of C programming-variables,\\nConstants,\\nKeywords,\\nDatatypes,\\nOperators,\\nDesicion making statements,\\nLoops,\\nFunctions,\\nArrays,\\nIntroduction to Arduino and its programming,\\nMaking of line follower robot,\\nIntroduction to Raspbery Pi.","Nimesh Khandelwal\n Tejeswar Saini"));
        games.add(new Game2(R.drawable.ec, "Ics and MCU's","Description-\nThis lecture will introduce you to ICs which are the basic elements of almost every technical device, following programmable ones which you can code to work out in any way you want.\n Future Scope-\nOne can make amazing circuits like blinking of Led using 555 Timer IC on their own. You will also be able to work upon the brain of Robots !!!\nTopics Included-\nIntro - Moore&apos;s Law,\\nNeed for IC,\\nAdvantages/Disadvantages,\\nTypes of ICs;\\nIC Package,\\nNaming and Numbering of ICs; \\nLogic Gates, \\nData Sheet,\\nCommon ICs; \\n\\nMCU -\\n\\nFeatures, \\nArduino,\\nRaspberry Pi\\n","Hardik ajmera\n Meenal Choudhary\n Kusum Meena"));
        games.add(new Game2(R.drawable.sensor, "Sensors ","Sensors To Robots are like Senses To Human.This lecture is helpful for understanding the working of basic sensors and their applications\n Future Scope-\nYou can design a cicuit or a robot which can Interact and gather information from the Environment, hence make autonomous robots !!\ntopics include-\nIntroduction to Sensors,\\nSpecification of different Sensors,\\nTypes of Sensors,\\nApplication","Rohan Chouhan \n Ramachandran"));
        games.add(new Game2(R.drawable.ec, "Electronics","Description-\nThis session is aimed to teach students the basics of electronics\nFuture Scope-\nElectronics are widely used nowadays from a torch to the Smartphones. You will be able to identify and use the basic electronic components. The Electronics is going to be very vital in your life in the future.\n Topics include-\nIntro to electronic components,\\nWires and connectors,\\nCircuit boards,\\nTransistors,\\nDiodes,\\nH-bridge,\\nBatteries.","Varun Sharma\n Ramachandran"));
        games.add(new Game2(R.drawable.ec, "Ethical hacking ","Description-\nYou will get to know various neat tricks plausible on Windows,and\\nHow to keep your computer protected and how to access others social networks or Wifi.\nFuture Scope-\nYou can go on to become a white or grey hat hacker and serve as an integral part of any company which stores/manipulates data online. Or you could use the acquired skills just to make sure you don&apos;t fall prey to the vicious dark corners of the internet.\n Topics Include-\nWhat is hacking?;\\nVirus,\\n trojan and worm;\\nPassword Protected folder; \\nGodMode; \\nHacking User,\\nFacebook and WhatsApp Accounts;\\nHacking WiFi Password; Live editing in Web Browser; \\nVideo as Desktop Background.","Ronak gupta"));



    }




}



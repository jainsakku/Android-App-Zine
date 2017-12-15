package com.example.lenovo.myapplication;

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

public class Achivements extends AppCompatActivity
         {
    private FeatureCoverFlow coverFlow;
    private CoverFlowAdapter adapter;
    private ArrayList<Game> games;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_achivements);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        setTitle("Achievements");
        coverFlow = (FeatureCoverFlow) findViewById(R.id.cf);

        settingDummyData();
        adapter = new CoverFlowAdapter(this, games);
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
                         Log.i("MainActivity", "scrolling");
                     }
                 };
             }


             private void settingDummyData() {
        games = new ArrayList<>();
        games.add(new Game(R.drawable.download, "Blitzschlag 2017, MNIT Jaipur\n\n" +
                "-Secured 2nd position in Grid-O-Grinder."));
        games.add(new Game(R.drawable.download1, "Kshitij’17, IIT Kharagpur\n\n" +
                "-Finalists In Semi Autonomous Event BRICKS"));
        games.add(new Game(R.drawable.download2, "\n\nGridTech’15, Pragati Maidan, New Delhi\n\n" +
                "-Won 1st prize at Students Innovation Pavillion worth of Rs. 1 lakh in the Category Robotic Technology in Inspection of Transmission Lines.\n" +
                "-Won 1st prize at Students Innovation Pavillion worth of Rs. 50 thousand in the Category Smartmeter."));
        games.add(new Game(R.drawable.download3, "Blitzschlag 2015, MNIT Jaipur\n\n\n\n" +
                "-Circuit mania blitz 2015 2nd and 4th position"));
        games.add(new Game(R.drawable.download, "Texas Instruments Analog Design Contest’15\n\n" +
                "-Project Solar tracker reached finals"));
        games.add(new Game(R.drawable.download1, "Kshitij’15 IIT, Kharagpur\n\n" +
                "-Won first prize in semi-autonomous event MINEFIELD. \n" +
                "-Won first prize in manual event Skyfall. \n" +
                "-Finalist in manual event Cascade."));
        games.add(new Game(R.drawable.download2, "Autodesk 3D Student Design Challenge-2014\n\n" +
                "-1st and 3rd position in the Regionals held at Noida \n" +
                "-Won the National Title held at Mumbai \n" +
                "-Presented the design at the Autdoesk Panorama, Held in Shanghai, China-9-13th March'15"));
        games.add(new Game(R.drawable.download3, "Projects Approved\n\n" +
                "-5 projects were approved by the TEQUIP worth of 2.5 lakh from Malaviya National Institute of Technology(MNIT Jaipur). \n" +
                "-7 projects were approved worth of 42 lakh from Ministry of Micro Small and Medium Enterprises(MSME), Govt. of India."));
        games.add(new Game(R.drawable.download, "Blitzschlag 2014, MNIT, Jaipur\n\n" +
                "-1st Runner up in Retro Electronics \n" +
                "-1st Runner up in AUTOQUIZ \n" +
                "-1st Runner up in Circuit Biz \n" +
                "-1st Runner Up in CADesign \n" +
                "-4th place in Piezo Alert"));
        games.add(new Game(R.drawable.download1, "\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\nResearch Papers\n\n" +
                "-Short Term Load Forecasting using Artificial Neural Networks: A State of Art , Author- Jatin Verma \n" +
                "-A robust technique for Detection of P300 signals, Author- Saatvik Shah, Anirudha Kumar \n" +
                "-Classification of mental tasks from EEG data using backtracking search optimization based neural classifier at Neurocomputing, Elsevier \n" +
                "-Group based Swarm evolution algorithm (GSEA) driven mental task classifier at Memetic Computing,Springer \n"+
                "-Paper presentation on \"use of epoxy resin viscous fiber polymer in turbine blades\n"+
                "-Designed and fabricated an RC S.P.A.D. Airplane\n"+
                "-Best Paper Award at International Conference on Advances in Computer Engineering and Applications (ICACEA) 2015, IMS Ghaziabad INDIA \n"+
                "-Best Paper Award in 3rd International Conference on \"Advance Trends in Engineering, Technology and Research"));
        games.add(new Game(R.drawable.download2, "\n\n\nTech Expo 2014 , MNIT, Jaipur\n\n\n\n" +
                "-1st prize SmartCopter, Mechanical Category \n" +
                "-1st prize Solar Tracker, Electronics Category \n" +
                "-1st prize Interactive SmartBoard , Computer Science Category \n" +
                "-2nd Prize Bus Lane with Intermittent Priority, Civil Category \n" +
                "-2nd prize Robotic Hand (Robo-Arm) in Open Category"));
        games.add(new Game(R.drawable.download3, "Miscellaneous\n\n" +
                "-Participated in Fusion 360 Hackathon, Tongji University, China \n" +
                "-TATA MOTORS mind rover champion.. pre placement interview to KARSH Tharyani,(2nd year)"));
        games.add(new Game(R.drawable.download, "PREVENTIVE GEAR MAINTANENCE\n\n" +
                "-Filed for Patent \n" +
                "-Nominated for Best Innovation Award \n" +
                "-Team Members: Saatvik Shah, Vaibhav Jain, Sanjay Thakur"));
        games.add(new Game(R.drawable.download1, "\n\n\n\n\nGridTech’13, Pragati Maidan, New Delhi\n\n" +
                "-Organized by Power Grid Corporation of India Ltd. Is an international event in which companies, colleges and institutes present their prototypes for different real-time problems \n" +
                "-Our team was awarded 3rd prize in the competition \n" +
                "-Team Members: Nikhil Jain, Harshit Saxena, Abhishek Gupta, Avinash Baheti, Arush Pratap Singh Rawat"));
        games.add(new Game(R.drawable.download2, "INSPIRON\n\n" +
                "- Won Third Prize in Kshitij, IIT Kharagpur 2014 \n" +
                "-Team Members: Devang Darode, Karsh, Bharat"));
        games.add(new Game(R.drawable.download3, "\n\n\nJBiofeedback through electronic Goniometer\n\n" +
                "- Patent is sought on the concept as well as on the device. Patent application filed in July 2011 by the Malaviya National Institute of Technology, Jaipur, India \n" +
                "-Our team was awarded 3rd prize in the competition \n" +
                "-Team Members: Dr. Rajesh Kumar with Alok Agrawal, Anoop Honnekeri Nagraj, Rohit Saxena"));
        games.add(new Game(R.drawable.download, "\n\n\n\nSmart Card based Real Time Emission Measurement and Pollution Control Enforcement\n\n" +
                "-Patent application filed in January 2012 by the Malaviya National Institute of Technology, Jaipur, India \n" +
                "-Nominated for Best Innovation Award \n" +
                "-Team Members: Dr. Rajesh Kumar with Alok Agrawal, Jai Dhariwal, Nirmala Kunwar, Ritika Dhyawala"));
        games.add(new Game(R.drawable.download1, "\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\nTI- Analog Design Contest 2012\n\n" +
                "-Five teams took part this year and again cleared the three interim stages of the contest \n" +
                "\n" +
                "Low cost plant fertilizer dispenser aid\n" +
                "\n" +
                "-Team Members:Deenbandhu, Prince Jain, Anshul Khandelwal \n" +
                "\n" +
                "A portable system to prevent tyre bursting\n" +
                "\n" +
                "-Team Members:Hemant Yadav, Deepank, Mayank \n" +
                "\n" +
                "Home Automation \n" +
                "Team Members:Himanshu, Nilesh \n" +
                "\n" +
                "On Line Low cost unbalance Source Identifier\n" +
                "\n" +
                "-Team Members:Bhanu Pratap Singh, Abhishek Gupta, Saurabh agarwal \n" +
                "\n" +
                "Potable Medical Meter\n" +
                "\n" +
                "-Team Members:Umang, Akhil, Dhruv \n" +
                "\n" +
                "Out of 5 teams, one team was selected for paper presentation for the next round at TIIEC Conference, banglore and two other teams were also selected for poster presentation at the very same. The paper has been later published in the IEEE proceedings, Banglore chapter"));
        games.add(new Game(R.drawable.download2, "Paper presentation\n\n" +
                "-On Line Low cost unbalance Source Identifier"));
        games.add(new Game(R.drawable.download3, "Poster Presentation\n\n" +
                "-Low cost plant fertilizer dispenser aid, A portable system to prevent tyre bursting"));
        games.add(new Game(R.drawable.download, "JUST A TOUCH\n\n" +
                "-An event organized in IIT-jodhpur during their annual technical function. Our team won First Prize in the competition \n" +
                "-Team Members: Bhanu Pratap Singh, Abhishek Gupta, Avinash Baheti, Nikhil Jain"));
        games.add(new Game(R.drawable.download1, "\n\n\nNexus 2009\n\n" +
                "-Nexus is the regional competition of the biggest autonomous bot competition i-NEXUS at IIT-Bombay Techfest. The task was to make two autonomous bots which can coordinate among themselves and pick the boxes placed randomly in the arena and then dispose them off at a dumping site. Our team stood 1st at the regional level"));


    }}



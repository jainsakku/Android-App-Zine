package com.example.lenovo.myapplication;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;

import java.util.ArrayList;

import it.moondroid.coverflow.components.ui.containers.FeatureCoverFlow;

public class ProjectsActivity extends AppCompatActivity
{
    private FeatureCoverFlow coverFlow;
    private CoverFlowAdapter1 adapter;
    private ArrayList<Game1> games;

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
        adapter = new CoverFlowAdapter1(this, games);
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
        games.add(new Game1(R.drawable.bci, "Brain Computer Interface","Analyzing the signals from patients' brain, mapping and using the data for effective treatment, Pattern Establishment for benign and malignant neurological disease patient in different frequency ranges. Research was in collaboration with State Health care Hospital (SMS), Jaipur.The project has set many milestones Research grant of Rs. 75,000 for further development of this project to use brain signals to control passive objects by Director Sir of College. Results have been submitted in IEEE(Institute of Electrical and Electronics Engineers) Conference.","Saurabh Aggarwal \nBhanu Pratap Singh Rawat"));

        games.add(new Game1(R.drawable.homeenergy, "Intelligent Home Energy \nManagement System","The system uses the concept of demand side management, variable tariff blocks and its optimization on cloud such that the power consumption bill is minimized, peak load time is clipped and the consumer satisfaction is maximized. It records and analyzes the electrical parameters and provides an option for optimized scheduling for electrical appliances. The system provides a real time access to the load parameters and there is a centralized data monitoring system which generates a report and provides alert to the user to reduce the load consumption on exceeding the proposed usage limit as determined by the predicted load. A smart control feature is integrated which enables control of all the appliances using a handheld device.The system also logs the power consumption so that the discrepancy in billing can be cut down.\n" +
                "\n" +
                "Progress:\n" +
                "The following tasks have been done and integrated:\n" +
                "1) Retrieval of data from homes.\n" +
                "2) Optimization on Cloud\n" +
                "3) Scheduling\n" +
                "4) Remote Access to devices at homes\n" +
                "5) Penalty factor\n" +
                "Things to be done:\n" +
                "1) Integration of Game Theory",""));
        games.add(new Game1(R.drawable.quad, "Autonomus Quadcopter","Quad copters are really interesting topic for engineering students as it can perform versatile day to day functions. Also the military use of these type of unmanned aerial vehicles (UAVs) has grown because of their ability to operate in dangerous locations while keeping their human operators at a safe distance. A quadcopter, also called quadrotor helicopter is multi-rotor copter with four arms, each of which have a motor and a propeller at their ends. Quadcopters are similar to helicopters in some ways, though their lift and thrust comes from four propellers, rather than just one. 1. Our idea is to design the quadcopter that when left in unknown terrains can give us live video stream on our laptops and also store it according to the need. 2. Automate it so that it can act by judging its surroundings, perform various actions/maneuverers by determining its position and environment. 3. These quad copters can be sent in evacuated buildings and in bio-chemical factories to act as first respondents, and call for cajole by manoeuvring either autonomously or controlling it through Brain. 4. It can also be used to autonomously model unknown environments using distance measuring sensors and decide its path accordingly.","Akash Shah\n" +
                "Anirudha Kumar\n" +
                "Rajat Arya"));
        games.add(new Game1(R.drawable.wheel, "Automotive Wheelchair","It is an emerging field in Engineering due to the depth of its untapped potential. Brain Signals are detected by sensitive electrodes and filtered to obtain useful information. BCI is used for prognosis of terminal diseases, an aid for people who have been disabled and can be used as an ancillary part for paralyzed people. We have achieved the objective of categorizing patients (neurologic disease) using brain signals with a medical team at SMS Hospital, Jaipur. Results have been submitted in IEEE xplore. We have also developed an algorithm for ANN to get enhanced classification of terminal medical disease. Results have been submitted in Springer Journal. Most of software part has been simulated by us. Now to extend our project towards hardware we are going to construct a fully autonomous wheel chair for completely paralyzed people using BCI with the following features:-\n" +
                "1. User controlled movement of wheelchair using brain signals. 2. Detection and classification of following general and medical phenomena on the basis of Brain Signals predominantly:-\n" +
                "a. General Phenomena\n" +
                "i. Sleep patterns\n" +
                "ii. Stress\n" +
                "iii. Emotion Classification\n" +
                "b. Medical Phenomena\n" +
                "i. Detecting simple illness (such as cough/cold)\n" +
                "ii. Detecting onset of health complications(such as seizures)\n" +
                "iii. Blood Pressure(using ECG)\n" +
                "3. A complete health report based on the above (and more) factors will be added to a central server at frequent time intervals.\n" +
                "4. Controlling home appliances such as television, lights and doors with BCI.\n" +
                "5. Prompts for activities such as sleep, TV show, medicine dosage, etc according to time and user requirements.\n" +
                "6. Inclusion of a warning mechanism in case of emergency situations.\n" +
                "7. Customized wheelchair to enhance movement and user comfort.","Akash Shah\n" +
                "Anirudha Kumar\n" +
                "Rajat Arya"));
        games.add(new Game1(R.drawable.arm, "Prosthetic Arm","Making an artificial arm for the amputed and maimed persons controlled by muscle signals to grab and lift objects\n" +
                "\n" +
                "Recent Development\n" +
                "Extremely useful project for physically disabled\n" +
                "\n" +
                "Developed a working model successfully.\n" +
                "Currently working on the signal extraction from muscles",""));
        games.add(new Game1(R.drawable.gait, "Gait Analysis","About\n" +
                "This research project aims to develop a comprehensive biomechanical integrated software tool for measurement and analysis of postural defects in walking gait. It involves applying Image Processing and Machine Learning techniques. The project has been funded by DST (Department of Science and Technology), which comes within Ministry of Science and Technology, India.\n" +
                "\n" +
                "Awards & Recognition\n" +
                "Two papers published, one of which received Best Paper AwardAwards & Recognition- \n" +
                "Two papers published, one of which received Best Paper Award ","Anshul Mittal\n" +
                "Kanika Gupta"));
        games.add(new Game1(R.drawable.hydraulics, "Multi Actuator Switch Mode Hydraulic System","Current hydraulic systems involving multiple actuators and a single hydraulic power supply generally\n" +
                "        have poor efficiency. Using throttling valves to control multiple actuators requires meeting the highest \n" +
                "        pressure requirement and the total flow of all of actuators. When there is a large difference in the\n" +
                "        pressure requirement of the actuators, fluid throttling results in significant energy losses. The purpose\n" +
                "        of this project is to implement switch-mode control in a multi-actuator circuit and demonstrate \n" +
                "        the improvement in efficiency over a traditional hydraulic with throttling valve control. \n" +
                "        This will reduce energy losses and result in improved efficiency for usage of multiple actuators \n" +
                "        with a single hydraulic power source. This idea utilises the input from both the tank and the pump. \n" +
                "        Using varying amounts of fluid coming from both sources, we can create various pressure and flow values\n" +
                "        for different actuators and in the process increase the efficiency of the system by operating the actuators\n" +
                "        at their rated pressures and flows. The usages of this project vary from heavy duty hydraulic to hydraulic \n" +
                "        lifts. This new technology, once implemented on a larger scale in realistic applications, will reduce\n" +
                "        losses in hydraulic systems that depend on multiple actuators to function.","Paresh Anand\n Piyush Chauhan\n Sharad Garg"));
        games.add(new Game1(R.drawable.hci, "Human Computer Interface","These Devices can range from simple screen modules to more advanced systems like\n finger and head\n" +
                "        tracking systems which can find use in a variety of fields like game development, gesture controlled\n" +
                "        \n smart television,etc.Our field of research revolved around creating an interactive platform between\n" +
                "        a Human and a Computer.\n Looking at the present scenario in India, we believe that cheap alternatives\n" +
                "        to the usually expensive equipment like interactive whiteboards\n could come in handy to a large number\n" +
                "        of Schools and Colleges who cannot afford to invest much. \n \t The scope of our project and the applications\n" +
                "        in the real world are huge.To list a few,\n the following are few of the things which are aiming to achieve:\n" +
                "        \n 1.Turning the projection of a laptop into an interactive environment, with multi touch features.\n" +
                "        \n 2. Turning the LCD screen of a laptop into a touchscreen withe the help of a custom stylus,\n" +
                "        \n again supporting multi touch features(up to 4 distinct points simultaneously).\n" +
                "        \n 3. Finger Tracking for achieving Gesture recognition for incorporating it with carious applications\n" +
                "        .It would be a giant leap towards augmented \n reality and controlling computers simply by the wave of\n" +
                "        our hands. \n4.Head tracking which can find use in Game development or creating other Simulation\n" +
                "        Environments. \n \n\n Finger Tracking and Gesture Recognition alone can find use in various other fields.\n" +
                "        As far as the future scope of our projects is concerned, we would be extending our project to achieve the\n" +
                "        following:\n\n 1.Security Systems which make use of gestures. \n2.Controlling Robots via hand and facial\n" +
                "        gestures.\n 3.Transcribing Sign Language into Text.\n 4.Smart TVs","Anshul Mittal\n Maitreyee Mehta\n Mihika Gupta\n Sharad Garg"));
        games.add(new Game1(R.drawable.voltage, "Robotic technology for High Voltage","The project is aimed at developing a robotic technology for carrying out the inspection and repair\n" +
                "        work of any faults that may occur in the transmission/distribution lines. The robot will achieve this\n" +
                "        task whilst the line being under live condition. Present methods of inspection include Helicopter\n" +
                "        surveillance and Human inspection. Helicopter surveillance is done by a lineman using helicopter and\n" +
                "        it is highly risky. The second method includes human inspection. In this lineman climbs on the\n" +
                "        transmission line and checks out all the faults and repairs them and this method is also highly risky\n" +
                "        and time consuming. \n\n The robotic system consists of a robot equipped with: 1. A high definition\n" +
                "        video camera providing live feeds of transmission line\n 2. Infrared (Thermal) camera providing the\n" +
                "        locations of hotspots.\n 3. Wire clamper and bolt lightener.\n 4. Wireless assembly providing control\n" +
                "        upto 2km.\n The robotic system is manually controlled through a wireless remote. The video and infrared\n" +
                "        cameras provide live feeds which are transmitted wirelessly. The receiver kept near operator receives\n" +
                "        the live feeds and then they are displayed on the screen. The operator can then control the robotic\n" +
                "        system to repair the broken strands and can also analyze the hotspots. Loose bolts can be tightened\n" +
                "        by using the assembly mounted for tightening the bolts. This way the system will minimize the human work,\n" +
                "        increase efficiency and reduce dangers in maintaining and repairing the transmission lines.","Akash Shah\n Akshay Kumar\n Anirudha Kumar Anshul Mittal\n Rajat Arya Sharad Garg"));
        games.add(new Game1(R.drawable.sun, "Sun Tracker","Energy Efficiency-Microcontroller based Android App controlled Solar Tracking System enables the\n" +
                "        solar panels to track the sun for maximum energy and the power generated is available to the user android\n" +
                "        based application for manual modifications and control. Using Self Orienting Solar Panels lead to an\n" +
                "        enhancement of up to 40% in the generated solar power. Dual axis tracking is an additional feature which\n" +
                "        makes the design work for any season throughout the year thus accounting for the sun’s deviation during\n" +
                "        winters.","Sharad Garg\n Anshul Mittal"));
        games.add(new Game1(R.drawable.smart, "Smart Grid","Today, the technology has reached an advanced level. In contrast to this, our Power Transmission and\n" +
                "        Distribution system is the same that has been installed 100 years ago and which has become obsolete and\n" +
                "        needs to be developed or replanted. Here comes the need for Smart Grid. It is an advanced Power Grid that\n" +
                "        uses advanced communication networks to achieve following features: \n\n • sensing and metering technology\n" +
                "        for incoming and outgoing power,\n • identifies regions where there is larger need of power and implements\n" +
                "        considerable decrease in other regions,\n • enables consumers to become suppliers by decentralising sources\n" +
                "        of power as there are greater than 1000 Power stations for over millions of consumers,\n • Roof top solar\n" +
                "        energy generation, energy storage and excess energy selling with optimization of demand.\n • identifies\n" +
                "        peaks of consumption in a day and optimizes the use of Power,\n • Automated control and monitoring to detect\n" +
                "        faults through sensors so that they can be repaired quickly.\n • Prevents electricity thefts\n","Jatin Verma\n Akshay Kumar"));
        games.add(new Game1(R.drawable.exo, "Exoskeleton ","About The main aim of our project is to design a human exoskeleton which can be applied to various uses.\n" +
                "        For people suffering from muscular motor loss in limbs to some suffering with paraplegia this can be used\n" +
                "        in their quick rehabilitation. It is also aimed at creating the suit that provides extra external power .\n" +
                "        It provides enhanced performance as well as assistance to human actions using Functional Electrical\n" +
                "        Simulation (FES) and can be used as an affordable substitute to the Physiotherapists treating stroke\n" +
                "        patients The methodlogy involves:\n\n 1. Development of the tentative model on 3D modelling software.\n" +
                "        \n 2. Static and dynamic analysis using Hyperworks.\n 3. Development of the first prototype based on\n" +
                "        input and output systems.\n 4. Integration of input and output systems.\n 5. Integrating with Feedback\n" +
                "        control","Devang Darode\n Sarthak Jain\n Ayush Jhalani\n Akshay Kumar"));
        games.add(new Game1(R.drawable.agas, "A.G.A.S.T.U.T.I","About\n\n AGASTUTI as the name suggests is an autonomous system which can replace human beings from the\n" +
                "        unproductive job of transporting objects from one place to another. Thus effectively saving human resources\n" +
                "        which can be used in other comparatively more productive jobs. The system consists of a CPU as any customized\n" +
                "        PC. The main aim is to achieve an autonomous navigation. The robot will further be used in hospitals where\n" +
                "        in case of an emergency the nearest ICU for the patient will be automatically be fetched from a UNIFIED\n" +
                "        database and will save the precious moments. The robot will feature various robotic sciences like Image\n" +
                "        Processing,etc. The interface with the robot will be via a touch screen An insight in the future a multiple\n" +
                "        number of these robots will be in sync with each other to make navigation very simple and efficient saving a\n" +
                "        lot of resources and man power.","Devang Darode\n Karsh Tharyani\n Ayush Jhalani"));
        games.add(new Game1(R.drawable.hand, "Hand Gesture Recognition ","Some special people are usually deprived of normal communication with other people in the society. It has been observed that they find it really difficult at times to interact with normal people with theirn" +
                "        gestures , as only a very few of those are recognized by most people. Since people with hearing impairment\n" +
                "        cannot talk like normal people so they have to depend on some sort of visual communication in most of then" +
                "        time. Visual-gestural language is their primary means of expression which involves various hand gestures ,\n" +
                "        facial expressions like eyebrow movement and lip-mouth movement. What we aim to achieve ? The idea is to\n" +
                "        make computers to understand human language and develop a user friendly human computer interfaces (HCI).\n" +
                "        Making a computer understand speech, facial expressions and human gestures are some steps towards it thereby\n" +
                "        \tmaking a translation system that can successfully convert this visual gestural language into digital English\n" +
                "        text or speech.","Karsh Tharyani\n Vishakha Tyagi\n Jatin Verma"));



    }




}



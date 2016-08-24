package com.michaelwilson.android.aca.marsrobot;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MarsRobot spirit = new MarsRobot();
        spirit.status = "exploring";
        spirit.speed = 2;
        spirit.temperature = -60;

        spirit.showAttributes();
        System.out.println("Increasing speed to 3.");
        spirit.speed = 3;
        spirit.showAttributes();
        System.out.println("Changing temperature to -90.");
        spirit.temperature = -90;
        spirit.showAttributes();
        System.out.println("Checking the temperature.");
        spirit.checkTemperature();
        spirit.showAttributes();

        MarsRobot freedom = new MarsRobot();
        freedom.status = "exploring";
        freedom.brakeTemperature = 600;
        freedom.windSpeed = 80;

        freedom.showAttributes();
        System.out.println("Increasing wind speed to 150.");
        freedom.windSpeed = 150;
        freedom.showAttributes();
        System.out.println("Changing brake Temperature to 700.");
        freedom.brakeTemperature = 700;
        freedom.showAttributes();
        System.out.println("Checking the brake Temperature.");
        freedom.checkBrakeTemperature();
        freedom.showAttributes();
    }
}

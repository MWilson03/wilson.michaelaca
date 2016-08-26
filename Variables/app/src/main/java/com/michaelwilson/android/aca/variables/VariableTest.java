package com.michaelwilson.android.aca.variables;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class VariableTest extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_variable_test);

        int distance = 425;
        float batSpeed = 115;
        double ballSpeed = 135;
        char pitchCount = '7';
        boolean grandSlam = true;
        long batWeight = 34;
        short exitSpeed = 125;
        byte windSpeed = 15;

        System.out.println("distance: " + distance);
        System.out.println("batSpeed: " + batSpeed);
        System.out.println("ballSpeed: " + ballSpeed);
        System.out.println("pitchCount: " + pitchCount);
        System.out.println("grandSlam: " + grandSlam);
        System.out.println("batWeight: " + batWeight);
        System.out.println("exitSpeed: " + exitSpeed);
        System.out.println("windSpeed: " + windSpeed);


















    }
}

package com.michaelwilson.android.aca.marsrobot;

/**
 * Created by michaelwilson on 8/24/16.
 */
public class MarsRobot {
    String status;
    int speed;
    float temperature;
    int windSpeed;
    float brakeTemperature;


    void checkTemperature ()  {
        if  (temperature  <  -80) {
            status = "returning home";
            speed = 5;

        }
    }

    void showAttributes () {
        System.out.println("Status: " + status);
        System.out.println("Speed: " + speed);
        System.out.println("Temperature: " + temperature);
    }

    void checkBrakeTemperature () {
        if (brakeTemperature > 500 || windSpeed > 75) {
            status = "shut down";
            speed = 0;

        }
    }
}

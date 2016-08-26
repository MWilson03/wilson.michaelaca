package com.michaelwilson.android.aca.temperatureconversion;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView mFah;
    TextView mCel;
    TextView mOutputTextView;
    Button mConvertButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mFah = (TextView) findViewById(R.id.fahText);
        mCel = (TextView) findViewById(R.id.celText);
        mOutputTextView = (TextView) findViewById(R.id.outPutText);
        mConvertButton = (Button) findViewById(R.id.calcButton);



        mConvertButton.setOnClickListener(new View.OnClickListener() {
            String currentFah;
            String convertedTemp;
            String currentCel;

            @Override
            public void onClick(View view) {

                if (!mFah.getText().toString().equals("")) {
                    currentFah = mFah.getText().toString();
                    //int fahValue = Integer.parseInt(currentFah);
                    float fahValue = Float.parseFloat(currentFah);

                    fahValue = fahValue - 32;
                    fahValue = fahValue / 9;
                    fahValue = fahValue * 5;

                    convertedTemp = String.valueOf(fahValue);

                    mOutputTextView.setText(currentFah + " fahrenheit Aye is " + convertedTemp + " celsius Aye.");
                    mFah.setText("");
                } else if (!mCel.getText().toString().equals("")) {
                    currentCel = mCel.getText().toString();
                    //int celValue = Integer.parseInt(currentCel);
                    float celValue = Float.parseFloat(currentCel);

                    celValue = celValue * 9;
                    celValue = celValue / 5;
                    celValue = celValue + 32;

                    convertedTemp = String.valueOf(celValue);

                    mOutputTextView.setText(currentCel + " celsius Aye is " + convertedTemp + " fahrenheit Aye.");
                    mCel.setText("");
                }

            }
        });


        float fah = 86;
        System.out.println(fah + " degrees Fahrenheit is ...");
        // To convert Fahrenheit to Celsius
        // begin by subtracting 32
        fah = fah - 32;
        // Divide the answer by 9
        fah = fah / 9;
        //Multiply that answer by 5
        fah = fah * 5;
        System.out.println(fah + " degrees Celsius\n");

        float cel = 33;
        System.out.println(cel + " degrees Celsius is ...");
        // To convert Celsius into Fahrenheit
        // begin by multiplying by 9
        cel = cel * 9;
        // Divide the answer by 5
        cel = cel / 5;
        // Add 32 to the answer
        cel = cel +32;
        System.out.println(cel + " degrees Fahrenheit");




    }
}

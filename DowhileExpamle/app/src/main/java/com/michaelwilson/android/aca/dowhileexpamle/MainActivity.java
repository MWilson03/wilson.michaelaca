package com.michaelwilson.android.aca.dowhileexpamle;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        long i = 1;
        do {
            i *= 2;
            System.out.println(i + ' ');
        } while (i < 3_000_000_000L);
    }
}

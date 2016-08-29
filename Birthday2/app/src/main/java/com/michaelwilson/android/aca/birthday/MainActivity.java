package com.michaelwilson.android.aca.birthday;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        String birthday = new String ("11/18/1992");

        System.out.print("Month :" );
        System.out.println(birthday.substring(0, 2) );

        System.out.print("Day :" );
        System.out.println(birthday.substring(3, 5) );

        System.out.print("Year :" );
        System.out.println(birthday.substring(6) );





        GiftSize bigGift = new GiftSize();

        bigGift.height = 6;
        bigGift.weight = 7;
        bigGift.depth = 11;
        bigGift.showAttributes();


















    }
}

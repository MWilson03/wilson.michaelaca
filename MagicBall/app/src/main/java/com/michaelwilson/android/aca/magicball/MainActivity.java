package com.michaelwilson.android.aca.magicball;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);
            Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);

            setSupportActionBar(toolbar);

            //dice roll button
            FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
            fab.setOnClickListener(new View.OnClickListener() {

                @Override
                public void onClick(View view) {
                    Random rand = new Random();
                    Random rand2 = new Random();
                    Random rand3 = new Random();
                    int roll1 = rand.nextInt(6)+1;
                    int roll2 = rand2.nextInt(6)+1;
                    int roll3 = rand3.nextInt(6)+1;
                    TextView myText = (TextView) findViewById(R.id.textView);
                    String myString = String.valueOf(roll1 + roll2 + roll3);
                    myText.setText(myString);
                    Snackbar.make(view, myString, Snackbar.LENGTH_LONG)
                            .setAction("Action", null).show();
                }
            });

            //8 ball button
            FloatingActionButton fab2 = (FloatingActionButton) findViewById(R.id.fab2);
            fab2.setOnClickListener(new View.OnClickListener() {

                @Override
                public void onClick(View view) {
                    Random rand = new Random();
                    int text = rand.nextInt(20)+1;
                    TextView myText = (TextView) findViewById(R.id.textView);
                    String myString = String.valueOf(text);
                    switch (text) {
                        case 1:
                            myString = "It is Certain!";
                            break;
                        case 2:
                            myString = "It is decidedly so!";
                            break;
                        case 3:
                            myString = "Without a shadow of a doubt!";
                            break;
                        case 4:
                            myString = "Yes, most definitely!";
                            break;
                        case 5:
                            myString = "You may rely on it!";
                            break;
                        case 6:
                            myString = "As I see it, absolutely!";
                            break;
                        case 7:
                            myString = "Most likely!";
                            break;
                        case 8:
                            myString = "Outlook Amazing!";
                            break;
                        case 9:
                            myString = "Yes!";
                            break;
                        case 10:
                            myString = "All signs point to YES!";
                            break;
                        case 11:
                            myString = "Reply way to hazy please try again";
                            break;
                        case 12:
                            myString = "Ask again later tater";
                            break;
                        case 13:
                            myString = "Better not say!";
                            break;
                        case 14:
                            myString = "I cannot predict now, shake me harder!";
                            break;
                        case 15:
                            myString = "Concentrate real hard and ask me again later!";
                            break;
                        case 16:
                            myString = "Don't count on it!";
                            break;
                        case 17:
                            myString = "NEIN!!! NEIN!!!!";
                            break;
                        case 18:
                            myString = "My sources say NEIN!";
                            break;
                        case 19:
                            myString = "Outlook not so good!";
                            break;
                        case 20:
                            myString = "Don't be foolish!";
                            break;
                    }
                    myText.setText(myString);
                    Snackbar.make(view, myString, Snackbar.LENGTH_LONG)
                            .setAction("Action", null).show();
                }
            });
        }

    }
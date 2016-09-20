package com.michaelwilson.android.aca.magicball;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
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
                    int roll1 = rand.nextInt(6)+1;
                    int roll2 = rand2.nextInt(6)+1;
                    TextView myText = (TextView) findViewById(R.id.textView);
                    String myString = String.valueOf(roll1 + roll2);
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
                            myString = "It is Certain";
                            break;
                        case 2:
                            myString = "It is decidedly so";
                            break;
                        case 3:
                            myString = "Without a doubt";
                            break;
                        case 4:
                            myString = "Yes, definitely";
                            break;
                        case 5:
                            myString = "You may rely on it";
                            break;
                        case 6:
                            myString = "As I see it, yes";
                            break;
                        case 7:
                            myString = "Most likely";
                            break;
                        case 8:
                            myString = "Most likely";
                            break;
                        case 9:
                            myString = "Yes";
                            break;
                        case 10:
                            myString = "Signs point to yes";
                            break;
                        case 11:
                            myString = "Reply hazy try again";
                            break;
                        case 12:
                            myString = "Ask again later";
                            break;
                        case 13:
                            myString = "Better not tell you now";
                            break;
                        case 14:
                            myString = "Cannot predict now";
                            break;
                        case 15:
                            myString = "Concentrate and ask again";
                            break;
                        case 16:
                            myString = "Don't count on it";
                            break;
                        case 17:
                            myString = "My reply is no";
                            break;
                        case 18:
                            myString = "My sources say no";
                            break;
                        case 19:
                            myString = "Outlook not so good";
                            break;
                        case 20:
                            myString = "Very doubtful";
                            break;
                    }
                    myText.setText(myString);
                    Snackbar.make(view, myString, Snackbar.LENGTH_LONG)
                            .setAction("Action", null).show();
                }
            });
        }
        @Override
        public boolean onCreateOptionsMenu(Menu menu) {
            // Inflate the menu; this adds items to the action bar if it is present.
            getMenuInflater().inflate(R.menu.menu_main, menu);
            return true;
        }
        @Override
        public boolean onOptionsItemSelected(MenuItem item) {
            // Handle action bar item clicks here. The action bar will
            // automatically handle clicks on the Home/Up button, so long
            // as you specify a parent activity in AndroidManifest.xml.
            int id = item.getItemId();
            //noinspection SimplifiableIfStatement
            if (id == R.id.action_settings) {
                return true;
            }
            return super.onOptionsItemSelected(item);
        }
    }
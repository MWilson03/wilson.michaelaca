package com.michaelwilson.android.aca.wordnumber;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView mResultText;
    EditText mEnteredText;
    Button mConvert;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mResultText = (TextView) findViewById(R.id.textView2);
        mEnteredText = (EditText) findViewById(R.id.editText);
        mConvert = (Button) findViewById(R.id.button);


        mConvert.setOnClickListener(new View.OnClickListener() {

            long convertedNumber;

            @Override
            public void onClick(View view) {
                char one;
                char two;



                one = mEnteredText.getText().charAt(0);
                two = mEnteredText.getText().charAt(1);

                switch (one) {

                    case 'o':
                        convertedNumber = 1L;
                        break;

                    case 'f':
                        if (two == 'o') {
                            convertedNumber = 4L;
                            break;
                        } else if (two == 'i') {
                            convertedNumber = 5L;
                            break;
                        }
                    case 's':
                        if (two == 'i') {
                            convertedNumber = 6L;
                            break;
                        } else if (two == 'e') {
                            convertedNumber = 7L;
                            break;
                        }
                    case 't':
                        if (two == 'w') {
                            convertedNumber = 2L;
                            break;

                        } else if (two == 'h') {
                            convertedNumber = 3L;
                            break;
                        } else if (two == 'e') {
                            convertedNumber = 10L;
                            break;
                        }
                    case 'e':
                        convertedNumber = 8L;
                        break;

                    case 'n':
                        convertedNumber = 9L;
                        break;

                } mResultText.setText("The number is: " + convertedNumber);
            }





    });
}}

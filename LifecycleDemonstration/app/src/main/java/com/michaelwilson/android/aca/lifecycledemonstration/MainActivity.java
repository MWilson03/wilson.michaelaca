package com.michaelwilson.android.aca.lifecycledemonstration;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toast.makeText(this, "In onCreate", Toast.LENGTH_SHORT).show();
        Log.i("info", "In onCreate");
    }

    @Override
    protected void onStart() {
        // First call the "offical" version of this method
        super.onStart();

        Toast.makeText(this, "In onStart", Toast.LENGTH_SHORT).show();
        Log.i("info", "In onStart");
    }

    @Override
    protected void onResume() {
        // First call the "offical" version of this methosd
        super.onResume();

        Toast.makeText(this, "In onResume", Toast.LENGTH_SHORT).show();
        Log.i("info", "In onResume");
    }

    @Override
    protected void onPause() {
        // First call the "offical" version of this method
        super.onPause();

        Toast.makeText(this, "In onPause", Toast.LENGTH_SHORT).show();
        Log.i("info", "In onPause");
    }

    @Override
    protected void onStop() {
        // First call the "offical" version of this method
        super.onStop();

        Toast.makeText(this, "In onStop", Toast.LENGTH_SHORT).show();
        Log.i("info", "In onStop");
    }

    @Override
    protected void onDestroy() {
        // First call the "offical" version of this method
        super.onDestroy();

        Toast.makeText(this, "In onDestroy", Toast.LENGTH_SHORT).show();
        Log.i("info", "In onDestroy");
    }
}

package com.michaelwilson.android.aca.simplefragment;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

/**
 * Created by michaelwilson on 9/22/16.
 */

public class SimpleFragment extends Fragment {

    // memner variables accessible from anywhere in this fragment
    String myString;
    Button myButton;

    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);

        myString = "Hello from SimpleFragment";


    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_layout, container, false);

        myButton = (Button) view.findViewById(R.id.button);

        myString = "Hello from SimpleFragment";

        myButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(getActivity(),myString , Toast.LENGTH_SHORT).show();
            }
        });

        return view;



    }


}


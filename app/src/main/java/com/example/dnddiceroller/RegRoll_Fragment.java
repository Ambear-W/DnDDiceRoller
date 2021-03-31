package com.example.dnddiceroller;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.util.logging.Logger;


/**
 * A simple {@link Fragment} subclass.
 * Use the {@link RegRoll_Fragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class RegRoll_Fragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public RegRoll_Fragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment RegRoll_Fragment.
     */
    // TODO: Rename and change types and number of parameters
    public static RegRoll_Fragment newInstance(String param1, String param2) {
        RegRoll_Fragment fragment = new RegRoll_Fragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }



    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_reg_roll_, container, false);

        Button rollDice = v.findViewById(R.id.rollRegDice);


        rollDice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //Still need to figure out how it is grabing the number of dice
                //figure out how to grab the type of dice
                //figure out how to grab plus/minus
                //figure out how to grab modifer

                //figure out how to make the phone vibrate
                //figure out how to do the file thingy aaron did
                //  would like to be able to put the dice break downs there, but that is not needed

                //then you can figure out the character sheet stuff if this isn't too hard to figure out

                EditText diceNumber = (EditText) v.findViewById(R.id.numOfDice);
                String tempNumberOfDice = diceNumber.getText().toString();
                int numberOfDice = 0;

                if("".equals(tempNumberOfDice)){
                    //Toast.makeText(getContext(), "There are empty values", Toast.LENGTH_LONG).show();
                    numberOfDice = 1;
                }else{
                    numberOfDice = Integer.parseInt(tempNumberOfDice);
                    //put something here that will make it show the number of dice you have for now

                }

                //Toast.makeText(getContext(), finalNumberOfDice, Toast.LENGTH_LONG).show();
            }
        });


        //return inflater.inflate(R.layout.fragment_reg_roll_, container, false);
        return v;
    }
}
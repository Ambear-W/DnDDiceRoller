package com.example.dnddiceroller;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import android.os.Bundle;
import android.util.Log;

import com.ismaeldivita.chipnavigation.ChipNavigationBar;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = MainActivity.class.getSimpleName();
    ChipNavigationBar bottomNav;
    FragmentManager fragmentManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //for the navigation
        bottomNav = findViewById(R.id.bottom_nav);

        if(savedInstanceState == null){
            bottomNav.setItemSelected(R.id.regular_roll, true);
            fragmentManager = getSupportFragmentManager();
            RegRoll_Fragment regRoll_fragment = new RegRoll_Fragment();
            fragmentManager.beginTransaction()
                    .replace(R.id.fragement_container, regRoll_fragment)
                    .commit();
        }

        bottomNav.setOnItemSelectedListener(new ChipNavigationBar.OnItemSelectedListener() {
            @Override
            public void onItemSelected(int id) {
                Fragment fragment = null;
                switch(id){
                    case R.id.regular_roll:
                        fragment = new RegRoll_Fragment();
                        break;
                    case R.id.charater_roll:
                        fragment = new fragment_character();
                        break;
                }

                if(fragment != null){
                    fragmentManager = getSupportFragmentManager();
                    fragmentManager.beginTransaction()
                            .replace(R.id.fragement_container, fragment)
                            .commit();
                }else{
                    Log.e(TAG, "Error in creating fragment");
                }
            }
        });


    }
}
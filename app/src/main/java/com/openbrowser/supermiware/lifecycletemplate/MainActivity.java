package com.openbrowser.supermiware.lifecycletemplate;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

/*

***onCreate()***
Called when the activity is first created. This is where you should do all of your normal static set up: create views, bind data to lists, etc.
This method also provides you with a Bundle containing the activity's previously frozen state, if there was one. Always followed by onStart().

*/

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

/*
* ***onStart()***
*
    Called when the activity is becoming visible to the user. Followed by onResume() if the activity
    comes to the foreground, or onStop() if it becomes hidden.
    And you can write your simple class to take a look when these methods call

*/

    @Override
    protected void onStart() {
        super.onStart();

        Log.d("Method Test: ", "Has been called");
        // Code goes here

    }

    @Override
    protected void onResume(){
        super.onResume();

        Log.d("Method Test: ", "Has been called");
        // Code goes here

    }

    @Override
    protected void onPause(){
        super.onPause();

        Log.d("Method Test: ", "Has been called");
        // Code goes here

    }

    // BELOW: onStop method is now guaranteed to be called on devices running api 11+ (Android honeycomb and later)
    @Override
    protected void onStop(){
        super.onStop();

        Log.d("Method Test: ", "Has been called");
        // Code goes here

    }

    @Override
    protected void onDestroy(){
        super.onDestroy();

        Log.d("Method Test: ", "Has been called");
        // Code goes here

    }

}

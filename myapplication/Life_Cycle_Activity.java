package com.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class Life_Cycle_Activity extends AppCompatActivity {

    Button btnChangeActivity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_life_cycle);

        Log.d("LifeCycle","OnCreate method called.....................");
        View btnChangeActivity = findViewById(R.id.btn_change_activity);

        btnChangeActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(),LoginActivity.class);
                startActivities(i);
            }
        });
    }

    private void startActivities(Intent i) {
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("LifeCycle","onStart: Method Calledd.....");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("LifeCycle", "onResume: Method called................... ");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("LifeCycle", "onPause: Method called................... ");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("LifeCycle", "onStop: Method called................... ");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("LifeCycle", "onDestroy: Method called................... ");

    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("LifeCycle","OnRestart Method called...........");
    }
}
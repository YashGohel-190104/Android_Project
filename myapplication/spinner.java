package com.myapplication;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.view.menu.MenuBuilder;

import android.annotation.SuppressLint;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

public class spinner extends AppCompatActivity {

    @SuppressLint("RestrictedApi")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spinner);
        Object spinner = findViewById(R.id.spinner1);
        MenuBuilder country = null;
        country.add("India");
        country.add("Canada");
        country.add("China");
        country.add("USA");

//        ArrayAdapter<String>arrayAdapter = new ArrayAdapter<>(getApplicationContext(), android.R.layout.simple_spinner_dropdown_item,country);
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, R.layout.activity_smple_listtview1,country){

            public View getDropDownView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
//                return super.getDropDownView(position, convertView, parent);
                TextView tvData = (TextView) super.getDropDownView(position, convertView, parent);

                if (position == 0 || position==1){
                    tvData.setTextColor(Color.BLACK);
                }else {
                    tvData.setTextColor(Color.BLUE);
                }
                return tvData;
            }
        };


    }

    private static void setAdapter(ArrayAdapter<String> arrayAdapter) {


    }
}
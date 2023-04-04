package com.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class Smple_List extends AppCompatActivity {

    ListView listView;
    //    ArrayList<String>arrLang=new ArrayList<>();
    String arr[]=new String[]{"India","Canada","Nepal","Africa","USA","China"};
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_smple_list);
        listView = findViewById(R.id.list_view);
//        arrLang.add("Python");
//        arrLang.add("Java");
//        arrLang.add("Android");
//        arrLang.add("C");
//        arrLang.add("C++");
//        arrLang.add("HTML");
//        arrLang.add("Css");
//        arrLang.add("Python");
//        arrLang.add("Java");
//        arrLang.add("Android");
//        arrLang.add("C");
//        arrLang.add("C++");
//        arrLang.add("HTML");
//        arrLang.add("Css");
//        arrLang.add("Python");
//        arrLang.add("Java");
//        arrLang.add("Android");
//        arrLang.add("C");
//        arrLang.add("C++");
//        arrLang.add("HTML");
//        arrLang.add("Css");

//        ArrayAdapter<String>arrayAdapter = new ArrayAdapter<String>(getApplicationContext(), android.R.layout.simple_list_item_1,arrLang);
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<>(this,R.layout.activity_smple_list,arr);
        listView.setAdapter(arrayAdapter);
    }
}
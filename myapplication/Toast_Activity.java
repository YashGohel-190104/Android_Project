package com.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class Toast_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_toast);

        View btnClick = null;
        btnClick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

//                Toast.makeText(ToastActivity.this, "Button Clicked ", Toast.LENGTH_LONG).show();

                Toast t = Toast.makeText(Toast_Activity.this, "Button Clicked ", Toast.LENGTH_LONG);
                t.show();
            }
        });
    }
}
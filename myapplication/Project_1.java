package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.google.android.material.button.MaterialButton;

public class Project_1 extends AppCompatActivity {
    Button bt1,bt2,bt3,bt4,bt5,bt6,bt7,bt8,bt9,bt0,bt00,btAc,btDel,btCe,btDot,btm1,btm2,btsum,btsub,btmul,btdiv,btspc,bteql,btmod;
    EditText t1,t2,ans;

//    Float v1,v2;
//
//    boolean ifadd,ifdiv,ifmul,ifsub;

    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_project1);

        t1 = findViewById(R.id.t1);
        t2 = findViewById(R.id.t2);
        ans = findViewById(R.id.ans);

        bt1 = findViewById(R.id.bt1);
        bt2 = findViewById(R.id.bt2);
        bt3 = findViewById(R.id.bt3);
        bt4 = findViewById(R.id.bt4);
        btsum = findViewById(R.id.btsum);
        btsub = findViewById(R.id.btsub);
        btmul = findViewById(R.id.btmul);
        btdiv = findViewById(R.id.btdiv);
        btmod = findViewById(R.id.btmod);
        bteql = findViewById(R.id.bteql);

        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                t1.setText(t1.getText() + "1");
          //      t2.setText(t2.getText() + "1");
            }
        });

        bt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                t1.setText(t1.getText() + "2");
//                t2.setText(t2.getText() + "2");
            }
        });
        bt3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                t1.setText(t1.getText() + "3");
//                t2.setText(t2.getText() + "3");
            }
        });
        bt4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                t1.setText(t1.getText() + "4");
//                t2.setText(t2.getText() + "4");
            }
        });
        btsum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int n1 = Integer.parseInt(t1.getText().toString());
                int n2 = Integer.parseInt(t2.getText().toString());
                int total = n1+n2;
                ans.setText("Answer = " + total);
            }
        });
        btsub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int n1 = Integer.parseInt(t1.getText().toString());
                int n2 = Integer.parseInt(t2.getText().toString());
                int total = n1-n2;
                ans.setText("Answer = " + total);
            }
        });
        btmul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int n1 = Integer.parseInt(t1.getText().toString());
                int n2 = Integer.parseInt(t2.getText().toString());
                int total = n1*n2;
                ans.setText("Answer = " + total);
            }
        });
        btdiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int n1 = Integer.parseInt(t1.getText().toString());
                int n2 = Integer.parseInt(t2.getText().toString());
                int total = n1/n2;
                ans.setText("Answer = " + total);
            }
        });
        btmod.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int n1 = Integer.parseInt(t1.getText().toString());
                int n2 = Integer.parseInt(t2.getText().toString());
                int total = n1%n2;
                ans.setText("Answer = " + total);
            }
        });
//        bt1.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                t1.setText(t1.getText() + "1");
//            }
//        });
//        bt2.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                t1.setText(t2.getText() + "2");
//            }
//        });
//        btsum.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                v1 = Float.valueOf(t1.getText()+"");
//                ifadd=true;
//                t1.setText(null);
//            }
//        });
//        bteql.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                v2 = Float.parseFloat(t1.getText()+"");
//                if(ifadd==true){
//                    t1.setText(v1 + v2+ "");
//                    ifadd = false;
//                }
//            }
//        });
    }
}
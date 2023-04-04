package com.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class add_two_number extends AppCompatActivity {

    EditText edtn1,edtn2;
    Button btnAdd,btnSub,btnMul,btnDiv;
    TextView txtans;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_two_number);

        edtn1 = findViewById(R.id.edtn1);
        edtn2 = findViewById(R.id.edtn2);

        btnAdd = findViewById(R.id.btnAdd);
        btnSub = findViewById(R.id.btnSub);
        btnMul = findViewById(R.id.btnMul);
        btnDiv = findViewById(R.id.btnDiv);
        txtans = findViewById(R.id.txtans);

        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int n1 = Integer.parseInt(edtn1.getText().toString());
                int n2 = Integer.parseInt((edtn2.getText().toString()));
                int sum = n1+n2;
                txtans.setText("Answer is " + sum);
         //       Toast.makeText(AddTwoNumber.this, "Addition is: " + sum, Toast.LENGTH_LONG).show();
            }
        });

        btnSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int n1 = Integer.parseInt(edtn1.getText().toString());
                int n2 = Integer.parseInt((edtn2.getText().toString()));
                int sub = n1-n2;
                txtans.setText("Answer is " + sub);
            }
        });

        btnDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int n1 = Integer.parseInt(edtn1.getText().toString());
                int n2 = Integer.parseInt((edtn2.getText().toString()));
                int Div = n1/n2;
                txtans.setText("Answer is " + Div);
            }
        });

        btnMul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int n1 = Integer.parseInt(edtn1.getText().toString());
                int n2 = Integer.parseInt((edtn2.getText().toString()));
                int mul = n1*n2;
                txtans.setText("Answer is " + mul);
            }
        });
    }
}
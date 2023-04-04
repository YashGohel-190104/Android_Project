package com.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class BMI_ACTIVITY extends AppCompatActivity {

    EditText weight,h_feet,h_inch;
    Button C_btn;
    TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bmi);

        weight = findViewById(R.id.weight);
        h_feet = findViewById(R.id.h_feet);
        h_inch = findViewById(R.id.h_inch);

        C_btn = findViewById(R.id.C_btn);

        result = findViewById(R.id.result);

        C_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int n1 = Integer.parseInt(weight.getText().toString());
                int n2 = Integer.parseInt((h_feet.getText().toString()));
                int n3 = Integer.parseInt((h_inch.getText().toString()));

                double answer = n1/Math.pow(n2,2);

                if(answer<19)
                {
                    result.setText("answer: "+answer+"\n \n you are under weight");
                }
                else if (answer>19 && answer <=25)
                {
                    result.setText("answer:" +answer+"kg/m^2"+"\n\n you are normal weight");
                }
                else
                {
                    result.setText("answer:" +answer+"kg/m^2"+"\n\n you are over weight");
                }
            }
        });
    }
}
package com.myapplication;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.widget.Toast;

public class alert_box extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alert_box);

        AlertDialog alertDialog = new AlertDialog.Builder(this).create();
        alertDialog.setTitle("Terms & condition");;
        alertDialog.setMessage("Have you read all T&C");
        alertDialog.setIcon(R.drawable.baseline_add_alert_24);
        alertDialog.setButton(-2, "yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                Toast.makeText(alert_box.this, ".........", Toast.LENGTH_SHORT).show();
            }
        });
        alertDialog.show();

        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setIcon(R.drawable.baseline_delete_24);
        builder.setTitle("Delete ?");
        builder.setMessage("are you sure ?");
        builder.setPositiveButton("no", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                Toast.makeText(alert_box.this, "Deleted...", Toast.LENGTH_SHORT).show();
            }
        });
        builder.setNegativeButton("yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                Toast.makeText(alert_box.this, "........", Toast.LENGTH_SHORT).show();
            }
        });

        builder.setNeutralButton("cancle", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {

            }
        });
        builder.show();
    }

    @Override
    public void onBackPressed() {

        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setIcon(R.drawable.baseline_exit_to_app_24);
        builder.setTitle("Exit");
        builder.setMessage("are you sure ?");
        builder.setPositiveButton("yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                alert_box.super.onBackPressed();
            }
        });

        builder.setNegativeButton("No", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                Toast.makeText(alert_box.this, "........", Toast.LENGTH_SHORT).show();
            }
        });

        builder.setNeutralButton("Cancle", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {

            }
        });
        builder.show();



    }
}
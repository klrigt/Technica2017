package com.example.krodrigo13.technica2017;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class alertnotif extends AppCompatActivity {

    private Button alertButton;
    private Button qrScanButton;
    private TextView alertTextView;
    private int quantity;
    private String cellPhone;
    private String email;
    private double distance;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alertnotif);

        alertButton = (Button) findViewById(R.id.alertbutton);
        qrScanButton = (Button) findViewById(R.id.scanqrbutton);
        alertTextView = (TextView) findViewById(R.id.alerttextview);
        quantity = 1;
        cellPhone = "123-456-7890";
        email = "emilyle123@gmail.com";
        distance = 0.5;

        alertButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder builder = new AlertDialog.Builder(alertnotif.this);

                builder.setCancelable(true);
                builder.setTitle("She needs you!");
                builder.setMessage("Emily Le needs " + quantity + " pads!\n"
                        + "Her contact information is " + cellPhone + " and "
                        + email +"\nShe is " + distance + " miles away from you. Please help her!");

                builder.setNegativeButton("Decline", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        dialogInterface.cancel();
                        startActivity(new Intent(alertnotif.this, MainMenu.class));
                    }
                });

                builder.setPositiveButton("Accept", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        alertTextView.setVisibility(View.VISIBLE);
                        qrScanButton.setVisibility(View.VISIBLE);
                    }
                });
                builder.show();
            }
        });

        qrScanButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(alertnotif.this, scannerpage.class));
            }
        });

    }
}

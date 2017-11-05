package com.example.krodrigo13.technica2017;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class provider extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_provider);

        getSupportActionBar().setTitle("She Needs You!");
        Button accept = (Button) findViewById(R.id.accept);
        Button decline = (Button) findViewById(R.id.decline);
        //EditText customerName = (EditText) findViewById(R.id.customerName);

        accept.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(provider.this, acceptpage.class));
            }
        });

        decline.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(provider.this, declinepage.class));
            }
        });

    }
}

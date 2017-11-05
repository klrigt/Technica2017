package com.example.krodrigo13.technica2017;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Match extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_match);
    }

    public void connect(View view) {
        Intent intent = new Intent(this, Connect.class);
        startActivity(intent);
    }
}



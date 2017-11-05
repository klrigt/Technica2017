package com.example.krodrigo13.technica2017;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainMenu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menu);
    }

    public void signOut(View view)
    {
        Intent intent = new Intent(this, HomeScreen.class);
        startActivity(intent);
    }

    public void findLifeSaver(View view)
    {
        Intent intent = new Intent(this, Match.class);
        startActivity(intent);
    }

    public void settings(View view)
    {
        Intent intent = new Intent(this, Settings.class);
        startActivity(intent);
    }

    public void redeemPoints(View view)
    {
        Intent intent = new Intent(this, Redeem.class);
        startActivity(intent);
    }

}

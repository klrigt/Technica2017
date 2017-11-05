package com.example.krodrigo13.technica2017;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Toast;

public class SignIn extends AppCompatActivity
{
    EditText username = (EditText) findViewById(R.id.username);
    EditText password = (EditText) findViewById(R.id.password);
    ImageButton signinBut = (ImageButton) findViewById(R.id.signinbutton);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in);

        signinBut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!(username.getText().toString().trim().equals(""))
                        && password.getText().toString().trim().equals("")){
                    startActivity(new Intent(SignIn.this, MainMenu.class));
                    Toast.makeText(getApplicationContext(), "Signing in"
                            , Toast.LENGTH_SHORT).show();
                }
                else
                {
                    Toast.makeText(getApplicationContext(), "Please enter a valid username and " +
                            "password", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

    /*
    public void enterMain(View view)
    {
        Intent intent = new Intent(this, MainMenu.class);
        startActivity(intent);
    }
    */
}

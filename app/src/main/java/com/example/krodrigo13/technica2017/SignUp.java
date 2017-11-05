package com.example.krodrigo13.technica2017;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class SignUp extends AppCompatActivity {

    private boolean flag = false;
    private boolean flag2 = false;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        final EditText usernameSignup = (EditText) findViewById(R.id.usernameSignup);
        final EditText passwordSignup = (EditText) findViewById(R.id.passwordSignup);
        final EditText confirmPW = (EditText) findViewById(R.id.confirmPW);
        final EditText cellSignup = (EditText) findViewById(R.id.cellSignup);
        final EditText emailSignup = (EditText) findViewById(R.id.emailSignup);
        Button createAccount = (Button) findViewById(R.id.buttonCreateAccount);

        createAccount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!(usernameSignup.getText().toString().trim().equals(""))
                && !(passwordSignup.getText().toString().trim().equals(""))
                && !(confirmPW.getText().toString().trim().equals(""))
                && !(cellSignup.getText().toString().trim().equals(""))
                && !(emailSignup.getText().toString().trim().equals(""))){
                    Toast.makeText(getApplicationContext(), "Creating an account"
                            , Toast.LENGTH_SHORT).show();
                    startActivity(new Intent(SignUp.this, MainMenu.class));
                    flag = true;

                }
                /*
                if(!(passwordSignup.getText().toString().trim().equals(confirmPW.getText().toString().trim()))){
                    Toast.makeText(getApplicationContext(), "Password does not match. Please try again."
                            , Toast.LENGTH_SHORT).show();
                    flag2 = true;
                }
                */
                if(!flag){

                    Toast.makeText(getApplicationContext(), "Please enter all of your " +
                            "information", Toast.LENGTH_SHORT).show();

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

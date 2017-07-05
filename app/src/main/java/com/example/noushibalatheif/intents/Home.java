package com.example.noushibalatheif.intents;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Home extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
    }

    public void loginClicked(View v)
    {
        Intent i=new Intent(this, Login.class);
        startActivity(i);

    }

    public void registrationClicked(View v)
    {
        Intent j=new Intent(this, Registration.class);
        startActivity(j);
    }


}

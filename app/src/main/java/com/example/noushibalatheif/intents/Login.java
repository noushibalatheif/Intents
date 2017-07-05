package com.example.noushibalatheif.intents;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }
    public void submitClicked(View v)
    {
        Intent n=new Intent(this, Main.class);
        startActivity(n);
    }
    public void mainClicked(View v)
    {
        Intent k=new Intent(this, Home.class);
        startActivity(k);
    }

}

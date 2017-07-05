package com.example.noushibalatheif.intents;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Registration extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);
    }

    public void subClicked(View v)
    {
        Intent m=new Intent(this, Main.class);
        startActivity(m);

    }

    public void btnClicked(View v)
    {
        Intent c=new Intent(this, Main.class);
        startActivity(c);
    }
}

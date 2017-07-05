package com.example.noushibalatheif.intents;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;

public class Main extends AppCompatActivity {

    public String[] movies={"Inception", "Home Alone", "Logan","A Walk to Remember","Inside Out","Finding Nemo"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView mylist = (ListView) findViewById(R.id.mylist);
        ListAdapter myadapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, movies);
        mylist.setAdapter(myadapter);

    }

    public void mainnClicked(View v)
    {
        Intent l=new Intent(this, Home.class);
        startActivity(l);
    }

}

package com.example.nagar.onlinetest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class addtest extends AppCompatActivity {

    public void addquestion(View view)
    {
        Intent intent = new Intent(getApplicationContext(),addquestion.class);
        startActivity(intent);
    }

    public void rules(View view)
    {
        Intent intent = new Intent(getApplicationContext(),addrules.class);
        startActivity(intent);
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_addtest);
    }
}

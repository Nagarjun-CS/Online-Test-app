package com.example.nagar.onlinetest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class facultylogin extends AppCompatActivity {

    public void faculty(View view)
    {
        Intent intent = new Intent(getApplicationContext(),faculty.class);
        startActivity(intent);
    }

    public void register(View view)
    {
        Intent intent = new Intent(getApplicationContext(),facultyregister.class);
        startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_facultylogin);
    }
}

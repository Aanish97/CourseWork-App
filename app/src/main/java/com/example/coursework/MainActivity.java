package com.example.coursework;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void createPage(View view)
    {
        Intent intent = new Intent(this, create_profile.class);
        this.startActivityForResult(intent, 55);
    }

    public void course_summary(View view)
    {
        Intent intent = new Intent(this, course_summary.class);
        this.startActivityForResult(intent, 35);
    }
}

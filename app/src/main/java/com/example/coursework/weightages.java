package com.example.coursework;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class weightages extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_weightages);
    }

    public  void btnClick1(View view)
    {
        Intent intent = new Intent(this, course_summary.class);
        this.startActivityForResult(intent, 35);
    }
}

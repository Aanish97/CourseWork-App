package com.example.coursework;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class course_summary extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_course_summary);
    }

    public void weightages(View view)
    {
        Intent intent = new Intent(this, weightages.class);
        this.startActivityForResult(intent, 35);
    }

    public void assesments(View view)
    {
        Intent intent = new Intent(this, assesments.class);
        this.startActivityForResult(intent, 35);
    }

}

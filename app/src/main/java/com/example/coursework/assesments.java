package com.example.coursework;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class assesments extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_assesments);
    }

    public void btnClick5(View view)
    {
        Intent intent = new Intent(this, course_summary.class);
        this.startActivityForResult(intent, 55);
    }

}

package com.example.intentextras;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.widget.TextView;



public class ViewActivity extends AppCompatActivity {

    TextView tvView;
    TextView tvView2;
    TextView tvView3;
    TextView tvView4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view);

        tvView = (TextView) findViewById(R.id.tvView);
        tvView2 = (TextView) findViewById(R.id.tvView2);
        tvView3 = (TextView) findViewById(R.id.tvView3);
        tvView4 = (TextView) findViewById(R.id.tvView4);


        Intent intent = getIntent();

        String FName = intent.getStringExtra("fname");
        String LName = intent.getStringExtra("lname");
        String Age = intent.getStringExtra("age");
        String Date = intent.getStringExtra("date");
        String Country = intent.getStringExtra("country");
        String City = intent.getStringExtra("city");
        String Street = intent.getStringExtra("street");
        String About = intent.getStringExtra("about");


        tvView.setText("Your name is: " + FName + " " + LName);


        tvView2.setText("Your age: " + Age + " " + "and your born:" + Date);


        tvView3.setText("Your living in: " + Country + City + Street);


        tvView4.setText("About you: " + About + ".");


    }

}
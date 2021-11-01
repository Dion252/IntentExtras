package com.example.intentextras;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

public class CountryActivity extends Activity {

    EditText etCountry;
    EditText etCity;
    EditText etStreet;

    Button btnSubmit;


    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_country);

        etCountry = (EditText) findViewById(R.id.etCountry);
        etCity = (EditText) findViewById(R.id.etCity);
        etStreet = (EditText) findViewById(R.id.etStreet);

        Intent intent = getIntent();
        String FName = intent.getStringExtra("fname");
        String LName = intent.getStringExtra("lname");
        String Age = intent.getStringExtra("age");
        String Date = intent.getStringExtra("date");

        btnSubmit = (Button) findViewById(R.id.btnSubmit);
        btnSubmit.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CountryActivity.this, SomethingActivity.class);
                intent.putExtra("country", etCountry.getText().toString());
                intent.putExtra("city", etCity.getText().toString());
                intent.putExtra("street", etStreet.getText().toString());
                intent.putExtra("fname",FName);
                intent.putExtra("lname",LName);
                intent.putExtra("age",Age);
                intent.putExtra("date",Date);
                startActivity(intent);
                //switch (v.getId()) {
                //case R.id.btnSubmit:
                //Intent intent1 = new Intent(this, SomethingActivity.class);
                //startActivity(intent1);
                //break;
                //}
            }

        });

    }



}
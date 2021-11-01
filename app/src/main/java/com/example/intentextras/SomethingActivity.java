package com.example.intentextras;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

public class SomethingActivity extends Activity {

    EditText etAbout;
    Button btnSubmit;

    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_something);

        etAbout = (EditText) findViewById(R.id.etAbout);

        Intent intent = getIntent();
        String FName = intent.getStringExtra("fname");
        String LName = intent.getStringExtra("lname");
        String Age = intent.getStringExtra("age");
        String Date = intent.getStringExtra("date");
        String Country = intent.getStringExtra("country");
        String City = intent.getStringExtra("city");
        String Street = intent.getStringExtra("street");

        btnSubmit = (Button) findViewById(R.id.btnSubmit);
        btnSubmit.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SomethingActivity.this, ViewActivity.class);
                intent.putExtra("about", etAbout.getText().toString());
                intent.putExtra("fname",FName);
                intent.putExtra("lname",LName);
                intent.putExtra("age",Age);
                intent.putExtra("date",Date);
                intent.putExtra("country",Country);
                intent.putExtra("city",City);
                intent.putExtra("street",Street);

                startActivity(intent);
            }

        });
    }


}
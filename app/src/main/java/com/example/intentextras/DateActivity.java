package com.example.intentextras;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class DateActivity extends Activity {

    EditText etAge;
    EditText etDate;

    Button btnSubmit;





    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_date);

        etAge = (EditText) findViewById(R.id.etAge);
        etDate = (EditText) findViewById(R.id.etDate);

        Intent intent = getIntent();
        String FName = intent.getStringExtra("fname");
        String LName = intent.getStringExtra("lname");

        btnSubmit = (Button) findViewById(R.id.btnSubmit);
        btnSubmit.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {

                Intent intent = new Intent(DateActivity.this, CountryActivity.class);

                intent.putExtra("age", etAge.getText().toString());
                intent.putExtra("date", etDate.getText().toString());
                intent.putExtra("fname",FName);
                intent.putExtra("lname",LName);
                startActivity(intent);

                //switch (v.getId()) {
                //case R.id.btnSubmit:
                //  Intent intent1 = new Intent(this, CountryActivity.class);
                //startActivity(intent1);
                //break;
                //}
            }
        });







    }



}
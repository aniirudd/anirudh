package com.github.nisrulz.senseysample;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Patterns;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;



public class Main3Activity extends AppCompatActivity {

    private Button submit1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        submit1 = (Button) findViewById(R.id.submit);

    }
    public void display(View view) {
        EditText edit1 = (EditText) findViewById(R.id.e3);
        EditText edit2 = (EditText) findViewById(R.id.e4);

        if (checkemail(edit1.getText().toString().trim())&& edit2.getText().toString().trim().length()>8) {
            Intent i = new Intent(Main3Activity.this, MainActivity.class);
            Toast.makeText(getApplicationContext(), "Welcome", Toast.LENGTH_SHORT).show();
            startActivity(i);


        } else {

            Toast.makeText(getApplicationContext(), "Invalid Details", Toast.LENGTH_SHORT).show();
        }

    }

    public boolean checkemail(String s) {
        if (Patterns.EMAIL_ADDRESS.matcher(s).matches())
            return true;
        else
            return false;
    }
}

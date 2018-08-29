package com.github.nisrulz.senseysample;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Patterns;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.firebase.auth.FirebaseAuth;

public class Main2Activity extends AppCompatActivity {


    private FirebaseAuth mAuth;
    private Button submit;
    private Button register;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        mAuth = FirebaseAuth.getInstance();
        submit = (Button) findViewById(R.id.submit);
        register=(Button) findViewById(R.id.register);
    }

    public void display(View view) {
        EditText edit1 = (EditText) findViewById(R.id.e1);
        EditText edit2 = (EditText) findViewById(R.id.e2);

        if (checkemail(edit1.getText().toString().trim())&& edit2.getText().toString().trim().length()>8) {
            Intent i = new Intent(Main2Activity.this, MainActivity.class);
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
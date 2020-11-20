package com.example.myfirstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    //global variables
    private int tacoCounter = 0;
    public static final String EXTRA_MESSAGE = "com.example.myfirstapp.MESSAGE";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button taco_button = (Button) findViewById(R.id.tacoButton);
        taco_button.setOnClickListener(this);

        final Button act_button = (Button) findViewById(R.id.newActButton);
        act_button.setOnClickListener(this);
    }

    //switch selector for all buttons
    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.tacoButton:
                tacoCounter = tacoCounter + 1;
                updateTacos();
                break;
            case R.id.newActButton:
                newActivity();
                break;
            default:
                ButtonHandlingError();
                break;
        }
    }

    public void updateTacos()
    {
            TextView tc = (TextView)findViewById(R.id.tacoCount);
            tc.setText(Integer.toString(tacoCounter));
            System.out.println("error is thrown");
    }


    public void newActivity() {
        Intent intent = new Intent(this, SecondActivity.class);
        startActivity(intent);

    }

    public void ButtonHandlingError() {
        TextView tc = (TextView)findViewById(R.id.tacoCount);
        tc.setText("error: you have somehow clicked a button that doesn't exist");
    }
}
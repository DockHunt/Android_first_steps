package com.example.myfirstapp;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity implements View.OnClickListener {
    //globar vars
    public static final String EXTRA_MESSAGE = "This is the new second screen\n"
        + "I just installed,\nhope you enjoy it :)";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_message);

        //capture layout's TextView and set string as its text
        TextView tv = findViewById(R.id.messageText);
        tv.setText(EXTRA_MESSAGE);

        final Button secret_button = (Button) findViewById(R.id.secretButton);
        secret_button.setOnClickListener(this);
    }

    //switch selector for all buttons
    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.secretButton:
                revealSecrets();
                break;
            default:
                ButtonHandlingError();
                break;
        }
    }

    public void revealSecrets() {
        Intent intent = new Intent(this, SecretImageActivity.class);
        startActivity(intent);
    }

    public void ButtonHandlingError() {
        TextView tc = (TextView)findViewById(R.id.tacoCount);
        tc.setText("error: you have somehow clicked a button that doesn't exist");
    }
}
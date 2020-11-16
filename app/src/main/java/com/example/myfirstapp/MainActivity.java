package com.example.myfirstapp;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    //global variables
    private int tacoCounter = 0;
    public static final String EXTRA_MESSAGE = "com.example.myfirstapp.MESSAGE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button taco_button = findViewById(R.id.tacoButton);
        taco_button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                tacoCounter = tacoCounter + 1;
                updateTacos();
            }
        });

        final Button taco_button = findViewById(R.id.tacoButton);
        taco_button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                tacoCounter = tacoCounter + 1;
                updateTacos();
            }
        });


    }

    public void updateTacos()
    {
        TextView tc = (TextView)findViewById(R.id.tacoCount);
        tc.setText(Integer.toString(tacoCounter));
    }

    public void sendMessage(View view) {
        Intent intent = new Intent(this, DisplayMessageActivity.class);
        EditText et = (EditText) findViewById(R.id.extraButton);
        String message = et.getText().toString();
        intent.putExtra(EXTRA_MESSAGE, message);
        startActivity(intent);

    }

}
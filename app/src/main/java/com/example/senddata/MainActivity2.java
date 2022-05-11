package com.example.senddata;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        TextView textView = new TextView(this);
        textView.setTextSize(26);
        textView.setPadding(16, 16, 16, 16);

        Bundle arguments = getIntent().getExtras();

        if (arguments != null) {
            String firstName = arguments.get("First name").toString();
            String lastName = arguments.get("Last name").toString();
            textView.setText("First name: " + firstName + "\nLast name: " + lastName);
        }
        setContentView(textView);
    }
}
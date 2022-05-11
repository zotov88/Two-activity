package com.example.senddata;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClick(View v) {

        EditText firstName = findViewById(R.id.firstName);
        EditText lastName = findViewById(R.id.lastName);

        String fn = firstName.getText().toString();
        String ln = lastName.getText().toString();

        Intent intent = new Intent(this, MainActivity2.class);
        intent.putExtra("First name", fn);
        intent.putExtra("Last name", ln);
        startActivity(intent);
    }
}
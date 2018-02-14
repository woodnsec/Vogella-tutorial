package com.woodenbottle.android.testapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class activity_create_user extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_user);
    }

    public void onClick(View view) {
        EditText input = (EditText) findViewById(R.id.username);
        String string = input.getText().toString();
        Toast.makeText(this, "User " + string + " created", Toast.LENGTH_LONG).show();
    }
}

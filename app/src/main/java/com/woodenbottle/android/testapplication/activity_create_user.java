package com.woodenbottle.android.testapplication;

import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.Toast;

public class activity_create_user extends AppCompatActivity {
    boolean male = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_user);
        final RadioGroup radioGroup = (RadioGroup) findViewById(R.id.gender);
        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                switch (checkedId) {
                    case R.id.male:
                        male = true;
                        break;
                    case R.id.female:
                        male = false;
                        break;
                }
            }
        });
    }



    public void onClick(View view) {
        String gender = "male";

        EditText input = (EditText) findViewById(R.id.username);
        String string = input.getText().toString();
        if (male == false) {
            gender = "female";
        }


        Toast.makeText(this, gender + " user " + string + " created", Toast.LENGTH_LONG).show();
    }
}

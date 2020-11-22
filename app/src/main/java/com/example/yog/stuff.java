package com.example.yog;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class stuff extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stuff);
    }

    public void back_to_m (View view) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}
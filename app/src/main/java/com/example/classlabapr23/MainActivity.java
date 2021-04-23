package com.example.classlabapr23;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity
    {
        private int counter;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);
            this.counter = 0;
        }

        public void onNextScreenButtonClicked(View v)
        {
            this.startActivity(i);

        }
    }
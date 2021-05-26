package com.practice.gitpractice;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        System.out.println("THIS IS CONTAINED IN MY SECOND COMMIT");
        System.out.println("LOCAL CHANGE");
        System.out.println("Change 4");
        System.out.println("THIS LINE WILL BE MERGED");
    }
}
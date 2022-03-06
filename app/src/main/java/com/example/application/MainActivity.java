package com.example.application;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.content.Context;
import androidx.appcompat.widget.Toolbar;

public class MainActivity extends AppCompatActivity {
	private Toolbar mToolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
		
		mToolbar = findViewById(R.id.toolbarMain);
		setSupportActionBar(mToolbar);
		getSupportActionBar().setDisplayShowTitleEnabled(false);
    }
}

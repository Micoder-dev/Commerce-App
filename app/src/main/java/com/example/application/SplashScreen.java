package com.example.application;

import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;
import android.content.Intent;

public class SplashScreen extends Activity {
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
		setContentView(R.layout.splash_screen);
		
		new Handler().postDelayed(new Runnable() {

// Using handler with postDelayed called runnable run method

				@Override

				public void run() {

					Intent i = new Intent(SplashScreen.this, MainActivity.class);

					startActivity(i);

					// close this activity

					finish();

				}

			}, 5*1000); // wait for 5 seconds
        
    }
    
}

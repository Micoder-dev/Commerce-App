package com.example.application;

import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;
import android.content.Intent;
import android.widget.VideoView;
import android.net.Uri;
import android.media.MediaPlayer;

public class SplashScreen extends Activity {
	
	VideoView videoView;
    
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

			}, 6*1000); // wait for 5 seconds
			
			
			//splashscreen bg vid
			videoView=findViewById(R.id.videoview);
			Uri uri=Uri.parse("android.resource://"+getPackageName()+"/"+R.raw.bg_video);
			videoView.setVideoURI(uri);
			videoView.start();
			videoView.setOnPreparedListener(new MediaPlayer.OnPreparedListener(){
				@Override
				public void onPrepared(MediaPlayer mp){
					mp.setLooping(true);
					mp.setVolume(0, 0);
				}
			});
        
    }

	@Override
	protected void onResume() {
		videoView.resume();
		super.onResume();
	}

	@Override
	protected void onRestart() {
		videoView.start();
		super.onRestart();
	}

	@Override
	protected void onPause() {
		videoView.suspend();
		super.onPause();
	}

	@Override
	protected void onDestroy() {
		videoView.stopPlayback();
		super.onDestroy();
	}
	
	
}

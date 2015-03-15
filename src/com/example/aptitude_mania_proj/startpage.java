package com.example.aptitude_mania_proj;

import android.app.Activity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;

public class startpage extends Activity{
	MediaPlayer mp;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.start);
		mp=MediaPlayer.create(getApplicationContext(), R.raw.vinay);
		mp.start();
		Thread t=new Thread(){
			public void run() {
				try {
					sleep(6000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}finally{
					Intent i = new Intent("com.example.aptitude_mania_proj.MAINACTIVITY");
					startActivity(i);
				}
			};
		};t.start();
	}
@Override
protected void onPause() {
	// TODO Auto-generated method stub
	super.onPause();
	finish();
	mp.release();
}
}

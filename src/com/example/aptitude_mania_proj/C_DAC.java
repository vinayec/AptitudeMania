package com.example.aptitude_mania_proj;

import java.io.IOException;
import java.io.InputStream;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;

public class C_DAC extends Activity{
	WebView wv;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.c_dac);
		wv=(WebView) findViewById(R.id.webView1);
		 WebView webview = new WebView(this);
	        setContentView(webview);
	        try {
	            InputStream fin = getAssets().open("cdacpaper.html");
	    		byte[] buffer = new byte[fin.available()];
	    		fin.read(buffer);
	    		fin.close();
	    		webview.loadData(new String(buffer), "text/html", "UTF-8");
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	}

}

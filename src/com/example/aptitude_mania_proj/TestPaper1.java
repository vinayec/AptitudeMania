package com.example.aptitude_mania_proj;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class TestPaper1 extends Activity implements OnClickListener{
	Button b;
	TextView tv;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.teststartpage);
		b=(Button) findViewById(R.id.button1);
		tv=(TextView) findViewById(R.id.textView2);
		tv=(TextView) findViewById(R.id.textView3);
		tv=(TextView) findViewById(R.id.textView4);
		b.setOnClickListener(this);
	}
	@Override
	public void onClick(View arg0) {
		// TODO Auto-generated method stub
		Intent i=new Intent("com.example.aptitude_mania_proj.TEST1CODE");
		startActivity(i);
	}

}

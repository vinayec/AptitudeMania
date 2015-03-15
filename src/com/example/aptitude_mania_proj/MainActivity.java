package com.example.aptitude_mania_proj;


import android.os.Bundle;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.text.AlteredCharSequence;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageButton; 
import android.widget.Toast;

public class MainActivity extends Activity implements OnClickListener,DialogInterface.OnClickListener{
 CharSequence[] item = {"Time and Work","Train","Percentage","Age"};
ImageButton formula,question,test,company,exam;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		formula=(ImageButton) findViewById(R.id.formulas);
		question=(ImageButton) findViewById(R.id.questions);
		test=(ImageButton) findViewById(R.id.test);
		company=(ImageButton) findViewById(R.id.company);
		exam=(ImageButton) findViewById(R.id.allindiaexam);
		formula.setOnClickListener(this);
		question.setOnClickListener(this);
		test.setOnClickListener(this);
		company.setOnClickListener(this);
		exam.setOnClickListener(this);
	}
	@Override
	public boolean onCreateOptionsMenu(Menu m) {
		// Inflate the menu; this adds items to the action bar if it is present.
	
		MenuInflater mi=getMenuInflater();
		mi.inflate(R.menu.main, m);
		return true;
	}
	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// TODO Auto-generated method stub
		super.onOptionsItemSelected(item);
		switch (item.getItemId()) {
		case R.id.item1:
			Intent i=new Intent("com.example.aptitude_mania_proj.ABOUT_US");
			startActivity(i);
			break;
		case R.id.item2:
	       
			break;
		}
		return true;
	}

	@Override
	public void onClick(DialogInterface arg0, int arg1) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		switch (v.getId()) {
		case R.id.formulas:
			Intent i=new Intent("com.example.aptitude_mania_proj.ITEMLIST");
			startActivity(i);
			break;
		case R.id.questions:
			Intent j=new Intent("com.example.aptitude_mania_proj.QUESTIONSLIST");
			startActivity(j);
			
			break;
		case R.id.test:
			Intent p=new Intent("com.example.aptitude_mania_proj.TESTLIST");
			startActivity(p);
			break;
		case R.id.company:
			Intent k=new Intent("com.example.aptitude_mania_proj.COMPANY_PATTERN");
			startActivity(k);
			break;

		case R.id.allindiaexam:
			Intent l=new Intent("com.example.aptitude_mania_proj.ALL_INDIA_EXAMS");
			startActivity(l);
			break;
		default:
			break;
		}
	}


}

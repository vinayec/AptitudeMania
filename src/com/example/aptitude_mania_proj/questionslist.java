package com.example.aptitude_mania_proj;

import android.app.Activity;
import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class questionslist extends  ListActivity {
	String classes1[]={"Number System ","Age ","Time And Work","Time And Distance","Trains","Simple Interest","Compound Interest","Percentage","Profit And Loss"};
	String classes[]={"Number_System_Qus","Age_Qus","Time_And_Work_Qus","Time_And_Distance_Qus","Trains_Qus","Simple_Interest_Qus","Compound_Interest_Qus","Percentage_Qus","Profit_And_Loss_Qus"};
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setListAdapter(new ArrayAdapter<String>(questionslist.this, android.R.layout.simple_list_item_1, classes1));
	}

	@Override
	protected void onListItemClick(ListView l, View v, int position, long id) {
		// TODO Auto-generated method stub
		super.onListItemClick(l, v, position, id);
		String cheese=classes[position];
		try {
			Class ourclass=Class.forName("com.example.aptitude_mania_proj."+cheese);
			Intent ourintent=new Intent(questionslist.this,ourclass);
			startActivity(ourintent);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

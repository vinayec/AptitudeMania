package com.example.aptitude_mania_proj;

import android.app.Activity;
import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class All_India_Exams extends ListActivity{
	String classes1[]={"CoCubes","eLitmus","IBPS"};
	String classes[]={"Co_Cube","Elitmus","Ibps"};
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setListAdapter(new ArrayAdapter<String>(All_India_Exams.this, android.R.layout.simple_list_item_1, classes1));
	}

	@Override
	protected void onListItemClick(ListView l, View v, int position, long id) {
		// TODO Auto-generated method stub
		super.onListItemClick(l, v, position, id);
		String cheese=classes[position];
		try {
			Class ourclass=Class.forName("com.example.aptitude_mania_proj."+cheese);
			Intent ourintent=new Intent(All_India_Exams.this,ourclass);
			startActivity(ourintent);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}

package com.example.aptitude_mania_proj;

import android.app.Activity;
import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class company_pattern extends  ListActivity {
	String classes1[]={"C-DAC","HONEYWELL","HCL","IOCL","WIPRO","CMC","ORACLE"};
	String classes[]={"C_DAC","HONEYWELL","HCL","IOCL","WIPRO","CMC","ORACLE"};
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setListAdapter(new ArrayAdapter<String>(company_pattern.this, android.R.layout.simple_list_item_1, classes1));
	}

	@Override
	protected void onListItemClick(ListView l, View v, int position, long id) {
		// TODO Auto-generated method stub
		super.onListItemClick(l, v, position, id);
		String cheese=classes[position];
		try {
			Class ourclass=Class.forName("com.example.aptitude_mania_proj."+cheese);
			Intent ourintent=new Intent(company_pattern.this,ourclass);
			startActivity(ourintent);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}

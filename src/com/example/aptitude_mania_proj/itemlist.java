package com.example.aptitude_mania_proj;

import android.app.ListActivity;
import android.content.Intent;
import android.content.Loader.ForceLoadContentObserver;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class itemlist extends ListActivity {
	String classes1[]={"Number System","Age","Time And Work","Profit Loss","Time And Distance","Trains","Simple Interest","Compount Interest","Percentage","Alligation","Chain Rule","Clock","HCF-LCM","Partnership","Stream"};
	String classes[]={"Number_System","Age","Time_And_Work","Profit_Loss","Time_And_Distance","Trains","Simple_Interest","Compount_Interest","Percentage","Alligation","Chain_Rule","Clock","HCF_LCM","Partnership","Stream"};
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setListAdapter(new ArrayAdapter<String>(itemlist.this, android.R.layout.simple_list_item_1, classes1));
	}

	@Override
	protected void onListItemClick(ListView l, View v, int position, long id) {
		// TODO Auto-generated method stub
		super.onListItemClick(l, v, position, id);
		String cheese=classes[position];
		
		try {
			Class ourclass=Class.forName("com.example.aptitude_mania_proj."+cheese);
			Intent ourintent=new Intent(itemlist.this,ourclass);
			startActivity(ourintent);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
}

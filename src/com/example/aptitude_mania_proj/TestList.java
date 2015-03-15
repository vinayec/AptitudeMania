package com.example.aptitude_mania_proj;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class TestList extends ListActivity{
	String classes[]={"TestPaper1","TestPaper2","TestPaper3","TestPaper4"};
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setListAdapter(new ArrayAdapter<String>(TestList.this, android.R.layout.simple_list_item_1, classes));
	}

	@Override
	protected void onListItemClick(ListView l, View v, int position, long id) {
		// TODO Auto-generated method stub
		super.onListItemClick(l, v, position, id);
		String cheese=classes[position];
		
		try {
			Class ourclass=Class.forName("com.example.aptitude_mania_proj."+cheese);
			Intent ourintent=new Intent(TestList.this,ourclass);
			startActivity(ourintent);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

}
}
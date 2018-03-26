package com.example.amit.easypronounce;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageButton;

public class CONTENT extends Activity {

	ImageButton btnContent;
	
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.content);
		
		addButtonListener();
		
		
	}

	private void addButtonListener() {
		// TODO Auto-generated method stub
		
		btnContent = (ImageButton) findViewById (R.id.contentBack);
		btnContent.setOnClickListener(new OnClickListener(){

			public void onClick(View v) {
				// TODO Auto-generated method stub
				
				Intent x = new Intent(getApplicationContext(),EasyPronounce.class);
				startActivity(x);

			}

		});

	}

}

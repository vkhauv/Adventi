package com.example.tester;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class NewActivity extends Activity {

	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
	    super.onCreate(savedInstanceState);
	    setContentView(R.layout.page1);
	    
	    Button button = (Button) findViewById(R.id.Button03);
		button.setOnClickListener (new View.OnClickListener(){
		    public void onClick(View v) {
		    	setContentView(R.layout.button03);
		   }
		}); 
	    
		Button button02 = (Button) findViewById(R.id.Button02);
		button02.setOnClickListener (new View.OnClickListener(){
		    public void onClick(View v) {
		    	setContentView(R.layout.button02);
		   }
		}); 
		
		Button button01 = (Button) findViewById(R.id.Button01);
		button01.setOnClickListener (new View.OnClickListener(){
		    public void onClick(View v) {
		    	setContentView(R.layout.button01);
		   }
		}); 
		
		Button button1 = (Button) findViewById(R.id.button1);
		button1.setOnClickListener (new View.OnClickListener(){
		    public void onClick(View v) {
		    	setContentView(R.layout.button1);
		   }
		}); 
	    
	    
	    
	}

}

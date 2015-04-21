package com.example.nasiou_dalla_quiz;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.widget.Button;
import android.widget.Toast;
import android.content.Intent;
import android.view.View;
import android.view.MenuItem;


public class MyMainScreen extends ActionBarActivity{
	 private Button button1;
	 private Button button2;
	 private Button button3;
	 private Button button4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addListenerOnButton();
        
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
        	Toast.makeText(MyMainScreen.this, "Αυτή την στιγμή δέν υποστηρίζονται ρυθμίσεις!!", Toast.LENGTH_LONG).show();
                	
            return true;
        }
    	if (id == R.id.about_settings) {
    Toast.makeText(MyMainScreen.this, "Η εφαρμογή που χρησιμοποιείται είναι προιόν πτυχιακής " +
    		"εργασίας. Οι δημιουργοί είναι : Νάσιου Όλγα & Βασιλική Δάλλα", Toast.LENGTH_LONG).show();
        	
            return true;
        }
        return super.onOptionsItemSelected(item);
    
}
    
    public void addListenerOnButton()   {
    	        //Select a specific button to bundle it with the action you want
    	        button1 = (Button) findViewById(R.id.button1);
    	        button2 = (Button) findViewById(R.id.button2);
    	        button3 = (Button) findViewById(R.id.button3);
    	        button4 = (Button) findViewById(R.id.button4);
    	        
    	   findViewById(R.id.button1).setOnClickListener(new View.OnClickListener() {
    		   @Override
    		   public void onClick(View view) {
    			   Intent intent = new Intent(MyMainScreen.this, Activity_Mathematics.class);
					Bundle b = new Bundle();
					b.putInt("category", 1); //Your score
					intent.putExtras(b); //Put your score to your next Intent
					startActivity(intent);
    		  }
    		});
    	   
    	   findViewById(R.id.button2).setOnClickListener(new View.OnClickListener() {
    		   @Override
    		   public void onClick(View view) {
    			   Intent intent = new Intent(MyMainScreen.this, Activity_History.class);
					Bundle b = new Bundle();
					b.putInt("category", 2); //Your score
					intent.putExtras(b); //Put your score to your next Intent
					startActivity(intent);
    		  
    		  }
    		});
    	   
    	   findViewById(R.id.button3).setOnClickListener(new View.OnClickListener() {
    		   @Override
    		   public void onClick(View view) {
    			   Intent intent = new Intent(MyMainScreen.this, Activity_Geo.class);
					Bundle b = new Bundle();
					b.putInt("category", 3); //Your score
					intent.putExtras(b); //Put your score to your next Intent
					startActivity(intent);
    		  
    		  }
    		});
    	   
    	   findViewById(R.id.button4).setOnClickListener(new View.OnClickListener() {
    		   @Override
    		   public void onClick(View view) {
    			   Intent intent = new Intent(MyMainScreen.this, Activity_Problems.class);
					Bundle b = new Bundle();
					b.putInt("category", 4); //Your score
					intent.putExtras(b); //Put your score to your next Intent
					startActivity(intent);
    		  
    		  }
    		});
    	       
    }
}

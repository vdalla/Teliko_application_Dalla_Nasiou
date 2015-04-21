package com.example.nasiou_dalla_quiz;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class Activity_Material extends Activity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_material);
        Bundle b = getIntent().getExtras();
		int category= b.getInt("category");
		
		switch (category)
		{
		case 1:Toast.makeText(Activity_Material.this, "Επιλέξατε τα Μαθηματικά..Nα είστε προσεκτικοί με τις απαντήσεις σας!!", Toast.LENGTH_LONG).show(); break;
		case 2:Toast.makeText(Activity_Material.this, "Επιλέξατε την Ιστορία..Nα είστε προσεκτικοί με τις απαντήσεις σας!!"+category+"xaxa", Toast.LENGTH_LONG).show(); break;
	    case 3:Toast.makeText(Activity_Material.this, "Επιλέξατε την Γεωγραφία..Nα είστε προσεκτικοί με τις απαντήσεις σας!!"+category+"xaxa", Toast.LENGTH_LONG).show(); break;
		case 4:Toast.makeText(Activity_Material.this, "Επιλέξατε τα Προβλήματα..Nα είστε προσεκτικοί με τις απαντήσεις σας!!"+category+"xaxa", Toast.LENGTH_LONG).show(); break;
		// case 5:t.setText("Άριστα !!!");
		// break;
		}
        
       
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
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
     
   }

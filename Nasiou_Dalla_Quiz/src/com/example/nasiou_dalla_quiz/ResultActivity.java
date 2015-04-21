package com.example.nasiou_dalla_quiz;


import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.widget.RatingBar;
import android.widget.TextView;


public class ResultActivity extends Activity {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_result);
		//get rating bar object
		RatingBar bar=(RatingBar)findViewById(R.id.ratingBar1); 
		bar.setNumStars(5);
		bar.setStepSize(1.0f);
		//get text view
		TextView t=(TextView)findViewById(R.id.textResult);
		//get score
		Bundle b = getIntent().getExtras();
		int score= b.getInt("score");
		//display score
		bar.setRating(score);
		switch (score)
		{
		case 0:t.setText("Καμμία δεν απάντησες σωστά!!! Χρειάζεσαι πολύ διάβασμα!!");
		case 1:
		case 2: t.setText("Όχι και πολύ καλά !");
		break;
		case 3:
		case 4:t.setText("Τα πήγες περίφημα");
		break;
		case 5:t.setText("Άριστα !!!");
		break;
		}
	}
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.layout.activity_result, menu);
		return true;
	}
}

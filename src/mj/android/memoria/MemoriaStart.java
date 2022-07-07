package mj.android.memoria;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;

public class MemoriaStart extends Activity   {
	
	Button mStart;
	Button mSettings;
	Button mScore;
	Button mExit;
	
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.start);
        
        mStart = (Button)findViewById(R.id.butStart);
        mSettings = (Button)findViewById(R.id.butSettings);
        mScore = (Button)findViewById(R.id.butScore);
        mExit = (Button)findViewById(R.id.butExit);
        
        mStart.setOnClickListener (new OnClickListener() {
            @Override
            public void onClick(View v) {
            	startGame();
            }
         });
        
        mSettings.setOnClickListener (new OnClickListener() {
            @Override
            public void onClick(View v) {
            	Toast.makeText (getApplicationContext(), "Settings", Toast.LENGTH_SHORT).show();
            }
         });
        
        mScore.setOnClickListener (new OnClickListener() {
            @Override
            public void onClick(View v) {
            	Toast.makeText (getApplicationContext(), "Score", Toast.LENGTH_SHORT).show();
            }
         });
        
        mExit.setOnClickListener (new OnClickListener() {
            @Override
            public void onClick(View v) {
            	finish();
            }
         });
        
    }
    
    private void startGame () {
    	Intent i = new Intent(this, MemoriaActivity.class);
    	startActivity (i);
    }
}
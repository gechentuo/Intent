package com.example.intent_tranning;

import android.net.Uri;
import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends Activity {

	//constant to determine which sub-activity returns 
	private static  final int REQUEST_CODE = 10;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	public void transferData(View view){
		EditText text =  (EditText)findViewById(R.id.uri);
		String value = text.getText().toString();
		Intent intent = new Intent(this,ResultActivity.class);
		intent.putExtra("uri", value);
		//startActivityForResult(intent, REQUEST_CODE);
		startActivity(intent);
	}
	
	public void openBrowser(View view){
		EditText text = (EditText)findViewById(R.id.uri);
		String url = text.getText().toString();
		Intent intent = new Intent(Intent.ACTION_VIEW,Uri.parse(url));
		startActivity(intent);
	}
}

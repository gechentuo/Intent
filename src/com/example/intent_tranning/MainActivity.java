package com.example.intent_tranning;

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

	public void onClick(View view){
		EditText text =  (EditText)findViewById(R.id.inputforintent);
		String value = text.getText().toString();
		Intent intent = new Intent(this,ResultActivity.class);
		intent.putExtra("text", "test");
		//intent.putExtra("int", 5);
		//intent.putExtra("array",new int[5]{1,2,3,4,5});
		startActivityForResult(intent, REQUEST_CODE);
	}
	
	@Override
	protected void onActivityResult(int requestCode, int resultCode, Intent data) { 
		if(resultCode==RESULT_OK && requestCode==REQUEST_CODE){
			if(data.hasExtra("returnkey")){
				String result = data.getExtras().getString("returnkey");
				if(result!=null && result.length()>0){
					Toast.makeText(this, result, Toast.LENGTH_SHORT).show();
				}
			}
		}
		super.onActivityResult(requestCode, resultCode, data);
	}
}

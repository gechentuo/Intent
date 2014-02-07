package com.example.intent_tranning;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class ResultActivity extends Activity {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_result);
		Bundle bundle = getIntent().getExtras();
		String extraText = bundle.getString("text");
		TextView textview = (TextView) findViewById(R.id.displayintentextra);
		textview.setText(extraText);
	}

	@Override
	public void finish() {
		Intent intent = new Intent();
		EditText editText = (EditText)findViewById(R.id.returnValue);
		String value = editText.getText().toString();
		intent.putExtra("returnkey", value);
		setResult(RESULT_OK,intent);
		super.finish();
	}
}

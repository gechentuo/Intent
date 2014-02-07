package com.example.intent_tranning;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.EditText;
import android.widget.TextView;

public class ResultActivity extends Activity {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_result);
		Bundle bundle = getIntent().getExtras();
		String uri = bundle.getString("uri");
		WebView webview = (WebView)findViewById(R.id.webview);
		webview.loadUrl(uri);
	}

	 
}

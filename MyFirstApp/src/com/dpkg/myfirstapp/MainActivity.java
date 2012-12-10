package com.dpkg.myfirstapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends Activity {

	public static final String EXTRA_MESSAGE = "com.example.myfirstapp.MESSAGE";

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}

	//	@Override
	//	public boolean onCreateOptionsMenu(Menu menu) {
	//		// Inflate the menu; this adds items to the action bar if it is present.
	//		getMenuInflater().inflate(R.menu.activity_main, menu);
	//		return true;
	//	}

	/** Called when the user clicks the Send button */
	public void sendMessage(View view) {
		// Do something in response to button

		// create a new intent to start new activity in response to button press
		Intent sendBtnIntent = new Intent(this, DisplayMessageActivity.class);

		// get data from current activity
		String message = ((EditText) findViewById(R.id.edit_message)).getText().toString();

		// add date to intent for sending to next activity
		sendBtnIntent.putExtra(EXTRA_MESSAGE, message);

		// start the other activity passing the intent with loaded data
		startActivity(sendBtnIntent);
	}
}

package com.rajput.search;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle icicle) {
		super.onCreate(icicle);
		setContentView(R.layout.activity_main);

		ArrayAdapter adapter = new ArrayAdapter(this,
				android.R.layout.simple_dropdown_item_1line, COUNTRIES);
		AutoCompleteTextView textView = (AutoCompleteTextView) findViewById(R.id.autoCompleteTextView);
		textView.setAdapter(adapter);
	}

	private static final String[] COUNTRIES = new String[] { "Belgium",
			"France", "Italy", "Germany", "Spain", "989121212", "98998989" };
}

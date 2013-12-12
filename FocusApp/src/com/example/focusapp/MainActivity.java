package com.example.focusapp;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		Button btnEggs = (Button)findViewById(R.id.Eggs);
		Button btnBacon = (Button)findViewById(R.id.Bacon);
		Button btnSausage = (Button)findViewById(R.id.Sausage);
		Button btnToast = (Button)findViewById(R.id.Toast);
		Button btnBLT = (Button)findViewById(R.id.BLT);
		Button btnClubSandwich = (Button)findViewById(R.id.ClubSandwich);
		Button btnFries = (Button)findViewById(R.id.FrenchFries);
		Button btnMysteryNoodles = (Button)findViewById(R.id.MysteryNoodles);
		/*btnEggs.setOnClickListener(new ButtonClick());
		btnBacon.setOnClickListener(new ButtonClick());
		btnSausage.setOnClickListener(new ButtonClick());
		btnToast.setOnClickListener(new ButtonClick());
		btnBLT.setOnClickListener(new ButtonClick());
		btnClubSandwich.setOnClickListener(new ButtonClick());
		btnFries.setOnClickListener(new ButtonClick());
		btnMysteryNoodles.setOnClickListener(new ButtonClick());*/
	}
	public void ButtonClick(View clickedButton){
		Button b1=(Button) clickedButton;
		
	}
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}

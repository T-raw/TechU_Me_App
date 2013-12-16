package com.example.focusapp;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends Activity {
	public double totalCost=0;
	@Override
	//Creating Variables and Listeners for buttons
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
		btnEggs.setOnClickListener(new ButtonClick());
		btnBacon.setOnClickListener(new ButtonClick());
		btnSausage.setOnClickListener(new ButtonClick());
		btnToast.setOnClickListener(new ButtonClick());
		btnBLT.setOnClickListener(new ButtonClick());
		btnClubSandwich.setOnClickListener(new ButtonClick());
		btnFries.setOnClickListener(new ButtonClick());
		btnMysteryNoodles.setOnClickListener(new ButtonClick());
		Button btnWings = (Button)findViewById(R.id.Wings);
		btnWings.setOnClickListener(new ButtonClick());
		Button btnHamburger = (Button)findViewById(R.id.Hamburger);
		btnHamburger.setOnClickListener(new ButtonClick());
		Button btnCake = (Button)findViewById(R.id.Cake);
		btnCake.setOnClickListener(new ButtonClick());
		Button btnIceCream = (Button)findViewById(R.id.IceCream);
		btnIceCream.setOnClickListener(new ButtonClick());
		Button btnBrownie = (Button)findViewById(R.id.Brownie);
		btnBrownie.setOnClickListener(new ButtonClick());
		Button btnNachos = (Button)findViewById(R.id.Nachos);
		btnNachos.setOnClickListener(new ButtonClick());
		Button btnShrimp = (Button)findViewById(R.id.Shrimp);
		btnShrimp.setOnClickListener(new ButtonClick());
	}
	
	
	public class ButtonClick implements OnClickListener{

		@Override
		//Creating values for the items to be added to the total
		public void onClick(View v) {
			// TODO Auto-generated method stub
			Button clicked=(Button) v;
			if (clicked.getId()==R.id.Eggs){
				totalCost+=2.5;}
				else if (clicked.getId()==R.id.Bacon){
					totalCost+=2.5;}
				else if (clicked.getId()==R.id.BLT){
					totalCost+=2.5;}
				else if (clicked.getId()==R.id.Sausage){
					totalCost+=2.5;}
				else if (clicked.getId()==R.id.Toast){
					totalCost+=2.5;}
				else if (clicked.getId()==R.id.ClubSandwich){
					totalCost+=2.5;}
				else if (clicked.getId()==R.id.FrenchFries){
					totalCost+=2.5;}
				else if (clicked.getId()==R.id.MysteryNoodles){
					totalCost+=2.5;}
				else if (clicked.getId()==R.id.Wings){
					totalCost+=2.5;}
				else if (clicked.getId()==R.id.Hamburger){
					totalCost+=2.5;}
				else if (clicked.getId()==R.id.Cake){
					totalCost+=2.5;}
				else if (clicked.getId()==R.id.IceCream){
					totalCost+=2.5;}
				else if (clicked.getId()==R.id.Brownie){
					totalCost+=2.5;}
				else if (clicked.getId()==R.id.Nachos){
					totalCost+=2.5;}
				else if (clicked.getId()==R.id.Shrimp){
					totalCost+=2.5;}
				System.out.println(totalCost);
			}
			
		}
		
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}

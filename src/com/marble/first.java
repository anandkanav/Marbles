package com.marble;




import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class first extends Activity implements OnClickListener {

	Button b1,b2;
	 public void onCreate(Bundle savedInstanceState) {
		 super.onCreate(savedInstanceState);
		 setContentView(R.layout.main);
		 b1=(Button)findViewById(R.id.button2);
		 b2=(Button)findViewById(R.id.button1);
		 b1.setOnClickListener(this);
		 b2.setOnClickListener(this);
	 }
	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub

		 b1=(Button)findViewById(R.id.button2);
		 b2=(Button)findViewById(R.id.button1);
		 b1.setOnClickListener(this);
		 b2.setOnClickListener(this);
		 
			 if(v.getId()==R.id.button2)
				{
				Intent intent = new Intent(getApplicationContext(),MarbelsActivity.class);
				startActivity(intent);
				
				}
		 
			 if(v.getId()==R.id.button1)
				{
				Intent intent = new Intent(getApplicationContext(),instruction.class);
				startActivity(intent);
				
				}
	
	}
		
	}



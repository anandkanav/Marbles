package com.marble;



import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class instruction extends Activity implements OnClickListener{

	

		Button b1;
		 public void onCreate(Bundle savedInstanceState) {
			 super.onCreate(savedInstanceState);
			 setContentView(R.layout.second);
			 b1=(Button)findViewById(R.id.button1);
			 b1.setOnClickListener(this);
		

		 }

	


	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		if(v.getId()==R.id.button1)
		{

			Intent intent = new Intent(getApplicationContext(),first.class);
			startActivity(intent);
		}
		
	}
	}
	
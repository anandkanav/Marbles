package com.marble;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;

public class MarbelsActivity extends Activity implements OnClickListener {
    /** Called when the activity is first created. */
    
    Button b[] = new Button[50]; 
    Button b1,b2;
    int count=0;
    int column=0;
    int row=0;
    int marble=32;
    int cnt[] = new int[50];
    int previd;
    AlertDialog alertDialog=null;
    //LinearLayout l1;
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.first);
        b[0]=(Button)findViewById(R.id.bt1);
        b[1]=(Button)findViewById(R.id.bt2);
        b[2]=(Button)findViewById(R.id.bt3);
        b[3]=(Button)findViewById(R.id.bt4);
        b[4]=(Button)findViewById(R.id.bt5);
        b[5]=(Button)findViewById(R.id.bt6);
        b[6]=(Button)findViewById(R.id.bt7);
        b[7]=(Button)findViewById(R.id.bt8);
        b[8]=(Button)findViewById(R.id.bt9);
        b[9]=(Button)findViewById(R.id.bt10);
        b[10]=(Button)findViewById(R.id.bt11);
        b[11]=(Button)findViewById(R.id.bt12);
        b[12]=(Button)findViewById(R.id.bt13);
        b[13]=(Button)findViewById(R.id.bt14);
        b[14]=(Button)findViewById(R.id.bt15);
        b[15]=(Button)findViewById(R.id.bt16);
        b[16]=(Button)findViewById(R.id.bt17);
        b[17]=(Button)findViewById(R.id.bt18);
        b[18]=(Button)findViewById(R.id.bt19);
        b[19]=(Button)findViewById(R.id.bt20);
        b[20]=(Button)findViewById(R.id.bt21);
        b[21]=(Button)findViewById(R.id.bt22);
        b[22]=(Button)findViewById(R.id.bt23);
        b[23]=(Button)findViewById(R.id.bt24);
        b[24]=(Button)findViewById(R.id.bt25);
        b[25]=(Button)findViewById(R.id.bt26);
        b[26]=(Button)findViewById(R.id.bt27);
        b[27]=(Button)findViewById(R.id.bt28);
        b[28]=(Button)findViewById(R.id.bt29);
        b[29]=(Button)findViewById(R.id.bt30);
        b[30]=(Button)findViewById(R.id.bt31);
        b[31]=(Button)findViewById(R.id.bt32);
        b[32]=(Button)findViewById(R.id.bt33);
        b[33]=(Button)findViewById(R.id.bt34);
        b[34]=(Button)findViewById(R.id.bt35);
        b[35]=(Button)findViewById(R.id.bt36);
        b[36]=(Button)findViewById(R.id.bt37);
        b[37]=(Button)findViewById(R.id.bt38);
        b[38]=(Button)findViewById(R.id.bt39);
        b[39]=(Button)findViewById(R.id.bt40);
        b[40]=(Button)findViewById(R.id.bt41);
        b[41]=(Button)findViewById(R.id.bt42);
        b[42]=(Button)findViewById(R.id.bt43);
        b[43]=(Button)findViewById(R.id.bt44);
        b[44]=(Button)findViewById(R.id.bt45);
        b[45]=(Button)findViewById(R.id.bt46);
        b[46]=(Button)findViewById(R.id.bt47);
        b[47]=(Button)findViewById(R.id.bt48);
        b[48]=(Button)findViewById(R.id.bt49);
        b1=(Button)findViewById(R.id.button1);
        b2=(Button)findViewById(R.id.button2);
       // l1=(LinearLayout)findViewById(R.id.ll);
      //  l1.setOnClickListener(this);
        for(int j=0;j<49;j++)
        	b[j].setOnClickListener(this);
  
     b1.setOnClickListener(this);
        
        
    }
    protected Dialog display(String s) {
    	
    	// TODO Auto-generated method stub
    	AlertDialog.Builder builder=new AlertDialog.Builder(this);
    	builder.setMessage("GAME OVER.\n\t"+s);
    	alertDialog=builder.create();
        alertDialog.show();
        return alertDialog;
    	//return super.onCreateDialog(id);
    }
    
	@Override
	public void onClick(View arg0) {
		// TODO Auto-generated method stub
		//Toast.makeText(getApplicationContext(), "wrong move", Toast.LENGTH_LONG).show();
		int check= 0;
		String s1="GAME OVER";
		int j1=0;
		
		if(arg0.getId()==R.id.button1)
		{

			Intent intent = new Intent(getApplicationContext(),MarbelsActivity.class);
			startActivity(intent);
		}
		
		b[0]=(Button)findViewById(R.id.bt1);
        b[1]=(Button)findViewById(R.id.bt2);
        b[2]=(Button)findViewById(R.id.bt3);
        b[3]=(Button)findViewById(R.id.bt4);
        b[4]=(Button)findViewById(R.id.bt5);
        b[5]=(Button)findViewById(R.id.bt6);
        b[6]=(Button)findViewById(R.id.bt7);
        b[7]=(Button)findViewById(R.id.bt8);
        b[8]=(Button)findViewById(R.id.bt9);
        b[9]=(Button)findViewById(R.id.bt10);
        b[10]=(Button)findViewById(R.id.bt11);
        b[11]=(Button)findViewById(R.id.bt12);
        b[12]=(Button)findViewById(R.id.bt13);
        b[13]=(Button)findViewById(R.id.bt14);
        b[14]=(Button)findViewById(R.id.bt15);
        b[15]=(Button)findViewById(R.id.bt16);
        b[16]=(Button)findViewById(R.id.bt17);
        b[17]=(Button)findViewById(R.id.bt18);
        b[18]=(Button)findViewById(R.id.bt19);
        b[19]=(Button)findViewById(R.id.bt20);
        b[20]=(Button)findViewById(R.id.bt21);
        b[21]=(Button)findViewById(R.id.bt22);
        b[22]=(Button)findViewById(R.id.bt23);
        b[23]=(Button)findViewById(R.id.bt24);
        b[24]=(Button)findViewById(R.id.bt25);
        b[25]=(Button)findViewById(R.id.bt26);
        b[26]=(Button)findViewById(R.id.bt27);
        b[27]=(Button)findViewById(R.id.bt28);
        b[28]=(Button)findViewById(R.id.bt29);
        b[29]=(Button)findViewById(R.id.bt30);
        b[30]=(Button)findViewById(R.id.bt31);
        b[31]=(Button)findViewById(R.id.bt32);
        b[32]=(Button)findViewById(R.id.bt33);
        b[33]=(Button)findViewById(R.id.bt34);
        b[34]=(Button)findViewById(R.id.bt35);
        b[35]=(Button)findViewById(R.id.bt36);
        b[36]=(Button)findViewById(R.id.bt37);
        b[37]=(Button)findViewById(R.id.bt38);
        b[38]=(Button)findViewById(R.id.bt39);
        b[39]=(Button)findViewById(R.id.bt40);
        b[40]=(Button)findViewById(R.id.bt41);
        b[41]=(Button)findViewById(R.id.bt42);
        b[42]=(Button)findViewById(R.id.bt43);
        b[43]=(Button)findViewById(R.id.bt44);
        b[44]=(Button)findViewById(R.id.bt45);
        b[45]=(Button)findViewById(R.id.bt46);
        b[46]=(Button)findViewById(R.id.bt47);
        b[47]=(Button)findViewById(R.id.bt48);
        b[48]=(Button)findViewById(R.id.bt49);
        for(int j=0;j<49;j++)
        	b[j].setOnClickListener(this);
    	b[0].setBackgroundDrawable(getResources().getDrawable(R.drawable.sample2));
    	
		
        if( count==0)
		{
			if(arg0.getVisibility() == View.INVISIBLE)
			Toast.makeText(getApplicationContext(), "wrong move", Toast.LENGTH_LONG).show();
			
			else 
		
			{
				
			for(int i=0;i<49;i++)
			{
				
				if(arg0.getId()==b[i].getId())
				{
					column= i%7;
					row= i/7;
					if( row == 2 && (column == 0 || column == 1  ) && (b[i+14].getVisibility() == View.INVISIBLE || b[i+2].getVisibility() == View.INVISIBLE ))
					{
						previd=i;
						
						if(b[i+14].getVisibility() == View.INVISIBLE && b[i+7].getVisibility()==View.VISIBLE)
						{
							count=1;
						b[i+14].setBackgroundDrawable(getResources().getDrawable(R.drawable.sample2));
						b[i+14].setVisibility(View.VISIBLE);
						cnt[i+14]=1;
						}
						if(b[i+2].getVisibility() == View.INVISIBLE && b[i+1].getVisibility()==View.VISIBLE)
						{count=1;
						b[i+2].setBackgroundDrawable(getResources().getDrawable(R.drawable.sample2));
						b[i+2].setVisibility(View.VISIBLE);
						cnt[i+2]=1;
						}
						b[i].setBackgroundDrawable(getResources().getDrawable(R.drawable.sample1));
					}
					if( row == 4 && (column == 0 || column == 1  ) && (b[i-14].getVisibility() == View.INVISIBLE || b[i+2].getVisibility() == View.INVISIBLE ))
					{
						previd=i;
					
						if(b[i-14].getVisibility() == View.INVISIBLE && b[i-7].getVisibility()==View.VISIBLE)
						{
							count=1;
						b[i-14].setBackgroundDrawable(getResources().getDrawable(R.drawable.sample2));
						b[i-14].setVisibility(View.VISIBLE);
						cnt[i-14]=1;
						}
						if(b[i+2].getVisibility() == View.INVISIBLE && b[i+1].getVisibility()==View.VISIBLE)
						{b[i+2].setBackgroundDrawable(getResources().getDrawable(R.drawable.sample2));
						b[i+2].setVisibility(View.VISIBLE);
						cnt[i+2]=1;
						count=1;}
						b[i].setBackgroundDrawable(getResources().getDrawable(R.drawable.sample1));
					}
					if( row == 2 && (column == 5 || column == 6  ) && (b[i+14].getVisibility() == View.INVISIBLE || b[i-2].getVisibility() == View.INVISIBLE ))
					{
						previd=i;
						if(b[i+14].getVisibility() == View.INVISIBLE && b[i+7].getVisibility()==View.VISIBLE)
						{	count=1;
							cnt[i+14]=1;	
						b[i+14].setBackgroundDrawable(getResources().getDrawable(R.drawable.sample2));
						b[i+14].setVisibility(View.VISIBLE);
						}
						if(b[i-2].getVisibility() == View.INVISIBLE && b[i-1].getVisibility()==View.VISIBLE)
						{			b[i-2].setBackgroundDrawable(getResources().getDrawable(R.drawable.sample2));
						cnt[i-2]=1;
						count=1;
						b[i-2].setVisibility(View.VISIBLE);}
			
						b[i].setBackgroundDrawable(getResources().getDrawable(R.drawable.sample1));
			
					}
					if( (row == 3 ) && (column == 0 || column ==1   ) && ( b[i+2].getVisibility() == View.INVISIBLE ))
					{
		     				
		     				previd=i;
		     				if(b[i+2].getVisibility() == View.INVISIBLE && b[i+1].getVisibility()==View.VISIBLE)
		     				{
		     					count=1;
		     					cnt[i+2]=1;
		     				b[i+2].setBackgroundDrawable(getResources().getDrawable(R.drawable.sample2));
							b[i+2].setVisibility(View.VISIBLE);
							}//Toast.makeText(getApplicationContext(), "wrong move", Toast.LENGTH_LONG).show();
							b[i].setBackgroundDrawable(getResources().getDrawable(R.drawable.sample1));
					
					}
					if( (row == 4 ) && (column == 0 || column ==1   ) && ( b[i+2].getVisibility() == View.INVISIBLE || b[i-14].getVisibility() == View.INVISIBLE ))
					{
		     				previd=i;
		     				if(b[i+2].getVisibility() == View.INVISIBLE && b[i+1].getVisibility()==View.VISIBLE)
		     				{
		     					cnt[i+2]=1;
		     					b[i+2].setBackgroundDrawable(getResources().getDrawable(R.drawable.sample2));
							b[i+2].setVisibility(View.VISIBLE);
		     				}
							if(b[i-14].getVisibility() == View.INVISIBLE && b[i-7].getVisibility()==View.VISIBLE)
							{b[i-14].setBackgroundDrawable(getResources().getDrawable(R.drawable.sample2));
							b[i-14].setVisibility(View.VISIBLE);
							cnt[i-14]=1;
							count=1;
							}
							//Toast.makeText(getApplicationContext(), "wrong move", Toast.LENGTH_LONG).show();
							b[i].setBackgroundDrawable(getResources().getDrawable(R.drawable.sample1));
					
					}
					if( (row == 3 ) && (column == 5 || column == 6  ) && (b[i-2].getVisibility() == View.INVISIBLE ))
					{
						previd=i;
						//Toast.makeText(getApplicationContext(), "kakaka", Toast.LENGTH_LONG).show();
						if(b[i-2].getVisibility() == View.INVISIBLE && b[i-1].getVisibility()==View.VISIBLE)
						{count=1;
							cnt[i-2]=1;
							b[i-2].setBackgroundDrawable(getResources().getDrawable(R.drawable.sample2));
						b[i-2].setVisibility(View.VISIBLE);
						}
						b[i].setBackgroundDrawable(getResources().getDrawable(R.drawable.sample1));
					}
					if( (row == 4 ) && (column == 5 || column == 6   ) && ( b[i-2].getVisibility() == View.INVISIBLE || b[i-14].getVisibility() == View.INVISIBLE ))
					{
		     				previd=i;
		     				if(b[i-14].getVisibility() == View.INVISIBLE && b[i-7].getVisibility()==View.VISIBLE)
		     				{count=1;
		     				cnt[i-14]=1;
		     				b[i-14].setBackgroundDrawable(getResources().getDrawable(R.drawable.sample2));
							b[i-14].setVisibility(View.VISIBLE);
		     				}
		     				if(b[i-2].getVisibility() == View.INVISIBLE && b[i-1].getVisibility()==View.VISIBLE)
		     				{
		     					count=1;
		     					cnt[i-2]=1;
		     				b[i-2].setBackgroundDrawable(getResources().getDrawable(R.drawable.sample2));
							b[i-2].setVisibility(View.VISIBLE);
		     				}
							b[i].setBackgroundDrawable(getResources().getDrawable(R.drawable.sample1));
					
					}
					if( column == 2 && (row == 0 || row == 1  ) && (b[i+14].getVisibility() == View.INVISIBLE || b[i+2].getVisibility() == View.INVISIBLE ))
					{
						previd=i;
				
						if(b[i+14].getVisibility() == View.INVISIBLE && b[i+7].getVisibility()==View.VISIBLE)
						{
							count=1;
							cnt[i+14]=1;
						b[i+14].setBackgroundDrawable(getResources().getDrawable(R.drawable.sample2));
						b[i+14].setVisibility(View.VISIBLE);
						}
						if(b[i+2].getVisibility() == View.INVISIBLE && b[i+1].getVisibility()==View.VISIBLE)
						{count=1;
							cnt[i+2]=1;
						b[i+2].setBackgroundDrawable(getResources().getDrawable(R.drawable.sample2));
						
						b[i+2].setVisibility(View.VISIBLE);
						}
						b[i].setBackgroundDrawable(getResources().getDrawable(R.drawable.sample1));
						
					}
					if( column == 4 && (row == 0 || row == 1  ) && (b[i+14].getVisibility() == View.INVISIBLE || b[i-2].getVisibility() == View.INVISIBLE ))
					{
						if(b[i+14].getVisibility() == View.INVISIBLE && b[i+7].getVisibility()==View.VISIBLE)
						{count=1;
							cnt[i+14]=1;
							b[i+14].setBackgroundDrawable(getResources().getDrawable(R.drawable.sample2));
						b[i+14].setVisibility(View.VISIBLE);
						}
						if(b[i-2].getVisibility() == View.INVISIBLE && b[i-1].getVisibility()==View.VISIBLE)
						{count=1;
							cnt[i-2]=1;
						b[i-2].setBackgroundDrawable(getResources().getDrawable(R.drawable.sample2));
						b[i-2].setVisibility(View.VISIBLE);
						}
						previd=i;
						b[i].setBackgroundDrawable(getResources().getDrawable(R.drawable.sample1));
						
					}
					if( column == 2 && (row == 5 || row == 6  ) && (b[i-14].getVisibility() == View.INVISIBLE || b[i+2].getVisibility() == View.INVISIBLE ))
					{
						previd=i;
						
						if(b[i-14].getVisibility() == View.INVISIBLE && b[i-7].getVisibility()==View.VISIBLE)
						{count=1;
							cnt[i-14]=1;
							
						b[i-14].setBackgroundDrawable(getResources().getDrawable(R.drawable.sample2));
						b[i-14].setVisibility(View.VISIBLE);
						}
						if(b[i+2].getVisibility() == View.INVISIBLE && b[i+1].getVisibility()==View.VISIBLE)
						{cnt[i+2]=1;
						count=1;
						b[i+2].setBackgroundDrawable(getResources().getDrawable(R.drawable.sample2));
						b[i+2].setVisibility(View.VISIBLE);
					}
						b[i].setBackgroundDrawable(getResources().getDrawable(R.drawable.sample1));
					}
					if( column == 3  && (row == 0 || row ==1   ) && ( b[i+14].getVisibility() == View.INVISIBLE ))
					{
						previd=i;
						if(b[i+14].getVisibility() == View.INVISIBLE && b[i+7].getVisibility()==View.VISIBLE)
						{	count=1;
							cnt[i+14]=1;
							b[i+14].setBackgroundDrawable(getResources().getDrawable(R.drawable.sample2));
						b[i+14].setVisibility(View.VISIBLE);
						}
						b[i].setBackgroundDrawable(getResources().getDrawable(R.drawable.sample1));
					}
					if( column == 4  && (row == 0 || row == 1) && ( b[i+14].getVisibility() == View.INVISIBLE || b[i-2].getVisibility() == View.INVISIBLE ))
					{
						previd=i;
						if(b[i+14].getVisibility() == View.INVISIBLE && b[i+7].getVisibility()==View.VISIBLE)
						{	count=1;
							cnt[i+14]=1;	
						b[i+14].setBackgroundDrawable(getResources().getDrawable(R.drawable.sample2));
						b[i+14].setVisibility(View.VISIBLE);
						}
						if(b[i-2].getVisibility() == View.INVISIBLE && b[i-1].getVisibility()==View.VISIBLE)
						{count=1;
							cnt[i-2]=1;
						b[i-2].setBackgroundDrawable(getResources().getDrawable(R.drawable.sample2));
						b[i-2].setVisibility(View.VISIBLE);
						}
						b[i].setBackgroundDrawable(getResources().getDrawable(R.drawable.sample1));
					}
			
					if(( (column == 3 ) && (row == 5 || row == 6  )) && (b[i-14].getVisibility() == View.INVISIBLE ))
					{
						previd=i;
					//	Toast.makeText(getApplicationContext(), "kakaka", Toast.LENGTH_LONG).show();
						
						if(b[i-14].getVisibility() == View.INVISIBLE && b[i-7].getVisibility()==View.VISIBLE)
						{count=1;
							cnt[i-14]=1;
							b[i-14].setBackgroundDrawable(getResources().getDrawable(R.drawable.sample2));
						b[i-14].setVisibility(View.VISIBLE);
						}
						b[i].setBackgroundDrawable(getResources().getDrawable(R.drawable.sample1));
					}
					if( column == 4  && (row == 5 || row == 6) && ( b[i-14].getVisibility() == View.INVISIBLE || b[i-2].getVisibility() == View.INVISIBLE ))
					{
						previd=i;
						//Toast.makeText(getApplicationContext(), "kakaka", Toast.LENGTH_LONG).show();
						
						if(b[i-14].getVisibility() == View.INVISIBLE && b[i-7].getVisibility()==View.VISIBLE)
						{	count=1;
							cnt[i-14]=1;
						b[i-14].setBackgroundDrawable(getResources().getDrawable(R.drawable.sample2));
						b[i-14].setVisibility(View.VISIBLE);
						}
						if(b[i-2].getVisibility() == View.INVISIBLE && b[i-1].getVisibility()==View.VISIBLE)
						{cnt[i-2]=1;
							b[i-2].setBackgroundDrawable(getResources().getDrawable(R.drawable.sample2));
						b[i-2].setVisibility(View.VISIBLE);
						count=1;
						}
						b[i].setBackgroundDrawable(getResources().getDrawable(R.drawable.sample1));
					}
					if( (column==2 || column == 3 || column ==4) && (row == 2 || row == 3 || row == 4) && (b[i-14].getVisibility() == View.INVISIBLE || b[i+2].getVisibility() == View.INVISIBLE ||b[i-2].getVisibility() == View.INVISIBLE ||b[i+14].getVisibility() == View.INVISIBLE  ))
					{
						previd=i;
						if(b[i-2].getVisibility() == View.INVISIBLE && b[i-1].getVisibility()==View.VISIBLE)
						{	count=1;
							cnt[i-2]=1;	
						b[i-2].setBackgroundDrawable(getResources().getDrawable(R.drawable.sample2));
						b[i-2].setVisibility(View.VISIBLE);
						}
						if(b[i+2].getVisibility() == View.INVISIBLE && b[i+1].getVisibility()==View.VISIBLE)
						{cnt[i+2]=1;
						count=1;
						b[i+2].setBackgroundDrawable(getResources().getDrawable(R.drawable.sample2));
						b[i+2].setVisibility(View.VISIBLE);
						}
						if(b[i-14].getVisibility() == View.INVISIBLE && b[i-7].getVisibility()==View.VISIBLE)
						{cnt[i-14]=1;
						count=1;
						b[i-14].setBackgroundDrawable(getResources().getDrawable(R.drawable.sample2));
						b[i-14].setVisibility(View.VISIBLE);
						}
						if(b[i+14].getVisibility() == View.INVISIBLE && b[i+7].getVisibility()==View.VISIBLE)
						{
							count=1;
							cnt[i+14]=1;
						b[i+14].setBackgroundDrawable(getResources().getDrawable(R.drawable.sample2));
						b[i+14].setVisibility(View.VISIBLE);
						}
						b[i].setBackgroundDrawable(getResources().getDrawable(R.drawable.sample1));
					}
				}
			}
			
			}
			
			}
		else
		{
			for(int i=0;i<49;i++)
			{
				
				if(arg0.getId()==b[i].getId())
				{
					if(((previd-i)%2==0 || (previd-i)%7==0 )&& cnt[i]==1)
					{String x;
					
					    b[i].setBackgroundDrawable(getResources().getDrawable(R.drawable.sample));
						b[previd].setVisibility(View.INVISIBLE);
					//	b[i].setVisibility(View.VISIBLE);
						int a;
						a=(i-previd);
						
						
						a=a/2;
						cnt[i]=0;
						a=a+previd;
						b[a].setVisibility(View.INVISIBLE);
						count = 0;
						marble--;
						
						b2.setText("Left="+marble);
						for(int k=0;k<49;k++)
						{
						if(cnt[k]==1)
						{
							b[k].setVisibility(View.INVISIBLE);
							
						}
						}
						//Toast.makeText(getApplicationContext(), "RIGHT ONE DUDE", Toast.LENGTH_LONG).show();
					}	
					
					else
					{
						count=0;
						Toast.makeText(getApplicationContext(), "NOT A RIGHT CHOICE", Toast.LENGTH_LONG).show();
						b[previd].setBackgroundDrawable(getResources().getDrawable(R.drawable.sample));
						for(int k=0;k<49;k++)
						{
						if(cnt[k]==1)
						{
							b[k].setVisibility(View.INVISIBLE);
							
						}
						}
						for(int k=0;k<49;k++)
						{
							if(cnt[k]==1)
							{
								b[k].setVisibility(View.INVISIBLE);
								
							}
							}
						
					}
						
					
			}
			}
				for(int k=0;k<49;k++)
				{
					if(b[k].getVisibility()==View.VISIBLE)
					{
						
						/*if((b[2].getVisibility()==View.VISIBLE && b[3].getVisibility()==View.VISIBLE && b[4].getVisibility()==View.VISIBLE)|| (b[21].getVisibility()==View.VISIBLE && b[28].getVisibility()==View.VISIBLE && b[14].getVisibility()==View.VISIBLE)|| (b[44].getVisibility()==View.VISIBLE && b[45].getVisibility()==View.VISIBLE && b[46].getVisibility()==View.VISIBLE) || (b[20].getVisibility()==View.VISIBLE && b[27].getVisibility()==View.VISIBLE && b[34].getVisibility()==View.VISIBLE))
						{
							check=1;
						
						}*/
						j1++;
						if(( k==2 || k==3 || k==4  ) && ((b[k+1].getVisibility()==View.INVISIBLE && b[k+7].getVisibility() == View.INVISIBLE && b[k-1].getVisibility()==View.INVISIBLE )|| (b[2].getVisibility()==View.VISIBLE && b[3].getVisibility()==View.VISIBLE && b[4].getVisibility()==View.VISIBLE)))//|| (b[k].getVisibility()==View.VISIBLE && b[k+1].getVisibility()==View.VISIBLE && b[k+2].getVisibility()==View.VISIBLE && b[k+7].getVisibility()==View.INVISIBLE && b[k+8].getVisibility()==View.INVISIBLE && b[k+9].getVisibility()==View.INVISIBLE) || (b[k].getVisibility()==View.VISIBLE && b[k-1].getVisibility()==View.VISIBLE && b[k+1].getVisibility()==View.VISIBLE && b[k+8].getVisibility()==View.INVISIBLE && b[k+6].getVisibility()==View.INVISIBLE && b[k+7].getVisibility()==View.INVISIBLE)|| (b[k-2].getVisibility()==View.VISIBLE && b[k-1].getVisibility()==View.VISIBLE && b[k].getVisibility()==View.VISIBLE && b[k+5].getVisibility()==View.INVISIBLE && b[k+6].getVisibility()==View.INVISIBLE && b[k+7].getVisibility()==View.INVISIBLE) ))
						{ check = 1;
						}
						else if((k==14 || k==21 || k==28 ) && (( b[k+1].getVisibility()==View.INVISIBLE && b[k+7].getVisibility() == View.INVISIBLE && b[k-7].getVisibility() == View.INVISIBLE)|| (b[21].getVisibility()==View.VISIBLE && b[28].getVisibility()==View.VISIBLE && b[14].getVisibility()==View.VISIBLE)))//|| (b[k].getVisibility()==View.VISIBLE && b[k+7].getVisibility()==View.VISIBLE && b[k+14].getVisibility()==View.VISIBLE && b[k+1].getVisibility()==View.INVISIBLE && b[k+8].getVisibility()==View.INVISIBLE && b[k+15].getVisibility()==View.INVISIBLE) || (b[k].getVisibility()==View.VISIBLE && b[k-7].getVisibility()==View.VISIBLE && b[k+7].getVisibility()==View.VISIBLE && b[k+8].getVisibility()==View.INVISIBLE && b[k-6].getVisibility()==View.INVISIBLE && b[k+1].getVisibility()==View.INVISIBLE)|| ( b[k-7].getVisibility()==View.VISIBLE && b[k-14].getVisibility()==View.VISIBLE && b[k].getVisibility()==View.VISIBLE && b[k+1].getVisibility()==View.INVISIBLE && b[k-6].getVisibility()==View.INVISIBLE && b[k-13].getVisibility()==View.INVISIBLE)) )
								{
							check=1;
								}
						else if(( k==44 || k==45 || k==46 ) && ((b[k-7].getVisibility() == View.INVISIBLE && b[k-1].getVisibility() == View.INVISIBLE && b[k+1].getVisibility() == View.INVISIBLE )|| (b[44].getVisibility()==View.VISIBLE && b[45].getVisibility()==View.VISIBLE && b[46].getVisibility()==View.VISIBLE)))//|| (b[k].getVisibility()==View.VISIBLE && b[k+1].getVisibility()==View.VISIBLE && b[k+2].getVisibility()==View.VISIBLE && b[k-7].getVisibility()==View.INVISIBLE && b[k-6].getVisibility()==View.INVISIBLE && b[k-5].getVisibility()==View.INVISIBLE) || (b[k].getVisibility()==View.VISIBLE && b[k-1].getVisibility()==View.VISIBLE && b[k+1].getVisibility()==View.VISIBLE && b[k-8].getVisibility()==View.INVISIBLE && b[k-6].getVisibility()==View.INVISIBLE && b[k-5].getVisibility()==View.INVISIBLE )|| (b[k-2].getVisibility()==View.VISIBLE && b[k-1].getVisibility()==View.VISIBLE && b[k].getVisibility()==View.VISIBLE && b[k-9].getVisibility()==View.INVISIBLE && b[k-8].getVisibility()==View.INVISIBLE && b[k-7].getVisibility()==View.INVISIBLE))) 
						{ check = 1;
						}
			
						else if( ( k==20 || k==27 || k==34) && ( ( b[k-7].getVisibility() == View.INVISIBLE && b[k-1].getVisibility() == View.INVISIBLE &&  b[k+7].getVisibility() == View.INVISIBLE )|| (b[20].getVisibility()==View.VISIBLE && b[27].getVisibility()==View.VISIBLE && b[34].getVisibility()==View.VISIBLE)))//|| ((b[k].getVisibility()==View.VISIBLE && b[k+7].getVisibility()==View.VISIBLE && b[k+14].getVisibility()==View.VISIBLE && b[k-1].getVisibility()==View.INVISIBLE && b[k+6].getVisibility()==View.INVISIBLE && b[k+13].getVisibility()==View.INVISIBLE) || (b[k].getVisibility()==View.VISIBLE && b[k-7].getVisibility()==View.VISIBLE && b[k+7].getVisibility()==View.VISIBLE && b[k+6].getVisibility()==View.INVISIBLE && b[k-8].getVisibility()==View.INVISIBLE && b[k-1].getVisibility()==View.INVISIBLE)|| ( b[k-7].getVisibility()==View.VISIBLE && b[k-14].getVisibility()==View.VISIBLE && b[k].getVisibility()==View.VISIBLE && b[k-1].getVisibility()==View.INVISIBLE && b[k-8].getVisibility()==View.INVISIBLE && b[19].getVisibility()==View.INVISIBLE) ))
						{ check = 1;
						}
				
						else if( b[k+7].getVisibility() == View.INVISIBLE && b[k+1].getVisibility() == View.INVISIBLE && b[k-1].getVisibility() == View.INVISIBLE && b[k-7].getVisibility() == View.INVISIBLE)
						{
							check=1;
						}
						
						else
						{
							check=0;
							break;
						}
					
					}
				}
				if(check==1)
				{
					//Toast.makeText(getApplicationContext(), "GAME OVER", Toast.LENGTH_LONG).show();
					if(j1==1)
					s1="GENIUS!";
					if(marble>1 && marble<=4)
						s1="Intelligent";
					else if(marble>4 && marble<32)
						s1="Average Performance";
					display(s1);
					MediaPlayer m = MediaPlayer.create(this,R.raw.time);
					m.start();
					
				}
				
					

				 	
					
				
	}
	}
}
		//	if(arg0.getVisibility()== View.INVISIBLE)
				
			
		
		
	

			
			
		
	

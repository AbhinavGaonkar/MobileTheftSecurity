
package com.example.mobiletheftsecurity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class Home extends Activity {
	Button MyAccountButton,b2, SettingButton, ChangePasswordButton;

	@Override
	public void onCreate(Bundle savedInstanceState) {
	    super.onCreate(savedInstanceState);
	    setContentView(R.layout.activity_options);
	    MyAccountButton =(Button) findViewById(R.id.myAccountButton);
	    b2=(Button) findViewById(R.id.active);
	    SettingButton =(Button) findViewById(R.id.settingButton);
	    ChangePasswordButton =(Button) findViewById(R.id.changePasswordButton);
	    MyAccountButton.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent in=new Intent(Home.this,MyAccount.class);
				startActivity(in);
				
			}
		});
	    
      b2.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent in=new Intent(Home.this,Settings.class);
				startActivity(in);
				
			}
		});
 
       SettingButton.setOnClickListener(new OnClickListener() {
		
		@Override
		public void onClick(View v) {
			// TODO Auto-generated method stub
			Intent in=new Intent(Home.this,Settings.class);
			startActivity(in);
			
		}
	});
 
       ChangePasswordButton.setOnClickListener(new OnClickListener() {
		
		@Override
		public void onClick(View v) {
			// TODO Auto-generated method stub
			Intent in=new Intent(Home.this,ChangePassword.class);
			startActivity(in);
			
		}
	});

	}

}

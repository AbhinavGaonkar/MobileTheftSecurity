package com.example.mobiletheftsecurity;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class ChangePassword extends Activity {
	EditText OldPassword, NewPassword, ConfirmPassword;
	SharedPreferences sp;
	SharedPreferences.Editor ed;
	String p_old,p_new,p_confirm;
	Button ChangePasswordButton;
	@Override
	public void onCreate(Bundle savedInstanceState) {
	    super.onCreate(savedInstanceState);
	    setContentView(R.layout.activity_resetpassword);
	    OldPassword =(EditText) findViewById(R.id.old_password);
	    NewPassword =(EditText) findViewById(R.id.new_password);
	    ConfirmPassword =(EditText) findViewById(R.id.confirm_password);
        ChangePasswordButton =(Button) findViewById(R.id.change_password);
        sp=getSharedPreferences("my_logindeatils", MODE_PRIVATE);
	    ed=sp.edit();
	 ChangePasswordButton.setOnClickListener(new OnClickListener() {
	
	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		p_old= OldPassword.getText().toString();
	    p_new= NewPassword.getText().toString();
	    p_confirm= ConfirmPassword.getText().toString();
		if(p_old.equals("")||(p_new.equals("")||p_confirm.equals("")))
		{
		  Toast.makeText(ChangePassword.this,"Please fill all the fields",1).show();
		}
		else if(!p_new.equals(p_confirm)){
			Toast.makeText(ChangePassword.this,"Passwords do not match",2).show();
		}
		else
		{
			
		    ed.putString("password",p_new);
			ed.commit();
			Toast.makeText(ChangePassword.this,"Password Changed!!",Toast.LENGTH_SHORT).show();
			Intent i=new Intent(ChangePassword.this,Home.class);
			startActivity(i);
		}
	    

		
	}
  });
	    
	}

}

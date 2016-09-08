package com.example.mobiletheftsecurity;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.telephony.TelephonyManager;
import android.widget.TextView;

public class MyAccount extends Activity {
	TextView SimSerialNumberTextView, NetworkTextView, CountryCodeTextView, MEINumberTextView;
	TelephonyManager tm;
	SharedPreferences sp;
	SharedPreferences.Editor ed;

	@Override
	public void onCreate(Bundle savedInstanceState) {
	    super.onCreate(savedInstanceState);
	    setContentView(R.layout.myaccount);
	    sp=getSharedPreferences("simDetails",MODE_PRIVATE);
	    ed=sp.edit();
	    SimSerialNumberTextView =(TextView) findViewById(R.id.simSerialNumberTextView);
	    NetworkTextView =(TextView) findViewById(R.id.networkTextView);
	    CountryCodeTextView =(TextView) findViewById(R.id.countryCodeTextView);
	    MEINumberTextView =(TextView) findViewById(R.id.MEINumberTextView);
	    tm=(TelephonyManager) getSystemService(Context.TELEPHONY_SERVICE);
	    SimSerialNumberTextView.setText("Sim Serial: "+tm.getSimSerialNumber());
	    NetworkTextView.setText("Network: "+tm.getNetworkOperatorName());
	    CountryCodeTextView.setText("Country Code: "+tm.getNetworkCountryIso());
	    MEINumberTextView.setText("IMEI No: "+tm.getDeviceId());
	    ed.putString("simno",tm.getSimSerialNumber());
        ed.putString("network",tm.getNetworkOperatorName());
        ed.commit();

	
	}

}

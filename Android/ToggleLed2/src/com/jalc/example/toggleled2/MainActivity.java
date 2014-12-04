package com.jalc.example.toggleled2;

import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Set;
import java.util.UUID;

import android.os.AsyncTask;
import android.os.Bundle;
import android.app.Activity;
import android.app.ListActivity;
import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothSocket;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends ListActivity {

	private Button btToggle;
	private ArrayAdapter<String> mArrayAdapter;
	private BluetoothAdapter mBluetoothAdapter;
	private BluetoothSocket btSocket;
	private ArrayList<BluetoothDevice> btDeviceArray = new ArrayList<BluetoothDevice>();
	private ConnectAsyncTask connectAsyncTask;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		mArrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1);
		setListAdapter(mArrayAdapter);
		
		// Instance AsyncTask
		connectAsyncTask = new ConnectAsyncTask();
		
		//Get Bluettoth Adapter
		mBluetoothAdapter = BluetoothAdapter.getDefaultAdapter();
		
		// Check smartphone support Bluetooth
		if(mBluetoothAdapter == null){
			//Device does not support Bluetooth
			Toast.makeText(getApplicationContext(), "Not support bluetooth", 5).show();
			finish();
		}
		
		// Check Bluetooth enabled
		if(!mBluetoothAdapter.isEnabled()){
			Intent enableBtIntent = new Intent(BluetoothAdapter.ACTION_REQUEST_ENABLE);
			startActivityForResult(enableBtIntent, 1);
		}
		
		// Queryng paried devices
		Set<BluetoothDevice> pariedDevices = mBluetoothAdapter.getBondedDevices();
		if(pariedDevices.size() > 0){
			for(BluetoothDevice device : pariedDevices){
				mArrayAdapter.add(device.getName() + "\n" + device.getAddress());
				btDeviceArray.add(device);
			}
		}
		
		btToggle = (Button) findViewById(R.id.btToggle);
		btToggle.setOnClickListener(btToggleOnClickListener);
		
	}

	
	@Override
	protected void onListItemClick(ListView l, View v, int position, long id) {

		BluetoothDevice device = btDeviceArray.get(position);
		connectAsyncTask.execute(device);
		
	}

	// Click event on Button
	private OnClickListener btToggleOnClickListener = new OnClickListener() {
		
		@Override
		public void onClick(View v) {
			
			OutputStream mmOutStream = null;
			
			try {
				
				if(btSocket.isConnected()){
					mmOutStream = btSocket.getOutputStream();
					mmOutStream.write(new String("L").getBytes());
				}
				
			} catch (IOException e) { }
			
		}
	};
	

	private class ConnectAsyncTask extends AsyncTask<BluetoothDevice, Integer, BluetoothSocket>{

		private BluetoothSocket mmSocket;
		private BluetoothDevice mmDevice;
		
		@Override
		protected BluetoothSocket doInBackground(BluetoothDevice... device) {
							
			mmDevice = device[0];
			
			try {
				
				String mmUUID = "00001101-0000-1000-8000-00805F9B34FB";
				mmSocket = mmDevice.createInsecureRfcommSocketToServiceRecord(UUID.fromString(mmUUID));
				mmSocket.connect();
				
			} catch (Exception e) { }
			
			return mmSocket;
		}

		@Override
		protected void onPostExecute(BluetoothSocket result) {
			
			btSocket = result;
			//Enable Button
			btToggle.setEnabled(true);
			
		}
		
		
			
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}

package com.jalc.example.toggleled;

import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.UUID;

import android.os.Bundle;
import android.app.ListActivity;
import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothSocket;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;

import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends ListActivity {

	private static final String TAG = "ToggleLed";
	private static final int ENABLE_BLUETOOTH = 1;
	
	private BluetoothAdapter mBluetoothAdapter;
	private ArrayList<BluetoothDevice> btDeviceList = new ArrayList<BluetoothDevice>();
	private BluetoothSocket clientSocket;
	private BroadcastReceiver discoveryMonitor;
	
	private ArrayAdapter<String> mArrayAdapter;
	private Button buttonToggle;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		setContentView(R.layout.activity_main);
		
		
		// TODO: Get Bluetooth Adapter.

		
		// TODO: Check smatphone support Bluetooth
		
		
		
		
		
						
		// Componentes de la interface grafica.
		mArrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1);
		setListAdapter(mArrayAdapter);
		
		buttonToggle = (Button) findViewById(R.id.btToggle);
		buttonToggle.setOnClickListener(buttonToggleOnClickListener);

	}
			
	@Override
	protected void onResume() {
		super.onResume();
		
		// TODO:En caso de que el bluetooth no este activo, hacemos un Intent al sistema
		// para que nos lleve a la pantalla de activacion. Al volver de esta pantalla
		// ejecutara el metodo onActivityResult.
		
		
		
		
		
		
		
		
		// TODO: Registramos el BroadcasReceiver
		
		
		
		
	}

	@Override
	protected void onActivityResult(int requestCode, int resultCode, Intent data) {
		super.onActivityResult(requestCode, resultCode, data);
			
		if (requestCode == ENABLE_BLUETOOTH){
			if (resultCode == RESULT_OK){
				Log.d(TAG, "Bluetooth: el usuario acepta encenderlo");
				// Ejecutamos el metodo dicoveryBluetooth
				dicoveryBluetooth();
			}else{
				Log.d(TAG, "Bluetooth: el usuario NO acepta encenderlo");
			}
		}
	}

	// Metodo para buscar dispositibos bluetooth cercanos.
	// Este metodo es asincrono y devuelve los resultados mediante
	// un BroadcastReceiver.
	private void dicoveryBluetooth() {	
		
		// Limpiamos la lista de dispositivos detectados.
		mArrayAdapter.clear();
		btDeviceList.clear();
		
		// Aqui implementamos el BrodcastReceiver
		this.discoveryMonitor = new BroadcastReceiver() {

			@Override
			public void onReceive(Context context, Intent intent) {
			
				// TODO: Acciones, al iniciar el dicovery, finalizar y cuando encuentra un dispositivo
				
				
				
				
				
				
				
				
				
				
				
			}		
		};
		
		// TODO: Iniciamos la busqueda de dispositvos bluetooth.
		// Este metodo es muy lento y consumo mucha bateria
		// en otros capitulos veremos como usar otra tecnica.

	
	}
		
	
	@Override
	protected void onPause() {
		super.onPause();
		
		if (this.discoveryMonitor != null){
			unregisterReceiver(discoveryMonitor);
		}
		
	}
	
	private boolean connectRemoteDevice(BluetoothDevice device){
		
		Log.d(TAG, "Connectando");
		boolean connect = false;
		
		try {

			// TODO: Conexion socket cliente.
			// String mmUUID = "00001101-0000-1000-8000-00805F9B34FB";
			
			
			
			
			
				
		} catch (Exception e) {
			Log.d(TAG,e.getMessage());
			connect = false;
		}
		
		return connect;
	}
	
	
//	@Override
	protected void onListItemClick(ListView l, View v, int position, long id) {
		
		BluetoothDevice device = btDeviceList.get(position);
		Log.d(TAG, "Dispositivo seleccionado: "  + device.getName());
		
		// Intentamos conectar con el dispositivo remoto.
		if(connectRemoteDevice(device)){
			buttonToggle.setEnabled(true);
		}
		
	}

	
	private OnClickListener buttonToggleOnClickListener = new OnClickListener() {
		
		@Override
		public void onClick(View v) {
		
			Log.d(TAG, "Enviando cambio de estado del LED");
			
			// TODO: Enviando informacion del Movil hacia el Arduino.
			
			try {
			
			
				
				
				
			} catch (IOException e) {
				Log.d(TAG,e.getMessage());
				buttonToggle.setEnabled(false);
			}
			
		}
	}; 
}

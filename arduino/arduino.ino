// libreria y variables  comunicacion serial con bbluetooth

#include <SoftwareSerial.h>
#include <NewPing.h>
#include "DHT.h"          // Libreria para Sensores Temperatura DHT

// variables y librerias dht11 
#define DHTPIN 2         // conectado en el pin 2 del sensor
#define DHTTYPE DHT11   // DHT 11  sensor DHT usado
// variables motor dc 
#define DCPIN 3   // Pin 3 PWM motor 
// variables led RGB
#define REDRGB 4    // Pin 4 para el color rojo 
#define GREENRGB 5    // Pin 5 para el color verde 
#define BLUERGB 6    //Pin 6 para el color azul  
//variable sensor ultrasonico y speaker
// libreria NEWPIN https://arduino-new-ping.googlecode.com/files/NewPing_v1.5.zip
#define TRIGGER_PIN  7
#define ECHO_PIN     8
#define MAX_DISTANCE 200   
#define SPEAKERPIN 9         //pin speaker PWN
// VARIABLES RELAY
#define RELAYPIN 12            // PIN al que va conectado el relé
NewPing sonar(TRIGGER_PIN, ECHO_PIN, MAX_DISTANCE);   //Crear el objeto de la clase NewPing
DHT dht(DHTPIN, DHTTYPE);   // Inicializa el sensor
SoftwareSerial bluetoothBridge(2,3);
char rec; // variable que recoje valor enviado
char sen; // variable con valor a enviar 
int velocidad = 255; // variable donde almacenamos la velocidad del motor 0-255

// Configura Arduino 
void setup() {
  // motor 
  pinMode(DCPIN, OUTPUT); // pin motor DC output
 
 // speaker
  pinMode(SPEAKERPIN, OUTPUT);

  // rgb
  pinMode(REDRGB, OUTPUT);
  pinMode(GREENRGB, OUTPUT);
  pinMode(BLUERGB, OUTPUT);  
 
  //monitor serial
  Serial.begin(9600); 
  Serial.println("Prueba log:");
    // bloutooth
  bluetoothBridge.begin(9600); // inciamos comunicacion bluetooth
  Serial.println("Connection inciada bluetooth ");
  pinMode(RELAYPIN, OUTPUT);  // PIN relay como salida


  // dth 11
  dht.begin();  // iniciamos sensor 

}



void loop() {

  delay(2000); // Espera dos segundos para realizar la primera medición.
  leerDato();
  Serial.print("valor rec :");
  Serial.println(rec);
  switch(rec){
     case '0':
     setColor(0, 255, 255);  // ilumina led rgb con color aqua 
     Serial.println(" led encendido");
     break;

     case '1':
     setColor(0, 0, 0);  // apagamos el led 
     Serial.println(" led apagado");
     break;
     case '2':
     digitalWrite(RELAYPIN, HIGH);   // bombilla ENCENDIDO
     Serial.println(" bombilla encendido");
     break; 

     case '3':
      digitalWrite(RELAYPIN, LOW);    // bombilla APAGADO
     Serial.println(" led encendido");
     break; 
}


// sesor de temperatura    

  float humedad = dht.readHumidity(); // Obtiene la Humedad
  float temperatura = dht.readTemperature();   // Obtiene la Temperatura en Celsius
  
  // Control de errores, valida que se obtuvieron valores para los datos medidos
  if (isnan(humedad) || isnan(temperatura)) {
    Serial.println("Fallo al leer el sensor DHT!");
    return;
  }
  
  // encendemos el motor si la temperatura sobrepasa los 25 grados Celsius
  if (temperatura > 25){
   analogWrite(DCPIN, velocidad);
   Serial.println("Ventilador Encendido"); 
   Serial.print("Humedad: "); 
   Serial.print(humedad);
   Serial.print(" %\t");
   Serial.print("Temperatura: "); 
   Serial.print(temperatura);
   Serial.println(" *C ");
  }else{
   analogWrite(DCPIN, 0);
    Serial.println("Ventilador Apagado"); 
    Serial.print("Humedad: "); 
    Serial.print(humedad);
    Serial.print(" %\t");
    Serial.print("Temperatura: "); 
    Serial.print(temperatura);
    Serial.println(" *C ");
  }



// sensor ultrasonico y speaker


  int uS = sonar.ping_median();  // Obtener medicion de tiempo de viaje del sonido y guardar en variable uS
  long distancia= uS/US_ROUNDTRIP_CM;  // Calcular la distancia con base en una constante
  Serial.print("Distancia: ");// Imprimir la distancia medida a la consola serial
   Serial.print(distancia );
  Serial.println(" cm");

  if (distancia > 2) {            // check if the input is HIGH
    playTono(300, 160);
    delay(150);
  } else { 
      playTono(0, 0);
      delay(150);    
    }

}




// funcion que asigna el color 

void setColor(int red, int green, int blue) {
  #ifdef COMMON_ANODE
    red = 255 - red;
    green = 255 - green;
    blue = 255 - blue;
  #endif
  analogWrite(REDRGB, red);
  analogWrite(GREENRGB, green);
  analogWrite(BLUERGB, blue);  

/* para cambiar el color utilizar las siguientes lineas dependiendo del color y descomentar 
    setColor(255, 0, 0);  // red
    setColor(0, 255, 0);  // green
    setColor(0, 0, 255);  // blue
    setColor(255, 255, 0);  // yellow
    setColor(80, 0, 80);  // purple
*/

}


// tono alarma duracion en mSecs, frequencia en hertz
void playTono(long duracion, int freq) {
    duracion *= 1000;
    int periodo = (1.0 / freq) * 1000000;
    long tiempo_transcurrido = 0;
    while (tiempo_transcurrido < duracion) {
        digitalWrite(SPEAKERPIN,HIGH);
        delayMicroseconds(periodo / 2);
        digitalWrite(SPEAKERPIN, LOW);
        delayMicroseconds(periodo / 2);
        tiempo_transcurrido += (periodo);
    }
}

void leerDato(){
 if (Serial.available()>0){
  rec = Serial.read();
 //rec = bluetoothBridge.read();   // leemos la comunicacion serial de bluetooth
}
  Serial.flush(); 
}



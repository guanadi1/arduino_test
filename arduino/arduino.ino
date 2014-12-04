

#include <SoftwareSerial.h>   // libreria comunicacion serial 
#include <NewPing.h>      // libreria sensor ultrasonico
#include "DHT.h" // Libreria para Sensores Temperatura DHT
#define DHTPIN 2 // pin 2 del sensor dht
#define DHTTYPE DHT11 // tipo de sensor DHT usado
#define DCPIN 3 // pin 3 motor dc 
// variables led RGB
#define LDRPIN 0   // pin 0 analogo 
#define REDRGB 4 // Pin 4 para el color rojo
#define GREENRGB 5 // Pin 5 para el color verde
#define BLUERGB 6 //Pin 6 para el color azul
//variable sensor ultrasonico y speaker
// libreria NEWPIN https://arduino-new-ping.googlecode.com/files/NewPing_v1.5.zip
#define TRIGGER_PIN 7        
#define ECHO_PIN 8          
#define MAX_DISTANCE 200  // distancia maxima sensor ultrasonico 
#define SPEAKERPIN 9 //pin 9 speaker
#define RELAYPIN 12 // PIN al que va conectado el relé


NewPing sonar(TRIGGER_PIN, ECHO_PIN, MAX_DISTANCE); //iniciamos sensor ultrasonico con la clase NewPing
DHT dht(DHTPIN, DHTTYPE); // Inicializa el sensor dth
SoftwareSerial BT(10,11);  // Inicializa bluetooth
char rec; // variable que recoje valor recibido
char sen; // variable con valor a enviar
int velocidad = 255; // variable donde almacenamos la velocidad del motor 0-255


// Configura Arduino
void setup() {

pinMode(DCPIN, OUTPUT); // pin motor DC como salida
pinMode(SPEAKERPIN, OUTPUT); // speaker como salida 
pinMode(REDRGB, OUTPUT);  // rgb pins como salida 
pinMode(GREENRGB, OUTPUT);
pinMode(BLUERGB, OUTPUT);
pinMode(RELAYPIN, OUTPUT); // PIN relay como salida

Serial.begin(9600);  //monitor serial
Serial.println("Prueba log:");
bluetoothBridge.begin(9600); // inciamos comunicacion bluetooth
Serial.println("Connection inciada bluetooth ");
dht.begin(); // iniciamos sensor dth 11

}



void loop() {

delay(1000); // Espera dos segundos para realizar la primera medición.

leerDato();  // leer datos de serial y lo almacena en rec
/*----------ldr---------------*/

int vldr = analogRead(LDRPIN);
Serial.print("Valor ldr: ");
Serial.println(vldr);

if( vldr < 400 || rec == '0' ){

setColor(0, 255, 255); // ilumina led rgb con color aqua
Serial.println("led encendido por LDR");

}else if( vldr > 400 || rec == '1' ) {

setColor(0, 0, 0); // apagamos el led
Serial.println("led apagado por LDR");

}




switch(rec){

case '0':
setColor(0, 255, 255); // ilumina led rgb con color aqua
Serial.println("led encendido boton");
break;
case '1':
setColor(0, 0, 0); // apagamos el led
Serial.println("led apagado boton");
break;
case '2':
digitalWrite(RELAYPIN, HIGH); // bombilla on
Serial.println("bombilla on");
break;
case '3':
digitalWrite(RELAYPIN, LOW); // bombilla off
Serial.println("bombilla off");
break;
}

/*-------------sensor temperatura--------------*/

float humedad = dht.readHumidity(); // Obtiene la Humedad
float temperatura = dht.readTemperature(); // Obtiene la Temperatura en Celsius

enviarTemperatura(temperatura);   // enviamos la temperatuta por serial 

if (isnan(humedad) || isnan(temperatura)) { // Control de errores, valida que se obtuvieron valores para los datos medidos
Serial.println("Fallo al leer el sensor DHT!");
return;
}

if (temperatura > 25)  {     // encendemos el motor si la temperatura sobrepasa los 25 grados Celsius
analogWrite(DCPIN, velocidad);
Serial.println("Ventilador Encendido");
}else{
analogWrite(DCPIN, 0);
Serial.println("Ventilador Apagado");
}
Serial.print("Humedad: ");
Serial.print(humedad);
Serial.print(" %\t");
Serial.print("Temperatura: ");
Serial.print(temperatura);
Serial.println(" *C ");

/*------------- sensor ultrasonico y speaker--------------*/

int uS = sonar.ping_median(); // Obtener medicion de tiempo de viaje del sonido y guardar en variable uS
long distancia= uS/US_ROUNDTRIP_CM; // Calcular la distancia con base en una constante
Serial.print("Distancia: ");// Imprimir la distancia medida a la consola serial
Serial.print(distancia );
Serial.println(" cm");
if (distancia < 2) { // check if the input is HIGH
playTono(300, 160);
delay(150);
} else {
playTono(0, 0);
delay(150);
}

}


/*------------- funcion que asigna el color --------------*/

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
setColor(255, 0, 0); // red
setColor(0, 255, 0); // green
setColor(0, 0, 255); // blue
setColor(255, 255, 0); // yellow
setColor(80, 0, 80); // purple
*/
}

/*------------- funcion tono alarma duracion en mSecs, frequencia en hertz --------------*/
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

/*------------- funcion para leer datos enviados por serial --------------*/

void leerDato(){
  if (Serial.available()>0){
     rec = Serial.read();
     //rec = BT.read(); // leemos la comunicacion serial de bluetooth
     Serial.print("valor recibido:");
     Serial.println(rec);     
}
 Serial.flush();
}


/*------------- funcion que envia la temperatura a serial bt--------------*/

 void enviarTemperatura(float temperatura){

  if (isnan(temperatura)){ //Comprueba que el dato es un número
    BT.println("Error enviar temperatura");
  } else {
    BT.println(temperatura); //Envía el dato por el puerto serie
  }
}


/*
- led rgb ok falta 
- rele bombilla ok
- sensor ultrasonico y alarma ok
- conexion bluetooth ok
- temperatura con ventilador ok
- 
*/

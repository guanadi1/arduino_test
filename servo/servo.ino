#include <Servo.h>

Servo myServo;

void setup(){
  myServo.attach(9);
  Serial.begin(9600);
  Serial.println('conectado');
  
}

void loop(){
  
  if(Serial.available()){
  int c= Serial.read();
  myServo.write(c);
  Serial.println(c);
  }
  
}

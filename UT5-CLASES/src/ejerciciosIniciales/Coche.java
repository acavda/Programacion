package ejerciciosIniciales;

//Ejercicio 2 Dada la clase Coche:
//Añadirle los siguientes métodos: 1. int getVelocidad - Obtiene la velocidad actual.
//2. void acelera(int mas) - Aumenta la velocidad en 'más' kilómetros hora.

class Coche {
  private int velocidad;
  Coche() {velocidad=100;}
  
public int getVelocidad() {
	return velocidad;
}

public void acelera(int mas){
	velocidad+=mas;
	
	
}
  
  
  
  
  
}

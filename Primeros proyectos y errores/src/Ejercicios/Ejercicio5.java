package Ejercicios;

import java.util.Scanner;

public class Ejercicio5 {

	//Crea un programa que pida el tama�o de un archivo (Mbytes) y la velocidad de una l�nea de datos (Mbps), 
	//y muestre el tiempo que tardar� en transmitirlo usando dicha l�nea.
	
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double peso,velocidad,tiempo;
		
		Scanner teclado= new Scanner(System.in);
		
		
		System.out.println("Dame el tama�o del archivo en Mbytes: ");
		
		peso=teclado.nextDouble();
		
		System.out.println("Dame la velocidad de la linea de datos en Mbps: ");
		
		velocidad=teclado.nextDouble();
		
		
		
		
		tiempo=(peso*1.048576)/velocidad;
		
		System.out.println("El tiempo que tarda en transmitirlo es: " +tiempo+ " Segundos");
		
		
		
		
		
		
	}

}

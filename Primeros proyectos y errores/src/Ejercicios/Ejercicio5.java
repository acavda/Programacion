package Ejercicios;

import java.util.Scanner;

public class Ejercicio5 {

	//Crea un programa que pida el tamaño de un archivo (Mbytes) y la velocidad de una línea de datos (Mbps), 
	//y muestre el tiempo que tardará en transmitirlo usando dicha línea.
	
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double peso,velocidad,tiempo;
		
		Scanner teclado= new Scanner(System.in);
		
		
		System.out.println("Dame el tamaño del archivo en Mbytes: ");
		
		peso=teclado.nextDouble();
		
		System.out.println("Dame la velocidad de la linea de datos en Mbps: ");
		
		velocidad=teclado.nextDouble();
		
		
		
		
		tiempo=(peso*1.048576)/velocidad;
		
		System.out.println("El tiempo que tarda en transmitirlo es: " +tiempo+ " Segundos");
		
		
		
		
		
		
	}

}

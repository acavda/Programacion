package Ejercicios;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Crea un programa que pida un peso en Kilogramos 
//y realice la conversión a onzas, sabiendo que 1 Kilogramo (Kg) = 35.2739619 Onzas (oz)
		
		
		double pesokg,pesoz;
		Scanner teclado=new Scanner(System.in);
		
		System.out.println("Dame un peso en KG");
		
		pesokg=teclado.nextDouble();
		
		pesoz=(pesokg*35.2739619);
		
		System.out.println("El peso en onzas es: " +pesoz);
		
		
		
		
		
		
		

	}

}

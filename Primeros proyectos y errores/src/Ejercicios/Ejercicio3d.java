package Ejercicios;

import java.util.Scanner;


public class Ejercicio3d {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		double cateto1,cateto2,hipotenusa;
		
		Scanner teclado=new Scanner(System.in);
		
		System.out.println("Dame el cateto 1: ");
		
		
		cateto1=teclado.nextDouble();
		
		System.out.println("Dame el cateto 2: ");
		
		cateto2=teclado.nextDouble();
		
		hipotenusa=(cateto1*cateto2)*(cateto2*cateto2);
		hipotenusa=Math.sqrt(hipotenusa);
		
		System.out.println("La hipotenusa es: " +hipotenusa);
		
		
		
		
		
		
		
		
		
	}

}

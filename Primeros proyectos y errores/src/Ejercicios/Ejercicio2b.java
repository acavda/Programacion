package Ejercicios;

import java.util.Scanner;

public class Ejercicio2b {

	public static void main(String[] args){
	
		double numero1,numero2,suma,media,producto;
		
		Scanner teclado=new Scanner(System.in);
		
	
	System.out.println("Intrudoce el primer numero: ");
	numero1=teclado.nextDouble();
	
	System.out.println("Intrudoce el segundo numero: ");
	numero2=teclado.nextDouble();
	
	suma=numero1+numero2;
	media=(numero1+numero2)/2;
	producto=numero1*numero2;
	
	
	
	
	
	
	System.out.println("La suma de " +numero1+ " y " +numero2+ " es " +suma);
	System.out.println("La media de " +numero1+ " y " +numero2+ " es " +media);
	System.out.println("El producto de " +numero1+ " y " +numero2+ " es " +producto);
		
	
	
	
	
	
}
	
	
	
}

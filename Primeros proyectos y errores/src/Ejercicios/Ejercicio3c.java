package Ejercicios;

import java.util.Scanner;

public class Ejercicio3c {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	double radio,volumen,pi=3.1416;
	
	Scanner teclado=new Scanner(System.in);
	
	
	
	System.out.println("Dame el radio de la esfera");
	radio=teclado.nextDouble();
	
	volumen=((4/3)*pi)*((radio*radio)*radio);
	
	System.out.println("El volumen de la esfera es: " +volumen);
	
	
		

		
		
		
	}

}

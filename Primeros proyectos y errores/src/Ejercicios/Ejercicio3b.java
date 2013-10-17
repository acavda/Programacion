package Ejercicios;

import java.util.Scanner;

public class Ejercicio3b {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		double radio,area,perimetro;
		
		Scanner teclado=new Scanner(System.in);
		
		
		System.out.println("Dame el radio del circulo");
		
		radio=teclado.nextDouble();
		
		perimetro=radio*2*3.1416;
		area=(radio*radio)*3.1416;
		
		System.out.println("El perimetro del círculo es: " +perimetro);
		System.out.println("EL area del círculo es " +area);
		
		
		
		
		
		
		
		
		
		
		
		
	}

}

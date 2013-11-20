package bucles;

import java.util.Scanner;

public class Ejercicio3Switch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		double n1,n2;
		
		int respuesta;

		Scanner teclado = new Scanner(System.in);
		
		
		
		
		while(true){
			System.out.println("\nDame el primer número");
			n1= teclado.nextDouble();
			
			System.out.println("Dame el segundo número");
			n2 = teclado.nextDouble();
			
			System.out.println("¿Que quieres hacer? \n-Sumar \n-Restar \n-Multiplicar \n-Dividir");
			respuesta = teclado.nextInt();
			
			
			
			
			switch(respuesta){
			case 1:
				System.out.println("El resultado de la suma es: " +(n1+n2));
				break;
				
			case 2:
				System.out.println("El resultado de la resta es : " +(n1-n2));
				break;
			case 3:
				System.out.println("El resultado del producto es : " +(n1*n2));
				break;
			case 4:
				System.out.println("El resultado de la división es: " +(n1/n2));
				
			default:
				System.out.println("Error, operación no disponible");
				break;
				
		
		}
			
	}
	
}}
package ejerciciosInicial;

import java.util.Scanner;

public class NumeroMenorDe3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Dame el numero 1");
		
		int numero1 = teclado.nextInt();
		
		System.out.println("Dame el numero 2");
		
		int numero2 = teclado.nextInt();
		
		System.out.println("Dame el numero 3");
		
		int numero3 = teclado.nextInt();
		
		if(numero1<numero2 && numero1<numero3){
			
			System.out.println("EL menor es el numero 1: " +numero1);
			
			}else if(numero2<numero1 && numero2<numero3){
			
				System.out.println("El menor es el numero 2: " +numero2);
			
			
				}else if(numero3<numero1 &&numero3<numero2){
				
					System.out.println("El menor es el numero 3: " +numero3);
		}		
	}

}

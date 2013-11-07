package ejerciciosInicial;

import java.util.Scanner;

public class NumeroMayor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner teclado = new Scanner(System.in);
		
		
		
		System.out.println("Dame el número 1:");
		
		double numero1 = teclado.nextDouble();
		
		System.out.println("Dame el numero 2:");
		
		double numero2 = teclado.nextDouble();
		
		if(numero1==numero2){
			
			System.out.println("Los numeros son iguales " +numero1);
			
			
		}else if(numero1>numero2){
			
			
			System.out.print("El numero mayor es el primer numero: " +numero1);
			
			
			
			
		}else{
			
			System.out.print("El numero mayor es el segundo numero: " +numero2);
			
			
		}
		

		
		
		
	}

}

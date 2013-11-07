package ejerciciosInicial;

import java.util.Scanner;

public class NumeroPar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Dame el numerco colega:");
		
		int numero= teclado.nextInt();
		
		
		if(numero%2==0){
			
			System.out.println("El numero es par: " +numero);
			
			
			
		}else{
			
			System.out.println("El numero es impar: " +numero);
			
		}
		
	}

}

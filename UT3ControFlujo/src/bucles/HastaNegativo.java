package bucles;

import java.util.Scanner;

public class HastaNegativo {
	
	//Algoritmo:
	
	/*
	 * escribir numeros
	 * mientras n >0
	 * si n <0 escribir n primero
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Escribir un programa que lea tantos n�meros como el usuario quiera 
		//(hasta que se inserte un n�mero negativo). 
		//El primer n�mero hay que visualizarlo en la pantalla.
		
		
		
		int n=0,n1=0;
		Scanner teclado = new Scanner(System.in);
		
		do{
			System.out.println("");
			n=teclado.nextInt();
			
		}while(n>=0);
		
		
	}

}

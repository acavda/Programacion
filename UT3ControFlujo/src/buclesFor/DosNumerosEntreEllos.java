package buclesFor;

import java.util.Scanner;

public class DosNumerosEntreEllos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		/*
		 * Escribe un programa que pida dos n�meros con el fin de visualizar la suma
		 *  de todos los n�meros que hay entre ambos n�meros (incluidos dichos n�meros).
		 *   Si el primer n�mero que inserte el usuaruio es mayor que el segundo, 
		 *   se volver�n a pedir otros dos n�meros hasta que el primer 
		 *   n�mero insertado sea menor o igual que el segundo.
		 */
		
		Scanner teclado = new Scanner(System.in);
		int n,n1,n2=0,suma=0;
		
		for(int i=2;i>=0;i--){
			
			System.out.println("introduce el primer n�mero");
			n=teclado.nextInt();
			System.out.println("Introduce el segundo n�mero");
			n1=teclado.nextInt();
			while(true){
				n2=n1-1;
				suma=n2+suma;
			
			}
			
			//System.out.println("");
			
			
			
		}
		
		
		
		
		
	}

}

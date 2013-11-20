package buclesFor;

import java.util.Scanner;

public class DosNumerosEntreEllos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		/*
		 * Escribe un programa que pida dos números con el fin de visualizar la suma
		 *  de todos los números que hay entre ambos números (incluidos dichos números).
		 *   Si el primer número que inserte el usuaruio es mayor que el segundo, 
		 *   se volverán a pedir otros dos números hasta que el primer 
		 *   número insertado sea menor o igual que el segundo.
		 */
		
		Scanner teclado = new Scanner(System.in);
		int n,n1,n2=0,suma=0;
		
		for(int i=2;i>=0;i--){
			
			System.out.println("introduce el primer número");
			n=teclado.nextInt();
			System.out.println("Introduce el segundo número");
			n1=teclado.nextInt();
			while(true){
				n2=n1-1;
				suma=n2+suma;
			
			}
			
			//System.out.println("");
			
			
			
		}
		
		
		
		
		
	}

}

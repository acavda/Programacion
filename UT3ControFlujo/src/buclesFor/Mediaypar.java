package buclesFor;

import java.util.Scanner;

public class Mediaypar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		/*
		 * Escribe un programa que pida tantos n�meros como el usuario 
		 * del programa indique al principio. 
		 * El programa mostrar� al final la media y si se ha insertado un n�mero par.
		 */
		
		
		
		Scanner teclado = new Scanner(System.in);
		
		int i,media=0,suma=0,n=0;
		
		System.out.println("�Cuantos n�meros quieres?");
		
		
		for(i=teclado.nextInt();i>0;i--){
			System.out.println("Introduce un numero");
			n=teclado.nextInt();
			
			suma = suma+n;
			media=suma/i;
			
		}
		
		System.out.println("la media es: " +media);
		
	}

}

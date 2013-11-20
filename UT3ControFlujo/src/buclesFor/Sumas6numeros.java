package buclesFor;

import java.util.Scanner;

public class Sumas6numeros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado = new Scanner(System.in);
		
		int n=0,suma=0;
		
		for(int i=1;i<7;i++){
			System.out.println("Introduce un numero");
			n = teclado.nextInt();
			suma = suma +n;
			
		}
		
		System.out.println("La suma de todos los números es: "+suma);
		
	}

}

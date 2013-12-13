package EjerciciosPracticosNoOficales;

import java.util.Scanner;

public class Arrayss {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner teclado = new Scanner(System.in);
	int numeros[];
	
	
		numeros=new int[10];
		
		
		
		for(int i=0;i<numeros.length;i++){
			
			numeros[i]=teclado.nextInt();
		}
		
		for(int i=0;i<numeros.length;i++){
			System.out.print(numeros[i]+"\t");
		}
		
		
		
		
		
		
		
		
	}

}

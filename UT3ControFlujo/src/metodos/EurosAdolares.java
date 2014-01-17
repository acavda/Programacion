package metodos;

import java.util.Scanner;

public class EurosAdolares {
	
	public static double conversor(double euros){
		
		double dolares=euros*(1.36652);
		return dolares;
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Escribir un método que convierta de euros a dólares. Recibirá un número decimal 
//correspondiente a la cantidad en euros y devolverá la cantidad correspondiente en dolares.
//Escribir el código en el main necesario para probarlo.
		Scanner teclado = new Scanner(System.in);
		double euros=0;
		System.out.println("Escribe el número de euros");
		euros=teclado.nextDouble();
		
		System.out.println("El número de dolares es: "+EurosAdolares.conversor(euros));
		
		
		
	}

}

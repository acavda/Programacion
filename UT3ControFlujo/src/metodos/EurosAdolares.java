package metodos;

import java.util.Scanner;

public class EurosAdolares {
	
	public static double conversor(double euros){
		
		double dolares=euros*(1.36652);
		return dolares;
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Escribir un m�todo que convierta de euros a d�lares. Recibir� un n�mero decimal 
//correspondiente a la cantidad en euros y devolver� la cantidad correspondiente en dolares.
//Escribir el c�digo en el main necesario para probarlo.
		Scanner teclado = new Scanner(System.in);
		double euros=0;
		System.out.println("Escribe el n�mero de euros");
		euros=teclado.nextDouble();
		
		System.out.println("El n�mero de dolares es: "+EurosAdolares.conversor(euros));
		
		
		
	}

}

package buclesAnidados;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*Escribe un programa que pida un n�mero con el fin de calcular el factorial 
		 * de dicho n�mero. Hay que validar que el n�mero insertado sea positivo (incluido el 0).
		 *  Si no es as�, se volver� a pedir dicho n�mero. Posteriormente,
		 *   el programa le preguntar� al usuario si quiere insertar otro n�mero, 
		 *   con un mensaje como este: "�Quiere insetar otro n�mero [s/n]?".
		 *    Debes validar tambi�n esta respuesta.
		 * 
		 */
		
		Scanner teclado = new Scanner(System.in);
		
		int n=0,factorialn=1;
		
		System.out.println("Dame un n�mero");
		n=teclado.nextInt();
		
		while(n>=0){
			
			factorialn=n*(n-1);
			
			
		}
		
		System.out.println(factorialn);
		
		
		
		
	}

}

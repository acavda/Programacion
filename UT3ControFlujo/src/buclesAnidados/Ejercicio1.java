package buclesAnidados;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*Escribe un programa que pida un número con el fin de calcular el factorial 
		 * de dicho número. Hay que validar que el número insertado sea positivo (incluido el 0).
		 *  Si no es así, se volverá a pedir dicho número. Posteriormente,
		 *   el programa le preguntará al usuario si quiere insertar otro número, 
		 *   con un mensaje como este: "¿Quiere insetar otro número [s/n]?".
		 *    Debes validar también esta respuesta.
		 * 
		 */
		
		Scanner teclado = new Scanner(System.in);
		
		int n=0,factorialn=1;
		
		System.out.println("Dame un número");
		n=teclado.nextInt();
		
		while(n>=0){
			
			factorialn=n*(n-1);
			
			
		}
		
		System.out.println(factorialn);
		
		
		
		
	}

}

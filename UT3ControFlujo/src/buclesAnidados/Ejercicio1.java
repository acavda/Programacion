package buclesAnidados;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Escribe un programa que pida un número con el fin de calcular el
		 * factorial de dicho número. Hay que validar que el número insertado
		 * sea positivo (incluido el 0). Si no es así, se volverá a pedir dicho
		 * número. Posteriormente, el programa le preguntará al usuario si
		 * quiere insertar otro número, con un mensaje como este:
		 * "¿Quiere insetar otro número [s/n]?". Debes validar también esta
		 * respuesta.
		 */

		Scanner teclado = new Scanner(System.in);

		int numero, fact = 1;
		String respuesta;

		System.out.println("Introduce un número");
		numero = teclado.nextInt();

		while (true) {

			fact = 1;

			while (numero >= 0) {

				for (int i = numero; i >= 1; i--) {

					fact = fact * i;

				}

				System.out.println("El factorial de " + numero + " es " + fact);

				System.out.println("¿Quieres introducir otro numero?");
				respuesta = teclado.next();

				if (respuesta.equalsIgnoreCase("no")) {
					System.out.println("Fin");
					break;

				}

			}

		}

	}
}

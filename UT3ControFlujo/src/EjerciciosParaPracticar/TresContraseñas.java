package EjerciciosParaPracticar;

import java.util.Scanner;

public class TresContrase�as {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Un programa que pida al usuario una contrase�a (en el programa
		 * escribe la palabra oculta que quieras). El programa volver� a pedir
		 * la contrase�a hasta que la adivine el jugador o se llege a los 3
		 * intentos, lo que ocurra primero. Mostrar� un mensaje de aceptaci�n de
		 * la contrase�a o el de error por hacer tres intentos fallidos
		 */

		Scanner teclado = new Scanner(System.in);

		String dada = "", contrase�a = "acavda";

		System.out.println("Iniciar sesi�n:");

		for (int i = 0; i < 3; i++) {
			System.out.println("Introduce la contrase�a:");
			dada = teclado.next();

			if (dada.equals(contrase�a)) {
				System.out.println("Contrase�a correcta");
				break;

			} else if (i < 2) {
				System.out
						.println("Contrase�a incorrecta, vuelva a intentarlo\n");
			} else if (i == 2) {
				System.out.println("Contrase�a incorrecta, cuenta bloqueada");
			}

		}

	}

}

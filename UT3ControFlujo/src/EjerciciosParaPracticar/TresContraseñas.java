package EjerciciosParaPracticar;

import java.util.Scanner;

public class TresContraseñas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Un programa que pida al usuario una contraseña (en el programa
		 * escribe la palabra oculta que quieras). El programa volverá a pedir
		 * la contraseña hasta que la adivine el jugador o se llege a los 3
		 * intentos, lo que ocurra primero. Mostrará un mensaje de aceptación de
		 * la contraseña o el de error por hacer tres intentos fallidos
		 */

		Scanner teclado = new Scanner(System.in);

		String dada = "", contraseña = "acavda";

		System.out.println("Iniciar sesión:");

		for (int i = 0; i < 3; i++) {
			System.out.println("Introduce la contraseña:");
			dada = teclado.next();

			if (dada.equals(contraseña)) {
				System.out.println("Contraseña correcta");
				break;

			} else if (i < 2) {
				System.out
						.println("Contraseña incorrecta, vuelva a intentarlo\n");
			} else if (i == 2) {
				System.out.println("Contraseña incorrecta, cuenta bloqueada");
			}

		}

	}

}

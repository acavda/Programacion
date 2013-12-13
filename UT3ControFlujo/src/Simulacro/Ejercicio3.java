package Simulacro;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado = new Scanner(System.in);

		String palabra = "";

		String frases = "";

		String totalfrases = "";

		String r = "s";

		System.out
				.println("Comenzaremos a introducir versos, escribe * para terminar");

		while (r.equalsIgnoreCase("s")) {

			for (int i = 0; i < 40; i++) {
				System.out.println("Dame una frase");
				palabra = teclado.nextLine();

				if (palabra.equals("*")) {
					break;

				}

				totalfrases = (totalfrases + "\n" + palabra + "\n");

			}
			System.out.print("Haiku:\n********");

			System.out.print(totalfrases);
			System.out.println("\n¿Otro haiku? S/N");
			r = teclado.next();
			if (r.equalsIgnoreCase("n")) {
				System.out.println("Adios, gracias por usar Haiku Generator");
			}

		}

	}

}

package Simulacro2;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int numero = 0, numeros, total = 0, media = 0, negativo = 0, positivo = 0;

		Scanner teclado = new Scanner(System.in);

		System.out.println("¿Cuantos números vas a introducir?");
		numero = teclado.nextInt();
		System.out.println("Introduce " + numero + " numeros");

		for (int i = 0; i < numero; i++) {
			numeros = teclado.nextInt();
			if (numeros < 0) {
				negativo++;
			}
			if (numeros > 0) {
				positivo++;
			}

			total = numeros + total;

			media = total / numero;

		}

		System.out.println("Numero de positivos " + positivo);
		System.out.println("Numero de negativos " + negativo);
		System.out.println("Media " + media);

		teclado.close();
	}

}

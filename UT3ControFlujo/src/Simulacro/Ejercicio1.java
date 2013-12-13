package Simulacro;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado = new Scanner(System.in);

		double n = 0, total = 0, numeros = 1;

		double media;

		System.out.print("Dame 10 números\n");

		for (int i = 1; i < 11; i++) {
			System.out.print("Dame el número " + (int) numeros + "\n");
			System.out.print("---->");
			n = teclado.nextInt();

			total = total + n;
			numeros++;

		}

		media = total / 10;
		System.out.println("La media es: " + media);

	}

}

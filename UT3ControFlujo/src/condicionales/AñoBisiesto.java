package condicionales;

import java.util.Scanner;

public class A�oBisiesto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a�o;

		Scanner teclado = new Scanner(System.in);

		System.out.println("Introduce el a�o: ");

		a�o = teclado.nextInt();

		if (a�o == 0) {
			System.out.println("El a�o no es bisiesto");
		} else {

			if (a�o % 4 == 0) {
				if (a�o % 100 == 0) {
					if (a�o % 400 == 0) {
						System.out.println("El a�o es bisiesto");
					} else {
						System.out.println("El a�o no es bisiesto");
					}
				} else {
					System.out.println("El a�o es bisiesto");
				}

			} else {

				System.out.println("El a�o no es bisiesto");

			}

		}

	}

}

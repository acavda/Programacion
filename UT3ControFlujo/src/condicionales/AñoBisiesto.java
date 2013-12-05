package condicionales;

import java.util.Scanner;

public class AñoBisiesto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int año;

		Scanner teclado = new Scanner(System.in);

		System.out.println("Introduce el año: ");

		año = teclado.nextInt();

		if (año == 0) {
			System.out.println("El año no es bisiesto");
		} else {

			if (año % 4 == 0) {
				if (año % 100 == 0) {
					if (año % 400 == 0) {
						System.out.println("El año es bisiesto");
					} else {
						System.out.println("El año no es bisiesto");
					}
				} else {
					System.out.println("El año es bisiesto");
				}

			} else {

				System.out.println("El año no es bisiesto");

			}

		}

	}

}

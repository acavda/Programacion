package EjerciciosParaPracticar;

import java.util.Scanner;

public class ProgramaPensador {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * El juego de adivina el número.El programa "pensará" un número del 1
		 * al 100 que el jugador tendrá que adivinar. El programa va preguntando
		 * un número tras otro al jugador. Si el jugador dice uno mayor, el
		 * programa le dice que el número oculto es menor (y al revés si dice
		 * uno menor). El jugador tiene como máximo 10 oportunidades para
		 * adivinar el número.
		 */

		int numerodado = 0, numeroculto = 5,contador=10;

		Scanner input = new Scanner(System.in);

		for (int i = 0; i < 10; i++) {
			System.out.println("introduce el número:");
			numerodado = input.nextInt();
			if (numerodado == numeroculto) {
				System.out.println("Felicidades has adivinado el número");
				break;
			} else if (numerodado > numeroculto) {
				System.out.print("El número oculto es menor, ");
			} else if (numerodado < numeroculto) {
				System.out.print("El número oculto es mayor, ");
			}
			
			contador--;
			if(contador==0){
				System.out.print("Lo siento, no le quedan más intentos");
			}else{
			System.out.print("Le quedan "+contador+" intentos\n");}

		}

	}

}

package EjerciciosParaPracticar;

import java.util.Scanner;

public class ProgramaPensador {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * El juego de adivina el n�mero.El programa "pensar�" un n�mero del 1
		 * al 100 que el jugador tendr� que adivinar. El programa va preguntando
		 * un n�mero tras otro al jugador. Si el jugador dice uno mayor, el
		 * programa le dice que el n�mero oculto es menor (y al rev�s si dice
		 * uno menor). El jugador tiene como m�ximo 10 oportunidades para
		 * adivinar el n�mero.
		 */

		int numerodado = 0, numeroculto = 5,contador=10;

		Scanner input = new Scanner(System.in);

		for (int i = 0; i < 10; i++) {
			System.out.println("introduce el n�mero:");
			numerodado = input.nextInt();
			if (numerodado == numeroculto) {
				System.out.println("Felicidades has adivinado el n�mero");
				break;
			} else if (numerodado > numeroculto) {
				System.out.print("El n�mero oculto es menor, ");
			} else if (numerodado < numeroculto) {
				System.out.print("El n�mero oculto es mayor, ");
			}
			
			contador--;
			if(contador==0){
				System.out.print("Lo siento, no le quedan m�s intentos");
			}else{
			System.out.print("Le quedan "+contador+" intentos\n");}

		}

	}

}

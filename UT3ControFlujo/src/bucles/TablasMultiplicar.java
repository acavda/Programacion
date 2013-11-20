package bucles;

import java.util.Scanner;

public class TablasMultiplicar {

	/* pedir al usuario la tabla que quiera
	 * si pide 1 imprimir la tabla del 1
	 * si pide 2 imprimir la tabla del 2 etc
	 * */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n=0,con=0;
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("¿De que número quieres la tabla de multiplicar?");
		
		n = teclado.nextInt();
		
		
		while(con<=10){
			System.out.println(n +" * " +con+ " = "+(n*con));
			con++;
			
		}
		
	}

}

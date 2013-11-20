package bucles;

import java.util.Scanner;

public class Media_de_tres_numeros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado = new Scanner(System.in);
		
		int numero;
		int contador;
		int suma=0,media=0;
		
		System.out.println("Introduce tres números");
		
		for(int i=0;i<3;i++){
			System.out.print("");
			numero = teclado.nextInt();
			
			suma=suma+numero;
			
			
		}
		media=suma/3;
		
		System.out.println("La media es " +media);
		
		
		
		
	}

}

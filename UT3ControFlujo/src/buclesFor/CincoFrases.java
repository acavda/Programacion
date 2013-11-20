package buclesFor;

import java.util.Scanner;

public class CincoFrases {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner teclado = new Scanner(System.in);
		
		
		String  a="";
		
		
		
		for(int i=1;i<=5;i++){
			System.out.println("\nEscribe una frase");
			a = teclado.nextLine();
			System.out.println("\n"+a);	
		}
	
	}

}

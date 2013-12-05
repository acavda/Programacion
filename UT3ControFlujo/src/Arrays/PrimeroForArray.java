package Arrays;

import java.util.Scanner;

public class PrimeroForArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner teclado = new Scanner(System.in);
		
		String frases[];
		frases = new String[5];
		
		System.out.println("Dame 5 frases");
		for(int i=0;i<5;i++){
			System.out.print("--->");
			frases[i]=teclado.nextLine();}
		
		System.out.println("\nAquí las tienes:"+ "\n");
		
		for(int i=0;i<5;i++){
			
		
		System.out.print(frases[i]+", ");}
		
		
	}

}

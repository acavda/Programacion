package Arrays;

import java.util.Scanner;

public class LeerNumerosInverso {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado= new Scanner(System.in);
		
		int[] numero;
		
		numero = new int[10];
		
		for(int i=0;i<numero.length;i++)
			
			numero[i]=teclado.nextInt();
			
			
		for(int i=9;i>=0;i--)
			
			System.out.println(" "+numero[i]);
		
		
		
		
		
		
		
		
	}

}

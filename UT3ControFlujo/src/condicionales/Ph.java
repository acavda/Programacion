package condicionales;

import java.util.Scanner;

public class Ph {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		double ph;
		
		Scanner teclado = new Scanner(System.in);
		
		
		System.out.println("Dime el ph");
		ph = teclado.nextDouble();
		
		
		
		if(ph>3&&ph<7){
			
			System.out.println("La solución es ácida");
			
		}else if(ph<=3){
			
			System.out.println("La solución es peligrosamente ácida");
		}
		
	}

	}

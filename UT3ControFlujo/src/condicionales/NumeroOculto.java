package condicionales;

import java.util.Scanner;

public class NumeroOculto {

	public static void main(String[] args) {
		
		int numeroculto,numerodado;
		
		Scanner teclado = new Scanner(System.in);

		
		System.out.println("Introduce un número oculto entre 0 y 10");
		
		numerodado=teclado.nextInt();
		
		numeroculto=(int)(Math.random()*10);
		
		
		
		
		
	if(numerodado==numeroculto)	{
			
			System.out.println("Has adivinado el número, era: " +numeroculto);
			
			
			
			
		}else{
			System.out.println("No has adivinado el número, intentelo de nuevo, el número era: "+numeroculto);
			
		}
		

	}

}

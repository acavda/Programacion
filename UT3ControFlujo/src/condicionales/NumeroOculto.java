package condicionales;

import java.util.Scanner;

public class NumeroOculto {

	public static void main(String[] args) {
		
		int numeroculto,numerodado;
		
		Scanner teclado = new Scanner(System.in);

		
		System.out.println("Introduce un n�mero oculto entre 0 y 10");
		
		numerodado=teclado.nextInt();
		
		numeroculto=(int)(Math.random()*10);
		
		
		
		
		
	if(numerodado==numeroculto)	{
			
			System.out.println("Has adivinado el n�mero, era: " +numeroculto);
			
			
			
			
		}else{
			System.out.println("No has adivinado el n�mero, intentelo de nuevo, el n�mero era: "+numeroculto);
			
		}
		

	}

}

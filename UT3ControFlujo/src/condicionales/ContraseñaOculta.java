package condicionales;

import java.util.Scanner;

public class Contrase�aOculta {

	public static void main(String[] args) {
	
		
		String contrase�aoculta,contrase�adada;
		
		
		contrase�aoculta="toledo";
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Introduce la contrase�a");
		
		contrase�adada = teclado.next();
		
		
		
		if(((contrase�adada.equals(contrase�aoculta)))){
			System.out.println("Contrase�a correcta");
			
		}else{
			System.out.println("Contrase�a incorrecta");
			
		}
		
		

	}

}

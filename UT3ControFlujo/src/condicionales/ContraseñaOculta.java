package condicionales;

import java.util.Scanner;

public class ContraseñaOculta {

	public static void main(String[] args) {
	
		
		String contraseñaoculta,contraseñadada;
		
		
		contraseñaoculta="toledo";
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Introduce la contraseña");
		
		contraseñadada = teclado.next();
		
		
		
		if(((contraseñadada.equals(contraseñaoculta)))){
			System.out.println("Contraseña correcta");
			
		}else{
			System.out.println("Contraseña incorrecta");
			
		}
		
		

	}

}

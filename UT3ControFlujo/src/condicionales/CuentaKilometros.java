package condicionales;

import java.util.Scanner;

public class CuentaKilometros {

	public static void main(String[] args) {
	
		
		double tama�o,porcentaje,consumo;
		
		double autonomia;
		
		
		
		
		
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("�Que tama�o tiene tu deposito?");
		
		tama�o = teclado.nextDouble();
		
		System.out.println("�Que porcentaje de combustible tiene el deposito?");
		porcentaje = teclado.nextDouble();
		
		System.out.println("�Cuantos litros consume el coche a los 100km?");
		consumo = teclado.nextDouble();
		
		
		
		autonomia=(tama�o*porcentaje)/consumo;
		
		if(autonomia<30){
			System.out.println("\nQueda poca gasolina, ve a repostar");
			System.out.println("\nTe quedan "+ autonomia + " kilometros hasta repostar");
			
		}else if(autonomia>=30){
	
		System.out.println("Te quedan "+ autonomia + " kilometros hasta repostar");
		
		}
	}
		
		

	}



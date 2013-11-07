package ejerciciosInicial;

import java.util.Scanner;

public class Farenheit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Leer la temperatura
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Dime la temperatura en Farenheit:");
		
		double temperatura = teclado.nextDouble();
		
		
		
		//Pasar la tª a grados celsius
		
		temperatura = (temperatura-32)/1.8;
		
		//Si tª<0
		
		if(temperatura<=0){
			
			System.out.println("La temperatura es: " +temperatura+ "ºC. PELIGRO DE CONGELACIÓN");
			
		}else{
			
			System.out.println("La temperatura es: " +temperatura+ "ºC. No hay peligro de congelación");
			
		}
	}
			
}



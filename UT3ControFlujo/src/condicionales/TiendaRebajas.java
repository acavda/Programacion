package condicionales;

import java.util.Scanner;

public class TiendaRebajas {

	public static void main(String[] args) {
		
		double preciodado;
		
		Scanner teclado=new Scanner(System.in);
		
		System.out.println("Introduce el precio del producto: ");
		
		
		preciodado=teclado.nextDouble();
		if(preciodado>0){
		
			if(preciodado<20 && preciodado>0){
			
				System.out.println("El precio rebajado es: " + (preciodado-(preciodado*0.1))+"€");
				System.out.println("Se le aplica un 10% de descuento, por compras inferiores a 20€");
			
				
				}else if(preciodado>=20 && preciodado<50){
					System.out.println("El precio rebajado es: " +(preciodado-(preciodado*0.2))+"€");
					System.out.println("Se le aplica un 20% de descuento, por compras inferiores a 50€");
			
					}else if(preciodado>=50){
						System.out.println("El precio rebajado es: " +(preciodado-(preciodado*0.25)) +"€");
						System.out.println("Se le aplica un 25% de descuento, por compras superiores a 50€");
					
				}
	
		
		
		
		
		
		}else{
			System.out.println("No se admiten números negativos");
		}
		

	}

}

package ejerciciosInicial;

import java.util.Scanner;

public class Operaciones2Enteros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		double n1,n2,respuesta;

		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Dame el primer número");
		n1= teclado.nextDouble();
		
		System.out.println("Dame el segundo número");
		n2 = teclado.nextDouble();
		
		System.out.println("¿Que quieres hacer? \n-Sumar \n-Restar \n-Multiplicar \n-Dividir");
		respuesta = teclado.nextDouble();
		
			if(respuesta==1){
				System.out.println("El resultado de la suma es: " +(n1+n2));
			
				}else if(respuesta==2){
					System.out.println("El resultado de la resta es: " +(n1-n2));
				
					}else if(respuesta==3){
						System.out.println("El resultado del producto es: " +(n1*n2));
					
						}else if(respuesta==4){
						
							System.out.println("El resultado de la división es: " + (n1/n2));
								}else if(respuesta!=1||respuesta!=2||respuesta!=3||respuesta!=4){
						
									System.out.println("Error, operación no disponible.");
									}
		
		
	}

}

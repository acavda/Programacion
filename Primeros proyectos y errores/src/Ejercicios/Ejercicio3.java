package Ejercicios;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		//Calculen el perímetro y área de un rectángulo dada su base y su altura.
		//Calculen el perímetro y área de un círculo dado su radio.
		//Calculen el volumen de una esfera dado su radio.
		//Calculen el área de un rectángulo (alineado con los ejes x e y) dadas sus coordenadas x1,x2,y1,y2.
		//Dados los catetos de un triángulo rectángulo, calcular su hipotenusa.
		
		
		double base,altura,perimetro,area;
		
		Scanner teclado=new Scanner(System.in);
		
		
		System.out.println("Dame la base del rectángulo");
		
		base=teclado.nextDouble();
		
		System.out.println("Dame la altura del rectángulo");
		
		altura=teclado.nextDouble();
		
		
		perimetro=(base*2)+(altura*2);
		area=base*altura;
		
		System.out.println("El perimetro del rectangulo es " +perimetro);
		System.out.println("El perimetro del rectangulo es " +area);
		

		
		
		
		
		
		
	}

}

package Ejercicios;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		//Calculen el per�metro y �rea de un rect�ngulo dada su base y su altura.
		//Calculen el per�metro y �rea de un c�rculo dado su radio.
		//Calculen el volumen de una esfera dado su radio.
		//Calculen el �rea de un rect�ngulo (alineado con los ejes x e y) dadas sus coordenadas x1,x2,y1,y2.
		//Dados los catetos de un tri�ngulo rect�ngulo, calcular su hipotenusa.
		
		
		double base,altura,perimetro,area;
		
		Scanner teclado=new Scanner(System.in);
		
		
		System.out.println("Dame la base del rect�ngulo");
		
		base=teclado.nextDouble();
		
		System.out.println("Dame la altura del rect�ngulo");
		
		altura=teclado.nextDouble();
		
		
		perimetro=(base*2)+(altura*2);
		area=base*altura;
		
		System.out.println("El perimetro del rectangulo es " +perimetro);
		System.out.println("El perimetro del rectangulo es " +area);
		

		
		
		
		
		
		
	}

}

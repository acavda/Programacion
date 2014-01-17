package metodos;

import java.util.Scanner;

public class Grados {
	
	public static double farenheitCelsius(double farenheit){
		double celsius=0;
		
		
		
		celsius=((farenheit-32)/1.8);
		
		return celsius;
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Escriba un programa que lea temperaturas expresadas en grados Fahrenheit
//y las convierta a grados Celsius mostrándola. El programa finalizará cuando lea un valor
//de temperatura igual a 999. La conversión de grados Farenheit (F) a Celsius (C) la realizará un método
//llamado farenheitCelsius donde incluirás el código que hace la conversión (C = 5/9(F − 32)).
		double temp=0;
		Scanner teclado = new Scanner(System.in);
		
		while(temp<=999){
			
		System.out.println("Dime la temperatura en farenheit");
		temp=teclado.nextDouble();
		if(temp>999){
			break;
		}
		System.out.println("La temperatura en celsius es:" +Grados.farenheitCelsius(temp)+"\n");
		}
		
		System.out.println("\nGracias por utilizar AntConversor");
	}

}

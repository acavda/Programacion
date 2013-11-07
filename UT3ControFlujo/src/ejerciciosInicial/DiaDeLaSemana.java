package ejerciciosInicial;

import java.util.Scanner;

public class DiaDeLaSemana {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int day;
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Dime el numero del dia:");
		
		day=teclado.nextInt();
	
		if(day!=1 || day!=2 || day!=3 || day!=4 || day!=5 || day!=6 || day!=7){
		
		
		
		
		switch (day){
		
		case 1:
			System.out.println("Lunes (Dia de la Luna)");
			break;
			
		case 2:
			System.out.println("Martes (Dia de Marte)");
			break;
		case 3:
			System.out.println("Miercoles (Dia de Odín)");
			break;
		case 4:
			System.out.println("Jueves (Dia de Thor)");
			break;
		case 5:
			System.out.println("Viernes (Dia de Frey)");
			break;
		case 6:
			System.out.println("Sabado (Dia de Saturno)");
			break;
		case 7:
			System.out.println("Domingo (Dia del Sol)");
			break;
		default:
			System.out.println("La semana tiene 7 dias tronco");
			
			}
		}		
	}
}

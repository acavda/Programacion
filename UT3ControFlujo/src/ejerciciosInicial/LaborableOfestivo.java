package ejerciciosInicial;

import java.util.Scanner;

public class LaborableOfestivo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int dia;
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Dime un dia de la semana");
		dia = teclado.nextInt();
		
		if(dia<=0||dia>7){
			System.out.println("La semana tiene 7 dias");
		}else if(dia>0&&dia<7){
			
			System.out.println("El dia es laborable");
		}else if(dia==7){
			System.out.println("El dia es festivo");
			
		}
			
		
		
		
		
		
		
		
		
	}

}

package ejerciciosIniciales;
/*
 * Ejercicio 3. Realiza una clase Finanzas que convierta d�lares a euros y viceversa.
 *  Codifica los m�todos dolaresToEuros y eurosToDolares. 
 *  Prueba que dicha clase funciona correctamente haciendo conversiones entre euros y d�lares. La clase tiene que tener:

Un constructor finanzas que establecer� el cambio D�lar-Euro en 1.36.
Un constructor finanzas(double), el cual permitir� configurar el cambio D�lar-Euro.
 */

public class Finanzas {
	private double euros;
	private double dolares;
	
	Finanzas(double dolares){
		dolares=euros*1.36;
	}
	
	
	
	public double getDolares() {
		return dolares;
	}



	public void setDolares(double dolares) {
		this.dolares = dolares;
	}



	public static double dolaresToEuros(double dolares){
		double euros=0;
		
		euros=dolares*1.36;
		
		
		return euros;
		
		
		
	}
	
	public static double eurosToDolares(double euros){
		double dolares=0;
		
		dolares=euros/1.36;
		
		
		return dolares;
		
		
		
	}

}

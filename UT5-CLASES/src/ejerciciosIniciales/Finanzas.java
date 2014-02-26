package ejerciciosIniciales;
/*
 * Ejercicio 3. Realiza una clase Finanzas que convierta dólares a euros y viceversa.
 *  Codifica los métodos dolaresToEuros y eurosToDolares. 
 *  Prueba que dicha clase funciona correctamente haciendo conversiones entre euros y dólares. La clase tiene que tener:

Un constructor finanzas que establecerá el cambio Dólar-Euro en 1.36.
Un constructor finanzas(double), el cual permitirá configurar el cambio Dólar-Euro.
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

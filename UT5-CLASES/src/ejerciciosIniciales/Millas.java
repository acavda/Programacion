package ejerciciosIniciales;
/*Ejercicio 1. Crea una clase con un método estático millasAMetros que toma como parámetro
 *  de entrada un valor en millas marinas y las convierte a metros.
Una vez tengas este método escribe otro millasAKilometros que realice la misma conversión,
 pero esta vez exprese el resultado en kilómetros.

          Nota:1 milla marina equivale a 1852 metros.    */

public class Millas {
	private double millas;
	private double metros;
	
	
	public static double millasAmetros(double metro){
		double milla=0;
		
		milla= metro*1852;
		return milla;
	}
	
	public static double millasAkm(double metro){
		double milla=0;
		
		milla=(metro*1852)/1000;
		
		return milla;
		
		
		
	}
	
	
	

}

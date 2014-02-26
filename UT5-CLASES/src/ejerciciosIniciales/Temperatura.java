package ejerciciosIniciales;
/*
 * Crear la clase Temperatura, que almacena una temperatura (atributo float que almacena la temperatura en grados celsius). 
 * La clase no tiene constructores,
 *  solo los métodos: 1. getCelsius()/setCelsius(float grados).
 *   2. getFahrenheit()/setFahrnheit(float grados).
 */

public class Temperatura {
	private double celsius;
	
	public double getCelsius() {
		return celsius;
	}
	
	
	public void setCelsius(double celsius) {
		this.celsius = celsius;
	}
	
	
	
	
	//public double getFarenheit() {
	
		//return farenheit;
	//}
	public void setFarenheit(double farenheit) {
		this.celsius =(5/9)* farenheit;
		
	}
	
	

}

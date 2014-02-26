package ejerciciosIniciales;

/*
 * Ejercicio 4. Realiza una clase MiNumero que proporcione el doble, triple y 
 * cuádruple de un número proporcionado en su constructor 
 * (realiza un método para doble, otro para triple y otro para cuádruple).
 *  En este caso haz que la clase tenga un método main y comprueba los distintos métodos,
 *   sin necesidad de crear un método de prueba.
 */

public class MiNumero {
	private double numero;
	private double numero2;
	private double numero3;
	
	MiNumero(double numerodado, double numerodado1,double numerodado3){
		this.numero=numerodado;
		this.numero2=numerodado1;
		this.numero3=numerodado3;
		
		numero=numero*2
		;
		
		numero2=numero2*3;
		numero3=numero3*4;
	}
	
	
	

	public double getNumero() {
		return numero;
	}





	public void setNumero(double numero) {
		this.numero = numero;
	}

	
	
	
	

	public double getNumero2() {
		return numero2;
	}




	public void setNumero2(double numero2) {
		this.numero2 = numero2;
	}




	public double getNumero3() {
		return numero3;
	}




	public void setNumero3(double numero3) {
		this.numero3 = numero3;
	}




	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MiNumero doble = new MiNumero(2,2,2);
		
		System.out.println(doble.getNumero());
		
		System.out.println(doble.getNumero2());
		
		System.out.println(doble.getNumero3());
		
		
	}





}

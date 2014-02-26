package ejerciciosIniciales;

public class Racional {
	private int numerador;
	private int denominador;
	
	
	public Racional(){
		numerador=1;
		denominador=1;
		
	}
	
	public Racional(int num, int denom){
		this.numerador=num;
		this.denominador=denom;
	}
	
	public void suma(Racional sumando){
		int numeradort=1;
		int denominadort=1;
		numeradort=sumando.numerador*this.denominador+sumando.denominador*this.numerador;
		denominadort=sumando.denominador*this.denominador;
		
		this.numerador=numeradort;
		this.denominador=denominadort;
		
	}
	
	public void resta(Racional restando){
		int numeradort=1;
		int denominadort=1;
		numeradort=restando.numerador*this.denominador-restando.denominador*this.numerador;
		denominadort=restando.denominador*this.denominador;
		
		this.numerador=numeradort;
		this.denominador=denominadort;
		
	}
	
	public void producto(Racional multiplicando){
		int numeradort=1;
		int denominadort=1;
		numeradort=multiplicando.numerador*this.numerador;
		denominadort=multiplicando.denominador*this.denominador;
		
		this.numerador=numeradort;
		this.denominador=denominadort;
		
	}
	
	public void cociente(Racional dividiendo){
		int numeradort=1;
		int denominadort=1;
		numeradort=dividiendo.denominador*this.numerador;
		denominadort=dividiendo.numerador*this.denominador;
		
		this.numerador=numeradort;
		this.denominador=denominadort;
		
	}
	
	public void simplificar(Racional simplificando){

	}
	
	
	
	
	

	
	

	public int getNumerador() {
		return numerador;
	}

	public void setNumerador(int numerador) {
		this.numerador = numerador;
	}

	public int getDenominador() {
		return denominador;
	}

	public void setDenominador(int denominador) {
		this.denominador = denominador;
	}



	
	


}

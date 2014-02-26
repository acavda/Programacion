package ejerciciosIniciales;
/*
 * Ejercicio 5. Realiza una clase Número que almacene un número entero y tenga las siguientes características:

Constructor por defecto que inicializa a 0 el número interno.
Constructor que inicializa el número interno.
Método añade que permite sumarle un número al valor interno.
Método resta que resta un número al valor interno.
Método getValor. Devuelve el valor interno.
Método getDoble. Devuelve el doble del valor interno.
Método getTriple. Devuelve el triple del valor interno.
Método setNumero. Inicializa de nuevo el valor interno.
 */

public class Numero {
	private int numero=0;
	private int valor=0;
	private double doble=0;
	
	Numero(){
		
	}
	
	Numero(int numerodado){
		this.numero=numerodado;
		
	}
	
	
	public  int sumar(int valor){
		
		this.numero=this.numero+valor;
		this.valor=this.numero;
		
		return this.valor;
		
	}
	
	public  int restar(int valor){
		
		this.numero=this.numero-valor;
		this.valor=this.numero;
		return this.valor;
		
	}
	
	
	
	

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public int getValor() {
		return valor;
	}

	public void setValor(int valor) {
		this.valor = valor;
	}

	
	
	public double getDoble() {
		this.numero=this.numero*2;
		this.valor=this.numero;
		doble=this.valor;
		
		
		return doble;
	}

	public void setDoble(double doble) {
		this.doble = doble;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Numero num = new Numero(5);

		num.sumar(5);
		num.restar(2);
		
		System.out.println(num.getValor());
		
		System.out.println(num.getDoble());
		


	}

}

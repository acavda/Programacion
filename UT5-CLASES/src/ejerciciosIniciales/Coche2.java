package ejerciciosIniciales;

/*Ejercicio 2. Crea la clase Coche con dos constructores. Uno no toma par�metros y el otro s�.
 *  Los dos constructores inicializar�n los atributos marca y modelo de la clase.
 *  Crea dos objetos (cada objeto llama a un constructor distinto) y verifica que todo funciona correctamente.
 */

public class Coche2 {
	
	private String marca="";
	private String modelo="";
	private double gasto;
	
	
	Coche2(){
		
		
	}
	
	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	Coche2(String marca,String modelo){
		this.marca=marca;
		this.modelo=modelo;
		
	}
	
	

}
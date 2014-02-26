package ejerciciosIniciales;

/*
 * Ejercicio 7. Implementa una clase Consumo,
 *  la cual forma parte de la centralita electrónica de un coche y tiene las siguientes características:

 Atributos:

 kms. Kilómetros recorridos por el coche.
 litros. Litros de combustible consumido.
 vmed. Velocidad media.
 pgas. Precio de la gasolina.
 Métodos:

 getTiempo. Indicará el tiempo empleado en realizar el viaje.
 consumoMedio. Consumo medio del vehículo (en litros cada 100 kilómetros).
 consumoEuros. Consumo medio del vehículo (en euros cada 100 kilómetros).
 setKms
 setLitros
 setVmed
 setPgas
 No olvides crear un constructor para la clase que establezca el valor de los atributos.
  Elige el tipo de datos más apropiado para cada atributo.
 */

public class Consumo {
	private double kms;
	private double litros;
	private double vmed;
	private double pgas;
	private double tiempo;
	
	public Consumo(){
		
	}
	
	public Consumo(double kms,double litros,double vmed,double pgas){
		this.kms=kms;
		this.litros=litros;
		this.vmed=vmed;
		this.pgas=pgas;
		
	}
	
	public double consumomedio(){
		double consumo;
		consumo= (kms/litros)*100;
		return consumo;
		
		
	}
	
	public void getTiempo(){
		
		this.tiempo=kms/vmed;
	}

	public double getKms() {
		return kms;
	}

	public void setKms(double kms) {
		this.kms = kms;
	}

	public double getLitros() {
		return litros;
	}

	public void setLitros(double litros) {
		this.litros = litros;
	}

	public double getVmed() {
		return vmed;
	}

	public void setVmed(double vmed) {
		this.vmed = vmed;
	}

	public double getPgas() {
		return pgas;
	}

	public void setPgas(double pgas) {
		this.pgas = pgas;
	}

	public void setTiempo(double tiempo) {
		this.tiempo = tiempo;
	}

	public static void main(String[] args) {
		
		Consumo prueba= new Consumo(100,50,100,1.3);
		
		System.out.println(prueba.consumomedio());
		
	}
	
	
	
}

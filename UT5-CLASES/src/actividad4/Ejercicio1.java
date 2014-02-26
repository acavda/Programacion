package actividad4;

/*Ejercicio 1 Escribe una clase llamada Hora que tenga como atributos la hora, los minutos y los segundos (números enteros).
 *  Un constructor inicializará estos datos a 0 y otro los inicializará a valores pasados por parámetro. Un método de la
 *   clase devolverá la cadena con formato: 12:45:32. Otro método, que tendrá un argumento de tipo Hora, sumará dicha hora a la propia.
 *    Por ejemplo:

[...]
mihora=new Hora(12,45,32);
unahoraycuarto=new Hora(1,15,0);
mihora.suma(unahoraycuarto);
System.out.println(mihora.aCadena());
[...]

14:00:32
Para probar la clase crea un main() con dos objetos inicializados a una hora determinada.
 Crea otro sin inicializar y súmale las dos anteriores. Visualiza el valor de las dos horas y el resultante.
*/

/*
 * Ejercicio 2 Añade los métodos tick, incrementarMinuto e incrementarHora que incrementan la hora en 1 segundo,
 *  1 minuto y 1 hora respectivamente.
 *  Crea un programa que prueba el funcionamiento de estos métodos.
	Has de asegurarte de que funcionan bien los siguientes casos:
 */
public class Ejercicio1 {
	
	private int hora;
	private int minutos;
	private int segundos;
	
	Ejercicio1(){
		this.hora=0;
		this.minutos=0;
		this.segundos=0;
	}
	Ejercicio1(int hora,int minutos,int segundos){
		this.hora=hora;
		this.minutos=minutos;
		this.segundos=segundos;
	}
	@Override
	public String toString() {
		return "Ejercicio1 [hora=" + hora + ", minutos=" + minutos
				+ ", segundos=" + segundos + "]";
	}
	
	public void tick(){
		this.segundos=this.segundos+1;
		
	}
	
	public void IncrementarMinutos(){
		this.minutos=this.minutos+1;
		
	}
	
	public void Incrementarhoras(){
		this.hora=this.hora+1;
		
	}
	
	public static void main(String[] args) {
		Ejercicio1 prueba = new Ejercicio1(20,50,50);
		System.out.println(prueba.toString());
		
		
		prueba.tick();
		prueba.IncrementarMinutos();
		prueba.Incrementarhoras();
		System.out.println(prueba.toString());
		
		
	}
	

}

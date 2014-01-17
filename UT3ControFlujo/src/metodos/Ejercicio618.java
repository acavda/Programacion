package metodos;
import java.util.*;

public class Ejercicio618 {
	public static void  cuadrado(int numero,char car){
		for(int i=0;i<numero;i++){
			
			for(int j=0;j<numero;j++){
				System.out.print(" "+car+" ");
				
			}
			System.out.println("");
		}
		
	}

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		int num=0;
		char caracter;
		String nombre;

		System.out.println("Dame el número del lado del cuadrado y el tipo de caracter");
		num=teclado.nextInt();
		nombre=teclado.next();
		
		teclado.close();
		
		caracter=nombre.charAt(0);
		
		Ejercicio618.cuadrado(num,caracter);
		
		
		
		
	}

}

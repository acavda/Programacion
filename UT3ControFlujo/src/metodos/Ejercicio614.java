package metodos;
import java.io.*;
import java.util.*;

public class Ejercicio614 {
	public static int enteroPotencia(int numero, int potencia){
		int base=numero;
		
		for(int i=1;i<potencia;i++){
			numero=numero*base;
		}
		
		return numero;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner teclado = new Scanner(System.in);

	int numero,exponente;
		
		System.out.println("Dame un numero y su exponente de la siguiente fomra x n");
		numero=teclado.nextInt();
		exponente=teclado.nextInt();
		
		System.out.println("El resultado es: " +enteroPotencia(numero,exponente));
		
		
		
	}

}

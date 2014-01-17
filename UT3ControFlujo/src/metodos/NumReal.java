package metodos;
import java.io.*;
import java.util.Scanner;

public class NumReal {
	
	public static int redondeo (double numero){
		
		int redondear=(int) Math.floor(numero+0.5);
		
		return redondear;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		
		double num=0;
		
		while (true){
		
		System.out.println("Dame un número real: ");
		num=teclado.nextDouble();
		
		System.out.println("El número redondeado es: " +NumReal.redondeo(num)+"\n");
		
		}
		
	}

}

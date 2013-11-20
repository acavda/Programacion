package bucles;

import java.util.Scanner;

public class NumerosAleatorios {

	public static void main(String[] args) {
		int numerodado,contador=0,total=1,n=0;
		
		
		Scanner teclado= new Scanner(System.in);
		
	
		
		
		while(true){
			System.out.println("Introduce el número");
			numerodado= teclado.nextInt();
			
			if(n==0&&numerodado==0){
				total=0;
				break;
			}
			
			if(numerodado==0){
				break;
			}else{
				total=total*numerodado;
				contador++;
				n=1;
			}
		}
		System.out.println(contador+" numeros");
		
		
		System.out.println("El total es : "+total);
		
	}}

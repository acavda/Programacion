package metodos;

import java.util.Scanner;

import graphics.Rectangle;

public class NumeroAleatorio {
	
	
	

	
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int tama�o = teclado.nextInt();
		for(int i=0;i<tama�o;i++){
			lineaAleatorios(tama�o);
		}
		
		
		
		
	}
	
	public static void numero(){
		int n;
		
		n= (int)(Math.random()*10);
		System.out.print(n);
		
	}
	
	public static void lineaAleatorios(int tam){
		for(int j=0;j<tam;j++){
			numero();
		}
		System.out.println();
		
	}

}

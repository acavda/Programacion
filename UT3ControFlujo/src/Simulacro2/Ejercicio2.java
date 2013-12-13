package Simulacro2;

import java.util.Scanner;

import graphics.Color;
import graphics.Rectangle;
import graphics.Text;
import graphics.Ellipse;
import graphics.Line;
import graphics.Canvas;

public class Ejercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner teclado = new Scanner(System.in);
		
		int tamaño=0,nfiguras;
		System.out.println("Que tamaño quieres de lienzo?");
		tamaño=teclado.nextInt();
		System.out.println("Cuantas figuras quieres?");
		
		
		
		
		Canvas lienzo;
		
		Rectangle lienzos = new Rectangle(0,0,tamaño,tamaño);
		
		for(nfiguras=teclado.nextInt();nfiguras>0;nfiguras--){
			
			int posicionx,posiciony,tamañox,tamañoy;
			
			posicionx=(int)(Math.random()*100);
			
			posiciony=(int)(Math.random()*100);
			
			tamañox=(int)(Math.random()*100);
			tamañoy=(int)(Math.random()*100);
			
			switch(nfiguras){
				
				case 1:
					Ellipse circulo = new Ellipse(posicionx,posiciony,tamañox,tamañoy);
					circulo.draw();
					circulo.fill();
					break;
					
				case 2:
					Rectangle cuadrao = new Rectangle(posicionx,posiciony,tamañox,tamañoy);
					cuadrao.draw();
					cuadrao.fill();
					break;
				case 3:
					Text daw = new Text(posicionx,posiciony,"DAW");
					daw.draw();
					break;
			
			
			
			
			}
			
		}
		
		
		
		
		
		
		
		
		
		
	}

}

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
		
		int tama�o=0,nfiguras;
		System.out.println("Que tama�o quieres de lienzo?");
		tama�o=teclado.nextInt();
		System.out.println("Cuantas figuras quieres?");
		
		
		
		
		Canvas lienzo;
		
		Rectangle lienzos = new Rectangle(0,0,tama�o,tama�o);
		
		for(nfiguras=teclado.nextInt();nfiguras>0;nfiguras--){
			
			int posicionx,posiciony,tama�ox,tama�oy;
			
			posicionx=(int)(Math.random()*100);
			
			posiciony=(int)(Math.random()*100);
			
			tama�ox=(int)(Math.random()*100);
			tama�oy=(int)(Math.random()*100);
			
			switch(nfiguras){
				
				case 1:
					Ellipse circulo = new Ellipse(posicionx,posiciony,tama�ox,tama�oy);
					circulo.draw();
					circulo.fill();
					break;
					
				case 2:
					Rectangle cuadrao = new Rectangle(posicionx,posiciony,tama�ox,tama�oy);
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

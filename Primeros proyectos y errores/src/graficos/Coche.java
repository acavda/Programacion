package graficos;

import graphics.Canvas;
import graphics.Rectangle;
import graphics.Color;
import graphics.Line;
import graphics.Ellipse;

public class Coche {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

	
		int x=0;
		
		Canvas lienzo;
		Rectangle rectangulo;
		Rectangle ventanas;
		Rectangle luz;
		Rectangle luz2;
		Rectangle ventana1;
		Rectangle ventana2;
		Rectangle aleron;
		Rectangle aleron1;
		Ellipse ruedas;
		Ellipse ruedas2;
		lienzo = Canvas.getInstance();
		Line suelo;
		
		suelo = new Line(10,160,1000,160);
		suelo.draw();
		
		rectangulo = new Rectangle(80,80,250,60);
		rectangulo.draw();
		
		ventanas = new Rectangle(160,50,100,50);
		ventanas.draw();
		
		ruedas = new Ellipse(100,110,50,50);
		ruedas.draw();
		
		ruedas2 = new Ellipse(260,110,50,50);
		ruedas2.draw();
		
		luz = new Rectangle(310,95,20,20);
		luz.draw();
		
		luz2 = new Rectangle(80,95,10,10);
		luz2.draw();
		
		ventana1= new Rectangle(170,55,35,25);
		ventana1.draw();
		
		ventana2= new Rectangle(215,55,35,25);
		ventana2.draw();
		
		aleron= new Rectangle(70,50,40,10);
		aleron.draw();
		
		aleron1= new Rectangle(90,60,5,20);
		aleron1.draw();
		
		rectangulo.setColor(Color.GREEN); //pinto el borde
		rectangulo.fill();  //pinto el fondo
		
		ventanas.setColor(Color.GREEN);
		ventanas.fill();
		
		ruedas.setColor(Color.BLACK);
		ruedas.fill();
		
		ruedas2.setColor(Color.BLACK);
		ruedas2.fill();
		
		luz.setColor(Color.YELLOW);
		luz.fill();
		
		luz2.setColor(Color.RED);
		luz2.fill();
		
		ventana1.setColor(Color.WHITE);
		ventana1.fill();
		
		ventana2.setColor(Color.WHITE);
		ventana2.fill();
		
		aleron.setColor(Color.BLACK);
		aleron.fill();
		
		aleron1.setColor(Color.BLACK);
		aleron1.fill();
		
		while (85==85) {
			while (x<130) {
				
				Thread.sleep(10);
				
				rectangulo.translate(5, 0);
				ventanas.translate(5, 0);
				ruedas.translate(5, 0);
				ruedas2.translate(5, 0);
				luz.translate(5, 0);
				luz2.translate(5, 0);
				ventana1.translate(5, 0);
				ventana2.translate(5, 0);
				aleron.translate(5, 0);
				aleron1.translate(5, 0);
				x++;
				
				}
				
				
				while (x>0) {
					
					Thread.sleep(10);
					
					rectangulo.translate(-5, 0);
					ventanas.translate(-5, 0);
					ruedas.translate(-5, 0);
					ruedas2.translate(-5, 0);
					luz.translate(-5, 0);
					luz2.translate(-5, 0);
					ventana1.translate(-5, 0);
					ventana2.translate(-5, 0);
					aleron.translate(-5, 0);
					aleron1.translate(-5, 0);
					x--;
					
					}
			
			
			
			
			
			
			
			
			
			
			
			
			
			
		}
		

		
		
		
		
	
		

		
		
		
		
		
		
	}

}

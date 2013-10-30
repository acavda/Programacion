package graficos;

import graphics.Canvas;
import graphics.Color;
import graphics.Ellipse;
import graphics.Rectangle;
import graphics.Text;

public class Semaforo {

	public static void main(String[] args) throws InterruptedException {
		
		
		Canvas lienzo;
		Ellipse circulo;
		Rectangle rectangulo;
		Text  texto;
	
		
		texto = new Text(550,550,"Hola");
		lienzo = Canvas.getInstance();
		
		rectangulo = new Rectangle(48,35,55,500);
		
		rectangulo.draw();
		
		rectangulo.setColor(Color.DARK_GRAY);
		rectangulo.fill();

		circulo = new Ellipse(50,50,50,50);
		
		circulo.draw();
		
		circulo.setColor(Color.BLACK);
		circulo.fill();
		
		
		
		circulo = new Ellipse(50,150,50,50);
		
		circulo.draw();
		circulo.setColor(Color.BLACK);
		circulo.fill();
		
		circulo = new Ellipse(50,250,50,50);
		
		circulo.draw();
		circulo.setColor(Color.BLACK);
		circulo.fill();
		
		
		Thread.sleep(1000);
		
		circulo = new Ellipse(50,50,50,50);
		
		circulo.draw();
		
		circulo.setColor(Color.RED);
		circulo.fill();
		
		Thread.sleep(1000);
		
		circulo = new Ellipse(50,50,50,50);
		
		circulo.draw();
		
		circulo.setColor(Color.BLACK);
		circulo.fill();
		
		
		
		Thread.sleep(1000);
		
		circulo = new Ellipse(50,150,50,50);
		
		circulo.draw();
		circulo.setColor(Color.ORANGE);
		circulo.fill();
		
		Thread.sleep(1000);
		
		circulo = new Ellipse(50,150,50,50);
		
		circulo.draw();
		circulo.setColor(Color.BLACK);
		circulo.fill();
		
		lienzo = Canvas.getInstance();
		
		Thread.sleep(1000);
		
		circulo = new Ellipse(50,250,50,50);
		
		circulo.draw();
		circulo.setColor(Color.GREEN);
		circulo.fill();
		
		
	
		
		
	 
	}

}
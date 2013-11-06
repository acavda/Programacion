package graficos;

import graphics.Canvas;
import graphics.Color;
import graphics.Ellipse;
import graphics.Rectangle;
import graphics.Text;

public class SemaforoCalculos {

	public static void main(String[] args) throws InterruptedException {
		
		
		Canvas lienzo;
		Ellipse circulo;
		Rectangle rectangulo;
		Text  texto;
		int ancho,alto,centrox,centroy,diametrodisco,altoposte,anchoposte;
		
		altoposte=500;
		ancho=(altoposte/10);
		alto=(altoposte/10);
		centrox=300;
		centroy=300;
		diametrodisco=ancho/2;
		
		anchoposte=altoposte/9;
		
		texto = new Text(130,100,"Semáforo 3.0");
		texto.draw();
		lienzo = Canvas.getInstance();
		
		rectangulo = new Rectangle(48,35,anchoposte,altoposte);
		
		rectangulo.draw();
		
		rectangulo.setColor(Color.DARK_GRAY);
		rectangulo.fill();

		circulo = new Ellipse(50,50,ancho,alto);
		
		circulo.draw();
		
		circulo.setColor(Color.BLACK);
		circulo.fill();
		
		
		
		circulo = new Ellipse(50,150,ancho,alto);
		
		circulo.draw();
		circulo.setColor(Color.BLACK);
		circulo.fill();
		
		circulo = new Ellipse(50,250,ancho,alto);
		
		circulo.draw();
		circulo.setColor(Color.BLACK);
		circulo.fill();
		
		
		Thread.sleep(1000);
		
		circulo = new Ellipse(50,50,ancho,alto);
		
		circulo.draw();
		
		circulo.setColor(Color.RED);
		circulo.fill();
		
		Thread.sleep(1000);
		
		circulo = new Ellipse(50,50,ancho,alto);
		
		circulo.draw();
		
		circulo.setColor(Color.BLACK);
		circulo.fill();
		
		
		
		Thread.sleep(1000);
		
		circulo = new Ellipse(50,150,ancho,alto);
		
		circulo.draw();
		circulo.setColor(Color.ORANGE);
		circulo.fill();
		
		Thread.sleep(1000);
		
		circulo = new Ellipse(50,150,ancho,alto);
		
		circulo.draw();
		circulo.setColor(Color.BLACK);
		circulo.fill();
		
		lienzo = Canvas.getInstance();
		
		Thread.sleep(1000);
		
		circulo = new Ellipse(50,250,ancho,alto);
		
		circulo.draw();
		circulo.setColor(Color.GREEN);
		circulo.fill();
		
		Thread.sleep(1000);
		
		circulo = new Ellipse(50,250,ancho,alto);
		
		circulo.draw();
		circulo.setColor(Color.BLACK);
		circulo.fill();
		
		
		
		
		
		
		while (true){
		circulo = new Ellipse(50,150,ancho,alto);
		circulo.draw();
		circulo.setColor(Color.ORANGE);
		circulo.fill();
		
		circulo = new Ellipse(50,150,ancho,alto);
		circulo.draw();
		circulo.setColor(Color.BLACK);
		circulo.fill();
		
		
		
		
		}
	 
	}

}
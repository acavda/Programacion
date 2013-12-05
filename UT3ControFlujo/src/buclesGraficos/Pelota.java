package buclesGraficos;
import java.util.Scanner;

import graphics.Canvas;
import graphics.Rectangle;
import graphics.Color;
import graphics.Line;
import graphics.Ellipse;
import graphics.Text;

public class Pelota{ 	
	

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
	
		Canvas pantalla;
		
		Canvas.getInstance();
		
		int x=20,y=20,ancho=150,alto=150;
		
		int z=-1,w=0;
		
		int mov=0;
		Rectangle cuadrao = new Rectangle(5,5,600,600);
		cuadrao.draw();
		cuadrao.setColor(Color.GREEN);
		cuadrao.fill();
		
		Ellipse pelota = new Ellipse(x,y,ancho,alto);
		Ellipse pelota2= new Ellipse(x+55,y+52,ancho-100,alto-100);
		pelota.draw();
		pelota.setColor(Color.BLACK);
		pelota.fill();
		
		pelota2.draw();
		pelota2.setColor(Color.WHITE);
		pelota2.fill();
		
		Text ocho = new Text(x+80,y+70,"8");
		ocho.draw();
		ocho.grow(15, 20);
		
		
		while(true){
			while(mov<87){
				Thread.sleep(15);
				pelota.translate(5, 2);
				pelota2.translate(5, 2);
				ocho.translate(5, 2);
				
				
				mov=mov+1;
			}
			
			while(mov>-4){
				Thread.sleep(15);
				pelota.translate(-5, 2);
				pelota2.translate(-5, 2);
				ocho.translate(-5, 2);
				
				mov=mov-1;
				
			}
			
			while(mov<87){
				Thread.sleep(15);
				pelota.translate(5, -2);
				pelota2.translate(5, -2);
				ocho.translate(5, -2);
		
				mov=mov+1;
			}
			
			while(mov>-4){
				Thread.sleep(15);
				pelota.translate(-5, -2);
				pelota2.translate(-5,-2);
				ocho.translate(-5, -2);
				
				mov=mov-1;
				
			}	
			
		}
		
	}
}
	
	

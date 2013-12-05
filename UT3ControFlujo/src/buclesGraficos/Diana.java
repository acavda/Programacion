package buclesGraficos;

import java.util.Scanner;

import graphics.Canvas;
import graphics.Rectangle;
import graphics.Color;
import graphics.Line;
import graphics.Ellipse;
import graphics.Text;

public class Diana {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Canvas pantalla;	
		
		Ellipse c0,c1,c2,c3,c4,c5,c6,c7,c8,c9;
		
		
			
		Canvas.getInstance();
		
		c0 = new Ellipse(100,100,100,100);
		c0.draw();

		
		c1 = new Ellipse(110,110,80,80);
		c1.draw();
		
		c2 = new Ellipse(115,115,70,70);
		c2.draw();
		
		c3= new Ellipse(120,120,60,60);
		c3.draw();
		
		c4 = new Ellipse(125,125,50,50);
		c4.draw();
		
		c5 = new Ellipse(130,130,40,40);
		c5.draw();
		
		c6 = new Ellipse(135,135,30,30);
		c6.draw();
		
		c7 = new Ellipse(140,140,20,20);
		c7.draw();
		
		c8 = new Ellipse(145,145,10,10);
		c8.draw();
		
		c9 = new Ellipse(105,105,90,90);
		c9.draw();
	
		
}}

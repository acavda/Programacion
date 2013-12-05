package buclesGraficos;
import java.util.Scanner;

import graphics.Canvas;
import graphics.Rectangle;
import graphics.Color;
import graphics.Line;
import graphics.Ellipse;
import graphics.Text;
public class Diana2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Ellipse circulo;
		
		Color color;
		
		int x=25,y=25,t1=500,t2=500,i=0;
		
		
		
		while(i<10){
			
			circulo = new Ellipse(x,y,t1,t2);
			circulo.draw();
			
			x=x+25;
			y=y+25;
			
			t1=t1-50;
			t2=t2-50;
			
			color =new Color((int)(Math.random()*256),(int)(Math.random()*25),(int)(Math.random()*256));
			
			circulo.setColor(color);
			circulo.fill();
			i++;
			
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
	}

}

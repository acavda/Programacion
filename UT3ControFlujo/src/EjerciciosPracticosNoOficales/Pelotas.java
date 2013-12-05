package EjerciciosPracticosNoOficales;

import java.util.Scanner;

import graphics.Color;
import graphics.Rectangle;
import graphics.Text;
import graphics.Ellipse;
import graphics.Line;
import graphics.Canvas;

public class Pelotas {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		
		
		int tamañopelota=20,movx=(int)(Math.random()*4+1),movy=(int)(Math.random()*3+2);
		
		int movx2=(int)(Math.random()*5),movy2=(int)(Math.random()*3+2),
		movx3=(int)(Math.random()*4+1),movy3=(int)(Math.random()*3+2),
		movx4=(int)(Math.random()*4+1),movy4=(int)(Math.random()*3+2),
		movx5=(int)(Math.random()*4+1),movy5=(int)(Math.random()*3+2),
		movx6=(int)(Math.random()*4+1),movy6=(int)(Math.random()*3+2),
		movx7=(int)(Math.random()*4+1),movy7=(int)(Math.random()*3+2),
		movx8=(int)(Math.random()*4+1),movy8=(int)(Math.random()*3+2);
			
		Color color = new Color(51, 152, 96);
		Color color2 = new Color(53, 94, 59);
		Color color3 = new Color(150, 75, 0);
		
		Rectangle fondo = new Rectangle(0,0,400,500);
		fondo.draw();
		fondo.setColor(color);
		fondo.fill();
		
		Rectangle fondo2 = new Rectangle(0,0,400,500);
		fondo2.draw();
		Rectangle fondo3 = new Rectangle(1,1,400,500);
		fondo3.draw();
		
		Rectangle fondo4 = new Rectangle(2,2,400,500);
		fondo4.draw();
		
		
		
		
		
		
		Text oasis = new Text(190,200,"PUB");
		oasis.draw();
		oasis.setColor(Color.ORANGE);
		oasis.grow(40, 10);
		
		Text oasis1 = new Text(190,230,"OASIS");
		oasis1.draw();
		oasis1.setColor(Color.ORANGE);
		oasis1.grow(80, 20);
		
		Ellipse pelota9= new Ellipse(200,400,10,10);
		pelota9.draw();
		pelota9.setColor(Color.WHITE);
		pelota9.fill();
		
		Ellipse hoyo1 = new Ellipse(-5,-5,25,25);
		hoyo1.draw();
		hoyo1.setColor(color2);
		hoyo1.fill();
		
		Ellipse hoyo2 = new Ellipse(400-25,-5,25,25);
		hoyo2.draw();
		hoyo2.setColor(color2);
		hoyo2.fill();
		
		Ellipse hoyo3 = new Ellipse(400-25,250-25/2,25,25);
		hoyo3.draw();
		hoyo3.setColor(color2);
		hoyo3.fill();
		
		Ellipse hoyo4 = new Ellipse(-5,250-25/2,25,25);
		hoyo4.draw();
		hoyo4.setColor(color2);
		hoyo4.fill();
		
		Ellipse hoyo5 = new Ellipse(-5,500-25,25,25);
		hoyo5.draw();
		hoyo5.setColor(color2);
		hoyo5.fill();
		
		Ellipse hoyo6 = new Ellipse(400-25,500-25,25,25);
		hoyo6.draw();
		hoyo6.setColor(color2);
		hoyo6.fill();
		
		
		
		
		
		Ellipse pelota1= new Ellipse(200,50,tamañopelota,tamañopelota);
		pelota1.draw();
		pelota1.setColor(Color.ORANGE);
		pelota1.fill();
		
		Ellipse pelota2= new Ellipse(210,70,tamañopelota,tamañopelota);
		pelota2.draw();
		pelota2.setColor(Color.RED);
		pelota2.fill();
		
		Ellipse pelota3= new Ellipse(190,70,tamañopelota,tamañopelota);
		pelota3.draw();
		pelota3.setColor(Color.RED);
		pelota3.fill();
		
		Ellipse pelota4= new Ellipse(200,90,tamañopelota,tamañopelota);
		pelota4.draw();
		pelota4.setColor(Color.RED);
		pelota4.fill();
		
		Ellipse pelota5= new Ellipse(180,50,tamañopelota,tamañopelota);
		pelota5.draw();
		pelota5.setColor(Color.ORANGE);
		pelota5.fill();
		
		Ellipse pelota6= new Ellipse(220,50,tamañopelota,tamañopelota);
		pelota6.draw();
		pelota6.setColor(Color.ORANGE);
		pelota6.fill();
		
		Ellipse pelota7= new Ellipse(200,70,tamañopelota,tamañopelota);
		pelota7.draw();
		pelota7.setColor(Color.BLACK);
		pelota7.fill();
		
		Ellipse pelota8= new Ellipse(200,400,tamañopelota-5,tamañopelota-5);
		pelota8.draw();
		pelota8.setColor(Color.WHITE);
		pelota8.fill();
		
		Rectangle palo = new Rectangle(204,470,5,150);
		palo.draw();
		palo.setColor(color3);
		palo.fill();
		Rectangle ppalo = new Rectangle(204,460,5,15);
		ppalo.draw();
		ppalo.setColor(Color.BLACK);
		ppalo.fill();
		
		
		
		for(int i=0;i<10;i++){
			
			Thread.sleep(10);
			palo.translate(0, -5);
			ppalo.translate(0, -5);
		}
		
		for(int i=0;i<25;i++){
			
			Thread.sleep(5);
			palo.translate(0, 5);
			ppalo.translate(0, 5);
		}
		
		for(int i=0;i<60;i++){
		
			Thread.sleep(10);
			pelota8.translate(0, -5);
		}
		
		
		
		while(true){
			Thread.sleep(10);
			pelota1.translate(movx, movy);
			pelota2.translate(movx2, movy2);
			pelota3.translate(movx3, movy3);
			pelota4.translate(movx4, movy4);
			pelota5.translate(movx5, movy5);
			pelota6.translate(movx6, movy6);
			pelota7.translate(movx7, movy7);
			pelota8.translate(movx8, movy8);
			
			if ((pelota1.getX()+tamañopelota+1 > 400) || pelota1.getX() < 0)//+tamañopelota con eso cuadra
				movx = -movx;
			if ((pelota1.getY()+tamañopelota+1 > 500) || pelota1.getY() < 0)
				movy = -movy;
			
			if ((pelota2.getX()+tamañopelota+1 > 400) || pelota2.getX() < 0)//+tamañopelota con eso cuadra
				movx2 = -movx2;
			if ((pelota2.getY()+tamañopelota+1 > 500) || pelota2.getY() < 0)
				movy2 = -movy2;
			
			if ((pelota3.getX()+tamañopelota+1 > 400) || pelota3.getX() < 0)//+tamañopelota con eso cuadra
				movx3 = -movx3;
			if ((pelota3.getY()+tamañopelota+1 > 500) || pelota3.getY() < 0)
				movy3 = -movy3;
			
			if ((pelota4.getX()+tamañopelota+1 > 400) || pelota4.getX() < 0)//+tamañopelota con eso cuadra
				movx4 = -movx4;
			if ((pelota4.getY()+tamañopelota+1 > 500) || pelota4.getY() < 0)
				movy4 = -movy4;
			
			if ((pelota5.getX()+tamañopelota+1 > 400) || pelota5.getX() < 0)//+tamañopelota con eso cuadra
				movx5= -movx5;
			if ((pelota5.getY()+tamañopelota+1 > 500) || pelota5.getY() < 0)
				movy5 = -movy5;
			
			if ((pelota6.getX()+tamañopelota+1 > 400) || pelota6.getX() < 0)//+tamañopelota con eso cuadra
				movx6 = -movx6;
			if ((pelota6.getY()+tamañopelota+1 > 500) || pelota6.getY() < 0)
				movy6 = -movy6;
			
			if ((pelota7.getX()+tamañopelota+1 > 400) || pelota7.getX() < 0)//+tamañopelota con eso cuadra
				movx7 = -movx7;
			if ((pelota7.getY()+tamañopelota+1 > 500) || pelota7.getY() < 0)
				movy7 = -movy7;
			
			if ((pelota8.getX()+tamañopelota+1 > 400) || pelota8.getX() < 0)//+tamañopelota con eso cuadra
				movx8 = -movx8;
			if ((pelota8.getY()+tamañopelota+1 > 500) || pelota8.getY() < 0)
				movy8 = -movy8;
			
			
			
		}
		
		
		
	}

}

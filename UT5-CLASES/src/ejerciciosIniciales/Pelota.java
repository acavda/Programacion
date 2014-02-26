package ejerciciosIniciales;
import graphics2.*;

import java.util.*;

public class Pelota {
	
	private double radio;
	private double movimiento;
	private int color;
	private double limites;
	private static Ellipse balon;
	
	public double getRadio() {
		return radio;
	}
	public void setRadio(double radio) {
		this.radio = radio;
		
		Ellipse pelota1= new Ellipse(10,100,radio,radio);
		balon=pelota1;
	}
	public double getMovimiento() {
		return movimiento;
	}
	public void setMovimiento(double movimiento) {
		this.movimiento = movimiento;
	}
	public int getColor() {
		return color;
	}
	public void setColor(int color) {
		
		this.color = color;
	}
	public double getLimites() {
		return limites;
	}
	public void setLimites(double limite1,double limite2,double limite3,double limite4) {
		Rectangle limite= new Rectangle(limite1,limite2,limite3,limite4);
		
		limite.draw();
	}

	public static void dibujar(){
	
		balon.draw();
		balon.fill();
		
		
	}
	
	public void mover() throws Exception{
		double velx=3;
		double vely=5;
		while(true){
		balon.translate(velx, vely);
		Thread.sleep(10);
		if(balon.getX()>=500-10-30){
			velx=-velx;
		}
		
		if(balon.getX()<=10){
			velx=-velx;
		}
		
		if(balon.getY()>=500-10-30){
			vely=-vely;
		}
		
		if(balon.getY()<=10){
			vely=-vely;
		}
		
		}
		
		
		
	}
	
	
	
	
	
	
	
}

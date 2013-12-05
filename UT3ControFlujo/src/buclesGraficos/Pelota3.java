package buclesGraficos;
import java.util.Scanner;

import graphics.Canvas;
import graphics.Rectangle;
import graphics.Color;
import graphics.Line;
import graphics.Ellipse;
import graphics.Text;
public class Pelota3 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		Scanner teclado = new Scanner(System.in);
		int tamaņopelota=0;
		System.out.println("Que tamaņo quieres de pelota?");
		tamaņopelota=teclado.nextInt();
		
		Ellipse pelota = new Ellipse(0,0,tamaņopelota,tamaņopelota);
		pelota.draw();
		pelota.setColor(Color.RED);
		pelota.fill();
		
		Rectangle cuadrao = new Rectangle(0,0,500,500);
		cuadrao.draw();
		
		
		int mov=2,movy=5;
		
		while(true){
			pelota.translate(mov, movy);
			Thread.sleep(10);
			
			if ((pelota.getX()+tamaņopelota > 500) || pelota.getX() < 0)//+tamaņopelota con eso cuadra
				mov = -mov;
			if ((pelota.getY()+tamaņopelota > 500) || pelota.getY() < 0)
				movy = -movy;
		}
		
		
		
		
		
		
	}

}

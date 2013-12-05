package buclesGraficos;

import java.util.Scanner;

import graphics.Canvas;
import graphics.Rectangle;
import graphics.Color;
import graphics.Line;
import graphics.Ellipse;
import graphics.Text;

public class Pelota2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		Canvas pantalla;

		Canvas.getInstance();

		int x = 10, y = 20, ancho = 150, alto = 150;

		int z = -1, w = 0;

		Color color = new Color(68, 148, 74);

		Ellipse hoyo, hoyo2, hoyo3, hoyo4, hoyo5, hoyo6, hoyo7;

		int mov = 8, movy = 5, movx1 = 6, movy1 = 5, movx2 = 2, movy2 = 4, movx3 = 4, movy3 = 3, movx4 = 5, movy4 = 2, movx5 = 4, movy5 = 4;

		Rectangle cuadrao = new Rectangle(5, 5, 600, 600);
		cuadrao.draw();
		cuadrao.setColor(color);
		cuadrao.fill();

		hoyo = new Ellipse(0, 0, 25, 25);
		hoyo.draw();
		hoyo.fill();

		hoyo2 = new Ellipse(590, 0, 25, 25);
		hoyo2.draw();
		hoyo2.fill();

		hoyo3 = new Ellipse(590, 590, 25, 25);
		hoyo3.draw();
		hoyo3.fill();

		hoyo4 = new Ellipse(0, 590, 25, 25);
		hoyo4.draw();
		hoyo4.fill();

		hoyo5 = new Ellipse(0, 290, 25, 25);
		hoyo5.draw();
		hoyo5.fill();

		hoyo6 = new Ellipse(590, 290, 25, 25);
		hoyo6.draw();
		hoyo6.fill();

		hoyo6 = new Ellipse(290, 500, 25, 25);
		hoyo6.draw();
		hoyo6.fill();
		hoyo6.setColor(Color.WHITE);

		Text oasis = new Text(290, 70, "PUB");
		oasis.draw();
		oasis.grow(70, 20);
		oasis.setColor(Color.YELLOW);

		Text oasis2 = new Text(287, 105, "OASIS");
		oasis2.draw();
		oasis2.grow(100, 20);
		oasis2.setColor(Color.YELLOW);

		Text sanpablo = new Text(230, 165, "SAN PABLO DE LOS MONTES");
		sanpablo.draw();
		sanpablo.grow(100, 20);
		sanpablo.setColor(Color.YELLOW);

		Ellipse pelota = new Ellipse(x, y, ancho, alto);
		Ellipse pelota2 = new Ellipse(x + 55, y + 52, ancho - 100, alto - 100);
		pelota.draw();
		pelota.setColor(Color.BLACK);
		pelota.fill();

		pelota2.draw();
		pelota2.setColor(Color.WHITE);
		pelota2.fill();

		Text ocho = new Text(x + 80, y + 70, "8");
		ocho.draw();
		ocho.grow(15, 20);

		Ellipse pelota3 = new Ellipse(290, 60, 80, 80);
		pelota3.draw();
		pelota3.fill();
		pelota3.setColor(Color.WHITE);

		Ellipse pelota4 = new Ellipse(50, 50, 80, 80);
		pelota4.draw();
		pelota4.fill();
		pelota4.setColor(Color.RED);

		Ellipse pelota5 = new Ellipse(50, 50, 80, 80);
		pelota5.draw();
		pelota5.fill();
		pelota5.setColor(Color.ORANGE);

		Ellipse pelota6 = new Ellipse(50, 50, 80, 80);
		pelota6.draw();
		pelota6.fill();
		pelota6.setColor(Color.ORANGE);

		Ellipse pelota7 = new Ellipse(50, 50, 80, 80);
		pelota7.draw();
		pelota7.fill();
		pelota7.setColor(Color.RED);

		while (true) {

			pelota.translate(mov, movy);// PARA QUE SE MUEVA
			pelota2.translate(mov, movy);
			ocho.translate(mov, movy);
			pelota3.translate(movx1, movy1);
			pelota4.translate(movx2, movy2);
			pelota5.translate(movx3, movy3);
			pelota6.translate(movx4, movy4);
			pelota7.translate(movx5, movy5);

			if ((pelota.getX() > 450) || pelota.getX() < 0)
				mov = -mov;
			if ((pelota.getY() > 450) || pelota.getY() < 0)
				movy = -movy;

			Thread.sleep(3);
			if ((pelota3.getX() > 450) || pelota.getX() < 0)
				movx1 = -movx1;
			if ((pelota3.getY() > 450) || pelota.getY() < 0)
				movy1 = -movy1;
			Thread.sleep(1);

			if ((pelota4.getX() > 450) || pelota.getX() < 0)
				movx2 = -movx2;
			if ((pelota4.getY() > 450) || pelota.getY() < 0)
				movy2 = -movy2;
			Thread.sleep(3);

			if ((pelota5.getX() > 450) || pelota.getX() < 0)
				movx3 = -movx3;
			if ((pelota5.getY() > 450) || pelota.getY() < 0)
				movy3 = -movy3;
			Thread.sleep(3);

			if ((pelota6.getX() > 450) || pelota.getX() < 0)
				movx4 = -movx4;
			if ((pelota6.getY() > 450) || pelota.getY() < 0)
				movy4 = -movy4;
			Thread.sleep(3);

			if ((pelota7.getX() > 450) || pelota.getX() < 0)
				movx5 = -movx5;
			if ((pelota7.getY() > 450) || pelota.getY() < 0)
				movy5 = -movy5;
			Thread.sleep(3);

		}
	}
}

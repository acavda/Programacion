package buclesGraficos;

import java.util.Scanner;

import graphics.Color;
import graphics.Rectangle;
import graphics.Text;
import graphics.Ellipse;
import graphics.Line;
import graphics.Canvas;

public class Ajedrez {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int px = 0, py = 0;

		while (px != 400) {
			Rectangle cuadrado = new Rectangle(px, py, 50, 50);
			cuadrado.draw();
			cuadrado.fill();
			px += 100;

		}
		px = 0;
		py = 0;

		while (px != 400) {
			Rectangle cuadrado = new Rectangle(px + 50, py + 50, 50, 50);
			cuadrado.draw();
			cuadrado.fill();
			px += 100;

		}

		px = 0;
		py = 0;

		while (px != 400) {
			Rectangle cuadrado = new Rectangle(px, py + 100, 50, 50);
			cuadrado.draw();
			cuadrado.fill();
			px += 100;

		}

		px = 0;
		py = 0;

		while (px != 400) {
			Rectangle cuadrado = new Rectangle(px + 50, py + 150, 50, 50);
			cuadrado.draw();
			cuadrado.fill();
			px += 100;

		}

		px = 0;
		py = 0;

		while (px != 400) {
			Rectangle cuadrado = new Rectangle(px, py + 200, 50, 50);
			cuadrado.draw();
			cuadrado.fill();
			px += 100;

		}

		px = 0;
		py = 0;

		while (px != 400) {
			Rectangle cuadrado = new Rectangle(px + 50, py + 250, 50, 50);
			cuadrado.draw();
			cuadrado.fill();
			px += 100;

		}

		px = 0;
		py = 0;

		while (px != 400) {
			Rectangle cuadrado = new Rectangle(px, py + 300, 50, 50);
			cuadrado.draw();
			cuadrado.fill();
			px += 100;

		}

		px = 0;
		py = 0;

		while (px != 400) {
			Rectangle cuadrado = new Rectangle(px + 50, py + 350, 50, 50);
			cuadrado.draw();
			cuadrado.fill();
			px += 100;

		}

	}

}

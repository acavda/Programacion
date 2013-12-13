package Simulacro2;

import java.util.Scanner;

import graphics.Color;
import graphics.Rectangle;
import graphics.Text;
import graphics.Ellipse;
import graphics.Line;
import graphics.Canvas;

public class simulacro22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * e. Utilizando el paquete graphics visto en clase y una estructura
		 * switch, realiza un porgrama que pida dos números por consola. Uno
		 * será el tamaño del lienzo (cuadrado) y otro el número de figuras que
		 * se dibujarán dentro). Cada figura puede ser un cuadrado, un círculo,
		 * el texto “DAW”o una línea. Se valorará que las figuras varíen en
		 * color, forma y posición, y que no se salgan del lienzo.
		 */

		Scanner teclado = new Scanner(System.in);

		int t = 0, n = 0;

		System.out.println("Dame el tamaño del lienzo: ");

		t = teclado.nextInt();

		System.out.println("Dame el numero de figuras: ");

		n = teclado.nextInt();

		String daw = "DAW";

		for (int i = 0; i < n; i++) {

			int tx, ty, px, py;

			tx = (int) (Math.random() * 100 + 1);
			ty = (int) (Math.random() * 100 + 1);

			px = (int) (Math.random() * t + 1);
			py = (int) (Math.random() * t + 1);

			Color color1 = new Color(tx, ty, tx);
			Color color2 = new Color(ty, tx, ty);
			Color color3 = new Color(tx, tx, ty);

			switch ((int) (Math.random() * 4 + 1)) {
			case 1:
				Ellipse pelota = new Ellipse(px, py, tx, ty);
				pelota.draw();
				pelota.setColor(color1);
				pelota.fill();
				break;

			case 2:
				Rectangle cuadrao = new Rectangle(px, py, tx, ty);
				cuadrao.draw();
				cuadrao.setColor(color2);
				cuadrao.fill();
				break;

			case 3:
				Text texto = new Text(px, py, daw);
				texto.draw();
				texto.setColor(color3);
				break;

			case 4:
				Line linea = new Line(tx, ty, px, py);
				linea.draw();
				break;

			}

		}

	}

}

package Simulacro;

import java.util.Scanner;

import graphics.Canvas;
import graphics.Rectangle;
import graphics.Color;
import graphics.Line;
import graphics.Ellipse;
import graphics.Text;

public class Ejercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado = new Scanner(System.in);

		int nfiguras = 0, tamaño = 0;

		int trandom = 0, prandom = 0;

		System.out.println("¿De que tamaño quieres el lienzo?");

		tamaño = teclado.nextInt();

		System.out.println("¿Cuantas figuras quieres? (Máximo 5)");

		nfiguras = teclado.nextInt();

		trandom = (int) (Math.random() * 50);

		prandom = (int) (Math.random() * 500);

		int n = (int) (Math.random() * 50);

		int n2 = (int) (Math.random() * 50);

		Rectangle lienzo = new Rectangle(0, 0, tamaño, tamaño);
		lienzo.draw();

		Color color1 = new Color(trandom, n2, n);

		Color color2 = new Color(trandom - 10, n2 + 50, n + 100);

		int i = 0;

		for (nfiguras = 0; nfiguras < 100; nfiguras++) {

			switch (nfiguras) {
			case 1:
				Rectangle forma1 = new Rectangle(prandom, prandom, trandom, n);
				forma1.draw();
				forma1.fill();
				forma1.setColor(color1);
				break;

			case 2:
				Rectangle forma2 = new Rectangle(prandom, prandom, n, trandom);
				forma2.draw();
				forma2.fill();
				forma2.setColor(color1);

				Ellipse forma3 = new Ellipse(prandom + n, prandom + n, trandom,
						n);
				forma3.draw();
				forma3.fill();
				forma3.setColor(color1);
				break;

			case 3:
				Rectangle forma4 = new Rectangle(prandom, prandom, n, trandom);
				forma4.draw();
				forma4.fill();
				forma4.setColor(color1);

				Ellipse forma5 = new Ellipse(prandom + n, prandom + n, trandom,
						n);
				forma5.draw();
				forma5.fill();
				forma5.setColor(color1);

				Line forma6 = new Line(prandom + n, prandom + n, n, trandom);
				forma6.draw();
				forma6.setColor(color1);
				break;

			case 4:
				Rectangle forma7 = new Rectangle(prandom, prandom, n, trandom);
				forma7.draw();
				forma7.fill();
				forma7.setColor(color1);

				Ellipse forma8 = new Ellipse(prandom + n, prandom + n, trandom,
						n);
				forma8.draw();
				forma8.fill();
				forma8.setColor(color2);

				Line forma9 = new Line(prandom + n, prandom + n, n, trandom);
				forma9.draw();
				forma9.setColor(color1);

				Ellipse forma10 = new Ellipse(prandom + n, prandom + n,
						trandom, n);
				forma10.draw();
				forma10.fill();
				forma10.setColor(color2);
				break;

			case 5:
				Rectangle forma11 = new Rectangle(prandom, prandom, n, trandom);
				forma11.draw();
				forma11.fill();
				forma11.setColor(color1);

				Ellipse forma12 = new Ellipse(prandom + n, prandom + n,
						trandom, n);
				forma12.draw();
				forma12.fill();
				forma12.setColor(color2);

				Line forma13 = new Line(prandom + n, prandom + n, n, trandom);
				forma13.draw();
				forma13.setColor(color1);

				Ellipse forma14 = new Ellipse(prandom + n, prandom + n,
						trandom, n);
				forma14.draw();
				forma14.fill();
				forma14.setColor(color2);

				Ellipse forma15 = new Ellipse(prandom + n + 5, prandom + n + 5,
						trandom, n);
				forma15.draw();
				forma15.fill();
				forma15.setColor(color1);
				break;

			}
		}

	}

}

package metodos;
import java.util.*;

public class Ejercicio615 {
	
	public static double hipotenusa(double lado1,double lado2){
		double hip;
		hip=Math.sqrt((Math.pow(lado1, 2)+(Math.pow(lado2, 2))));
		return hip;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		double lado1,lado2;

		System.out.println("Dame los lados del triángulo rectángulo ");
		lado1=teclado.nextDouble();
		lado2=teclado.nextDouble();
		
		System.out.println("La hipotenusa es: "+hipotenusa(lado1,lado2));
		
		
	}

}

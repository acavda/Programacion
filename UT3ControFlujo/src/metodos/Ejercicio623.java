package metodos;
import java.util.*;

public class Ejercicio623 {
	public static float numero3(float num1,float num2,float num3){
		float numeromenor=0;
		
		numeromenor= Math.min(num1, Math.max(num2, num3));
		
		
		return numeromenor;
	}

	public static void main(String[] args){
		Scanner teclado = new Scanner(System.in);
		float numero1,numero2,numero3;
		
		System.out.println("Dame tres números");
		numero1=teclado.nextFloat();
		numero2=teclado.nextFloat();
		numero3=teclado.nextFloat();
		
		System.out.println("El menor de los tres números es: "+numero3(numero1,numero2,numero3));
		
		
		
		
		
	}

}

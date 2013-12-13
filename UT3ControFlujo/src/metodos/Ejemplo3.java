package metodos;

public class Ejemplo3 {

	public static void main(String[] args) {
		
		aleatorio(1,6);
		
		
	}

	public static void aleatorio(int min,int max){
		
		int n;
		
		n=(int)(Math.random()*((max-min)+1))+min;
		System.out.println(n);
		
	}
	
	
}

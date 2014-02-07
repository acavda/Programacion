package ejemplos;

public class Ejemplo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	 Contador uno;
		
		uno = new Contador();
		
		while(uno.getContador()<100){
			System.out.println(uno.getContador());
			uno.incrementar();
			
		}
		
		
	}

}

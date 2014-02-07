package ejemplos;

public class Ejemplo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Persona angel, manolo;
		
		angel = new Persona();
		
		angel.nombre="Angel";
		
		System.out.println(angel.nombre);
		
		
		manolo = new Persona();
		
		manolo.nombre="Manolo";
		
		angel.imprimirNombre();
		

	}

}

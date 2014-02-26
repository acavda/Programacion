package conocimientoBásico;

class Persona{
	private String nombre;
	
	
	public Persona(){
		System.out.println("Constructor ejecutandose");
	}
	
	public Persona(String nombre){
		this.nombre=nombre;
		
	}
	public void escribeNombre(){
		System.out.println(nombre);
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
		
	
	
	
	
}
	
}

public class Aplicacion {
	
	
	
	
	 
	public static void main(String[] args) {
 
		System.out.println("¡Hola Mundo!");
		
		Persona antonio = new Persona("antonio");
		
		
		
		antonio.getNombre();
		
		antonio.escribeNombre();
 
	}
 
}

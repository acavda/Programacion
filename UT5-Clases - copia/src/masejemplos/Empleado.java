package masejemplos;

/*
 * Clase Empleado, tiene:
 // Atributos
 Nombre
 Apellido 1
 Apellido 2
 DNI
 SueldoBase

 // Constructores
 Empleado()
 Empleado(Nombre,Apellido1)

 // M�todos
 calculaSueldo(horasExtra, precioHora)
 // sueldo = sueldoBase+horasExtra*precioHora;
 */
public class Empleado {
	private String nombre;
	private String apellido1;
	private String apellido2;
	private String DNI;
	private double sueldobase;

	public Empleado() {

	}

	public Empleado(String name, String ap1) {
		this.nombre = name;
		this.apellido1 = ap1;
	}

	public double calculasueldo(double horasextra, double preciohora) {
		double sueldo;

		sueldo = sueldobase + horasextra * preciohora;

		return sueldo;

	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido1() {
		return apellido1;
	}

	public void setApellido1(String apellido1) {
		this.apellido1 = apellido1;
	}

	public String getApellido2() {
		return apellido2;
	}

	public void setApellido2(String apellido2) {
		this.apellido2 = apellido2;
	}

	public String getDNI() {
		return DNI;
	}

	public void setDNI(String dNI) {
		DNI = dNI;
	}

	public double getSueldobase() {
		return sueldobase;
	}

	public void setSueldobase(double sueldo) {
		this.sueldobase = sueldo;
	}

}

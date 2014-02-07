package masejemplos;

public class EjercicioEmpleado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Empleado uno, dos;

		uno = new Empleado("Antonio", "cañete");
		dos = new Empleado("Jose", "C");

		uno.setSueldobase(500);

		dos.setSueldobase(580);

		System.out.println(uno.calculasueldo(25, 50));
		System.out.println(dos.calculasueldo(25, 50));
	}

}

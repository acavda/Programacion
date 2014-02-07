package ejemplos;

public class PruebaCuenta {

	public static void main(String[] args){
		Cuenta mi_cuenta;

		mi_cuenta= new Cuenta();
		mi_cuenta=new Cuenta("234234");

		mi_cuenta.ingresar(250);

		System.out.println("Saldo inicial: " + mi_cuenta.getSaldo());

		mi_cuenta.sacar(200);
		if (!mi_cuenta.sacar(100)) System.out.println("Operación no permitida");
		mi_cuenta.ingresar(100);

		System.out.println("Saldo actual: " + mi_cuenta.getSaldo());
		System.out.println("Número de movimientos: " + mi_cuenta.getTransacciones());
	}
}
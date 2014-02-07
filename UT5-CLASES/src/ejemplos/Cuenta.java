package ejemplos;

public class Cuenta {

	private double saldo=0;
	private long num_transacciones=0;
	private String NumeroCuenta;
	
	
	public Cuenta(){
		
	}
	
	public Cuenta(String Num_Cuenta){
		this.NumeroCuenta=Num_Cuenta;
		this.saldo=0;
		this.num_transacciones=0;
	}
	
	public Cuenta(String num_cuenta, double saldo_inicial) {
		this.NumeroCuenta=num_cuenta;
		this.saldo=saldo_inicial;
		this.num_transacciones=1;
	}

	public String getNumeroCuenta() {
		return NumeroCuenta;
	}

	public void ingresar(double cantidad) {
		saldo+=cantidad;
		num_transacciones++;
	}

	public boolean sacar(double cantidad) {
		if (saldo<cantidad) {
			System.out.println("¡No permitido sacar más dinero del disponible!");
			return false;
		}else{
			saldo-=cantidad;
			num_transacciones++;
			return true;
		}
	}

	public double getSaldo() {
		return saldo;
	}

	public long getTransacciones() {
		return num_transacciones;
	}
	
	
	
}
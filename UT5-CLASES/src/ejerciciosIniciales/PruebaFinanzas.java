package ejerciciosIniciales;

public class PruebaFinanzas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System.out.println(Finanzas.dolaresToEuros(100));
		System.out.println(Finanzas.eurosToDolares(100));
		
		
			Finanzas euros;
			
			euros= new Finanzas(50);
			
			System.out.println(euros.getDolares());

	}

}

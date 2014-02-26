package ejerciciosIniciales;

public class PruebaCoche2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Coche2 coche1;
		Coche2 coche;
		coche= new Coche2("Audi","2");
		coche1= new Coche2();
		
		coche1.setMarca("Peugeot");
		coche1.setModelo("406");
		
	System.out.println(coche1.getMarca());
	System.out.println(coche1.getModelo());
		
		
		
	

	}

}

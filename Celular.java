package pcte;

public class Celular {
	String marca;
	String SistemaOperacional;
	boolean rede;
	
	void ligar() {
		if (this.rede == true) {
			System.out.println("Tentando ligar... A ligação pode ser completada");
			
		}else {
			System.out.println("Tentando ligar... A ligação não pode ser concluida pois o celular está sem rede");
		}
	
	}
	

}

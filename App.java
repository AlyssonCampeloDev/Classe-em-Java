package pcte;

public class App {

	public static void main(String[] args) {
		
		Celular celular1 = new Celular();
		celular1.marca = "Iphone 12";
		celular1.SistemaOperacional = "IOS";
		celular1.rede = true;
		System.out.println("Celular " + celular1.marca + " Com sistema operacional " + celular1.SistemaOperacional);
		celular1.ligar();
		

		
		
		Celular celular2= new Celular();
		celular2.marca = "Motorola MotoG";
		celular2.SistemaOperacional = "Android";
		celular2.rede = true;
		System.out.println("Celular " + celular2.marca + " Com sistema operacional " + celular2.SistemaOperacional);
		celular2.ligar();
		
		
		Celular celular3 = new Celular();
		celular3.marca = "Nokia Lumia";
		celular3.SistemaOperacional = "WindownsPhone";
		celular3.rede = false;
		System.out.println("Celular " + celular3.marca + " Com sistema operacional " + celular3.SistemaOperacional);
		celular3.ligar();
		
		
		
		
		
	}

}

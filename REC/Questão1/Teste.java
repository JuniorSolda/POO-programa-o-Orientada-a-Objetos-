package questão01;

public class Teste {

	public static void main(String[] args) {
		Carro c1 = new Carro("Fiat", "Uno", 13.5, 40f);
		
		c1.abastecer(100);
		c1.andar(541);
		c1.mostrarDados();
	}

}

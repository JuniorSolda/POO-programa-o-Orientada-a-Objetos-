package exercicio3;

public class TestePonto {

	public static void main(String[] args) {
		Ponto A = new Ponto(1, 2);
		Ponto B = new Ponto(4, 4);
		Ponto AB = new Ponto(B.X - A.X, B.Y - A.Y);
		
		System.out.println("Distancia AB: "+AB.distancia(AB));
	}

}

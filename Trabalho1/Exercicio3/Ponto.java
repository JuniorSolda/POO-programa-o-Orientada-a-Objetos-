package exercicio3;

public class Ponto {
	
	double X, Y;
	
	public Ponto(double x, double y) {
		this.X = x;
		this.Y = y;
	}
	
	public double distancia(Ponto p) {
		
		return Math.sqrt(Math.pow(p.X,2) + Math.pow(p.Y,2));
		
	}

}

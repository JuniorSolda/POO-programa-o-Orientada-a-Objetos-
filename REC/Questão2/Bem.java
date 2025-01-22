package questão02;

public abstract class Bem {
	double valorVenal;
	
	public Bem(double valorVenal) {
		this.valorVenal = valorVenal;
	}
	
	public abstract double calcularImposto();
	public abstract String getNome();
}

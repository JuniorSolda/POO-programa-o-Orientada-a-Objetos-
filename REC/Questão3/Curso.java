package questão03;

public class Curso {
	private int duracao;
	private double valorManutencao;
	
	
	public Curso(int duracao, double valorManutencao) {
		this.duracao = duracao;
		this.valorManutencao = valorManutencao;
	}
	
	public int getDuracao() {return duracao;}
	public double getValorManutencao() {return valorManutencao;}
	
}

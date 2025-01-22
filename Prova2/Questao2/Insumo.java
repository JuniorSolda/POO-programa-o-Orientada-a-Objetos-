package questão2;

public class Insumo {
	int codigo;
	String descricao;
	double preco;
	
	public Insumo(int cod, String descricao, double preco) {
		this.codigo = cod;
		this.descricao = descricao;
		this.preco = preco;
		
	}
	public String getDescricao() {return descricao;}
	
	public double calcularImposto() {	
		return (this.preco*0.07) + (this.preco*0.08);
		
	}
	public double calcularCustoTotal() {
		return this.preco = this.preco + calcularImposto();
	}
}

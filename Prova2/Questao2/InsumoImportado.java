package questão2;

public class InsumoImportado extends Insumo {
	static double COTACAO_DOLAR;
	double taxaImportacao;
	String paisOrigem;
	
	public InsumoImportado(int cod, String descr, double preco, double taxaImp,  String pais) {
		super(cod, descr, preco);
		this.paisOrigem = pais;
		this.taxaImportacao = taxaImp;
	}
	
	public static double setCotacaoDolar(double valor) {
		return COTACAO_DOLAR = valor;	
		
	}
	
	public double calcularImposto() {
		return this.taxaImportacao + (this.preco*0.08);	
	}
	
	public double calcularCustoTotal() {
		this.preco = this.preco + calcularImposto();
		return this.preco*COTACAO_DOLAR;
	}
}

package exercicio2;

public class Corrente extends Conta{
	
	double taxaManutencao;
	
	public Corrente(String nome, int cpf, double saldo, double dataAbertura,  int numero, double taxa) {
		super(nome, cpf, saldo, dataAbertura, numero);
		this.taxaManutencao = taxa;
	}
	@Override
	public double debito(double saldo, double valor) {
		if(saldo < valor) {
			return this.saldo = saldo - valor;
		}else 
			return 0;
	}
	
	@Override
	public double deposito(double valor) {
		
		return this.saldo + valor;
	}
	public double atualizar() {
		
		
	}
	
	
	
}

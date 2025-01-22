package exercicio2;

public class Investimento extends Conta {
	
	double jurosMensal;
	
	public Investimento(String nome, int cpf, double saldo, double dataAbertura,  int numero, double jurosMensal) {
		super(nome, cpf, saldo, dataAbertura, numero);
		this.jurosMensal = jurosMensal;
	}
	
	@Override
	public double debito(double saldo, double valor) {
		this.jurosMensal = saldo * (valor/100);
		
		return saldo - this.jurosMensal;
	}
	
	@Override
	public double deposito(double valor) {
		
		return this.saldo + valor;
	}
	public double atualizar(double valor) {
		
		 
	}
}

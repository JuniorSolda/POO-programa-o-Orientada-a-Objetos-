package exercicio2;

public class Especial extends Corrente{
	
	double limite;
	double taxaJuros;
	
	public Especial(String nome, int cpf, double dataAbertura, double saldo,  int numero, double taxaManutencao, double taxaJuros, double limite) {
		super(nome, cpf, saldo, dataAbertura, numero, taxaManutencao);
		this.taxaJuros = taxaJuros;
		this.limite = limite; 
	}
	
	@Override
	public double debito(double saque, double limite) {
		if(limite < saque) {
			saque = saque*(taxaJuros/100);
			this.saldo = this.saldo - saque;
			return this.saldo;
		}else {
			this.saldo = this.saldo - saque;
			return this.saldo;
		}
	}
	
	@Override
	public double deposito(double valor) {
		
		return this.saldo + valor;
	}
}


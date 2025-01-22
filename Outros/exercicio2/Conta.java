package exercicio2;

public abstract class Conta {
	int numero;
	String nome;
	int cpf;
	double dataAbertura;
	double saldo;
	
	public Conta(String nome, int cpf, double dataAbertura, double saldo, int numero) {
		this.nome = nome;
		this.cpf = cpf;
		this.numero = numero;
		this.saldo = saldo;
		this.dataAbertura = dataAbertura;
	}
	public abstract double debito();
	
	public abstract double deposito();
	
	public abstract double atualizar();
	
}

package exercicio1;

public class Pessoa {

	 int idade, anoAtual, anoNascimento;
	 String nome;
	
	
	public Pessoa(String nome, int idade) {
		this.nome = nome;
		this.idade = idade;
		
	}
	
	public void fazerAniversario(int anoAtual, int anoNascimento, int idade){
			idade = anoAtual- anoNascimento;
			System.out.println(this.nome +" tem "+ idade);
		
	}
	
	

}

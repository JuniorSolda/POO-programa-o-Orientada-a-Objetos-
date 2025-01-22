package exercicio5;

public class Funcionarios {
	
	int NuMatricula;
	String Nome;
	char Setor;
	double Salario;
	
	public Funcionarios(int Numatricula, String nome, char setor, double salario) {

		this.NuMatricula = Numatricula;
		this.Nome = nome;
		this.Setor = setor;
		this.Salario = salario;
	}
	
	public double Reajuste(char Setor, double salario) {
		
		if(this.Salario <= 2499.99) {
			
			if(this.Setor == 'A') {
				this.Salario += salario*0.08;
			}else if(this.Setor == 'B') {
				this.Salario += salario*0.10;
			}else if(this.Setor == 'C') {
				this.Salario += salario*0.11;
			}else if(this.Setor == 'D') {
				this.Salario += salario*0.12;
			}
				
		}else if(this.Salario >= 2500 || this.Salario <= 4999.99 ) {
			
			if(this.Setor == 'A') {
				this.Salario += salario*0.07;
			}else if(this.Setor == 'B') {
				this.Salario += salario*0.09;
			}else if(this.Setor == 'C') {
				this.Salario += salario*0.10;
			}else if(this.Setor == 'D') {
				this.Salario += Salario*0.11;
			}
		}else if(this.Salario >= 5000) {
			
			if(this.Setor == 'A') {
				this.Salario += salario*0.06;
			}else if(this.Setor == 'B') {
				this.Salario += salario*0.08;
			}else if(this.Setor == 'C') {
				this.Salario += salario*0.09;
			}else if(this.Setor == 'D') {
				this.Salario += salario*0.09;
		}
	}

  }
}

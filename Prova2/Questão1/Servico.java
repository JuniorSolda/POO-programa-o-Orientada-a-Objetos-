package questão1;

public class Servico {
	String descricao;
	int tempoContratado, tempoTrabalhado;
	double precoHora, taxaHoraAdicional;
	boolean ativo;
	
	public Servico(String descricao, int tempo, double precoHora, double taxaExtra) {
		this.descricao = descricao;
		this.tempoContratado = tempo;
		this.precoHora = precoHora; 
		this.taxaHoraAdicional = taxaExtra;
		this.ativo = true;
		
	}
	
	public double registrar(int horas) {
		if(horas <= 0) {return 0;}
		
		this.tempoTrabalhado = horas;
		double pagar = this.tempoTrabalhado*this.precoHora;
		this.tempoContratado = this.tempoContratado - this.tempoTrabalhado;
		if(this.tempoContratado < 0) {
			
			double adicional = Math.abs(this.tempoContratado)*(this.taxaHoraAdicional+this.precoHora);
			double valorNormal = (this.tempoContratado + this.tempoTrabalhado)*this.precoHora;
			
			pagar = valorNormal + adicional;
			
			System.out.println("Pagar R$:"+pagar);
			return pagar;
			
		}else {
			System.out.println("Pagar R$:"+pagar);
			return pagar;
		}		
		
	}
	public int getSaldoHoras() {return tempoContratado;}
     
	void encerrar() {
		return;
	}
	 
	
}

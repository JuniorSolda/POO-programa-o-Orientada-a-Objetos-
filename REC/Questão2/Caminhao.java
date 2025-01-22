package questão02;

public class Caminhao extends Veiculo{
	private int capacidadeCarga;
	
	public Caminhao(double valorVenal, int anoFabricacao, int capacidadeCarga) {
		super(valorVenal, anoFabricacao);
		this.capacidadeCarga = capacidadeCarga;
	}
	
	@Override
	public double calcularImposto() {
		if(anoFabricacao >= 2007) {
			if(capacidadeCarga >= 15000) {
				return (valorVenal*0.035)*0.5;
			}else
				return (valorVenal*0.035)*0.3;
			
		}else if(anoFabricacao >= 1996 && anoFabricacao <= 2006) {
			if(capacidadeCarga >= 15000) {
				return (valorVenal*0.015)*0.5;
			}else
				return (valorVenal*0.015)*0.3;
		}else
			return valorVenal*0;
		
	}
	@Override
	public String getNome() {return "Caminhao";}
}

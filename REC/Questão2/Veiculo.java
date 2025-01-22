package questão02;

public class Veiculo extends Bem{
	protected int anoFabricacao;
	
	public Veiculo(double valorVenal, int anoFabricacao) {
		super(valorVenal);
		this.anoFabricacao = anoFabricacao;
	}
	
	@Override
	public double calcularImposto() {
		if(anoFabricacao >= 2007) {
			return valorVenal*0.035;
		}else if(anoFabricacao >= 1996 && anoFabricacao <= 2006) {
			return valorVenal*0.015;
		}else
			return valorVenal*0;
	}
	
	@Override
	public String getNome() {return "Veiculo";}
	
	
}

package questão02;

public class Imovel extends Bem{
	private double areaTerreno;
	private double areaConstruida;
	
	public Imovel(double valorVenal, double areaTerreno, double areaConstruida) {
		super(valorVenal);
		this.areaTerreno = areaTerreno;
		this.areaConstruida = areaConstruida;
	}
	
	@Override
	public double calcularImposto() {
		if(areaConstruida == 0) {
			return valorVenal*0.005;	
		}else {
			return areaConstruida*6;
		}
	}
	@Override
	public String getNome() {return "Imovel";}
}

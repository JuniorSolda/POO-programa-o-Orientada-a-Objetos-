package questão01;

public class Carro {
	private String marca;
	private String modelo;
	private double kmRodado;
	private double kmPorLitro;
	private float capacidadeTanque;
	private float litrosTanque;
	
	
	public Carro(String marca, String modelo, double kmPorLitro, float capacidadeTanque) {
		this.marca = marca;
		this.modelo = modelo;
		this.kmPorLitro = kmPorLitro;
		this.capacidadeTanque = capacidadeTanque;
	}
	
	public String getMarca() {return marca;}
	public String getModelo() {return modelo;}
	public double getKmRodado() {return kmRodado;}
	public double getKmPorLitro() {return kmPorLitro;}
	public float getCapacidadeTanque() {return capacidadeTanque;}
	public float getLitrosTanque() {return litrosTanque;}
	
	public void mostrarDados() {
		System.out.format("Marca: %S  \nModelo: %S  \nkm por litro: %.2f  \ncapacidade do tanque: %.1f  \nlitros no tanque: %.1f \n", getMarca(), getModelo(), 
		getKmPorLitro(), getCapacidadeTanque(), getLitrosTanque());
	}
	
	public double abastecer(double litros) {
		double abast = litrosTanque + litros;
		if(abast > capacidadeTanque) {
			litrosTanque = capacidadeTanque;
			return litrosTanque;
		}else
			return abast;		
	}
	
	public double andar(double kms) {
		double aux = 0;
		aux = kmRodado + kms;
		double mediaLitros = litrosTanque*kmPorLitro;
		if(mediaLitros > aux) {
			kmRodado = aux;
			return kmRodado;
		}else {
			kmRodado = mediaLitros;
			return kmRodado;
		}
		
	}
	
}

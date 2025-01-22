package exercicio1;

public class Escultura extends Obra {
	String material;
	double altura, largura, comprimento,peso;
	
	public Escultura(String tipo,String titulo, String[] autor, int ano,String material, double altura, double largura,double peso,double comprimento) {
		super(tipo,titulo,autor,ano);
		this.material = material;
		this.altura = altura;
		this.largura = largura;
		this.comprimento = comprimento;
		this.peso = peso;
}
	
	@Override
	public void setAutor(String[] autor) {
		
	}
	
	

}

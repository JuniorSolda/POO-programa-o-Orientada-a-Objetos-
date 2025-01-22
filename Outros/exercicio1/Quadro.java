package exercicio1;

public class Quadro extends Obra{
	String estilo, tecnica;
	
	public Quadro (String tipo,String titulo, String[] autor, int ano, String estilo, String tecnica) {
		super(tipo,titulo,autor,ano);
		this.estilo = estilo;
		this.tecnica = tecnica;
}
	@Override
	public void setAutor(String[] autor) {
		
	}
	
}

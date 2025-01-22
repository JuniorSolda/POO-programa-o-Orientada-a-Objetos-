package exercicio1;

public class Filme extends Obra{
	int min;
	String [] atores = new String[20];
	
	public Filme (String tipo, String titulo, String[] autor, int ano, int min, String[] atores) {
		super(tipo,titulo,autor,ano);
		this.min = min;
		this.atores = atores;
	}

	@Override
	public void setAutor(String[] autor) {
		
	}





}

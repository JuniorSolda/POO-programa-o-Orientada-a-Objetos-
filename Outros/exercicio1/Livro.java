package exercicio1;


public class Livro extends Obra {
	int codigo, paginas;
	
	public Livro (String tipo, String titulo, String[] autor, int ano, int codigo, int paginas) {
		super(tipo,titulo,autor,ano);
		this.codigo = codigo;
		this.paginas = paginas;
	}

	@Override
	public void setAutor(String[] autor) {
		
	}
	

}

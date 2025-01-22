package exercicio1;


public abstract class Obra {
	String titulo,tipo;
	String[] autor = new String[5];
	int ano;
	
	public Obra (String tipo, String titulo, String[] autor, int ano ) {
		this.titulo = titulo;
		this.autor = autor;
		this.ano=ano;
		this.tipo = tipo;
	}
	public abstract void setAutor( String[] autor);


	public void setTipo(String tipo) {
		if(tipo == "FILME" || tipo == "ESCULTURA" || tipo=="LIVRO"|| tipo =="QUADRO") {
			this.tipo = tipo;
		}
	}
	
	public String getTipo() {
		return titulo;
	}
	
	
		}


package exercicio1;

public class CadastroObras {
	public static void main(String[] args) {
		Obra obr[] = new Obra[2];
		obr[0] = new Filme("FILME","Um Contratempo",new String []{"Oriol Paulo"},2016,106,new String[]{"Ana Wagener","José Coronado,Bárbara Lennie"}); 
		obr[1] = new Livro ("LIVRO","1984", new String[] {"Jorge Orwell"},1949,231342000,384);	
	
	
	if(obr[0].tipo == obr[1].tipo || obr[0].ano == obr[1].ano || obr[0].autor == obr[1].autor) {
		System.out.format("%s\n%s",obr[0].getTipo(),obr[1].getTipo());	
	}
	
}
}

package exercicio2;

public class Data {
	
	static int dia, mes, ano;
	
	public Data(int dia, int mes, int ano) {
		
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
	}
	
	public static String formatarData() {
		
		return  dia+"/"+mes+"/"+ano; 
	}
}

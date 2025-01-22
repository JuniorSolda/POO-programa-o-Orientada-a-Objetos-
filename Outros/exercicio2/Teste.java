package exercicio2;

import exercicio1.Obra;

public class Teste {

	public static void main(String[] args) {
		Conta teste[] = new Conta[2];
		
		teste[0] = new Corrente("teste", 098765432, 0203, 123.3,  1, 3.2);
		teste[1] = new Investimento("teste", 098765432, 0203, 123.3,  1, 3.2);

	}

}

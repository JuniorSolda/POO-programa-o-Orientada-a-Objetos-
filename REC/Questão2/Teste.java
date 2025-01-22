package questão02;

public class Teste {

	public static void main(String[] args) {
		Bem bens[] = new Bem[6];
		bens[0] = new Imovel(50000, 100.5, 60.9);
		bens[1] = new Imovel(100000, 150.5, 100.75);
		bens[2] = new Veiculo(35000, 2000);
		bens[3] = new Veiculo(150000, 2015);
		bens[4] = new Caminhao(150000, 2006, 16000);
		bens[5] = new Caminhao(400000, 2018, 50000);
	
		for(Bem b : bens) {
			System.out.format("Imposto do %S é R$: %.2f\n", b.getNome(), b.calcularImposto());
		}

	}

}

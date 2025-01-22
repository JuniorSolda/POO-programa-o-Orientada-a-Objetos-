package questoes;

import java.util.Scanner;

public class Questao1 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		System.out.println("Informe o peso total das mercadorias (kg): ");
		double peso = scn.nextInt();
		
		System.out.println("Informe a distancia a percorrer (km): ");
		double distancia = scn.nextInt();
		
		double Cada10Km = distancia/10;
		double aux = peso/1000;
		double ValorPorPeso = 15*Math.ceil(aux)*Math.ceil(Cada10Km);
		double Total = ValorPorPeso+300;
		
		if(distancia > 300) {
			Total += 80;
			System.out.printf("Viagem(fixo): R$300,00\nValor pelo peso: R$%.2f\nTaxa de retorno = R$80,00\nTOTAL DO FRETE: R$%.2f", ValorPorPeso, Total);
		}else {
		
			System.out.printf("Viagem(fixo): R$300,00\nValor pelo peso: R$%.2f\nTOTAL DO FRETE: R$%.2f", ValorPorPeso, Total);
		}

	}

}

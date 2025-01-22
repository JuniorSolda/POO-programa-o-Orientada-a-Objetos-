package questoes;

import java.util.Scanner;

public class Questao2 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Informe o sexo da pessoa (M ou F), seu peso (kg) e sua idade (anos) ");
		double cont = 0, contPesoM = 0, contM = 0, contF = 0, contPesoF = 0;
		char sexo = scn.next().charAt(0);
		
		while(sexo != 'X'){
			
		if(sexo == 'M')contM++;
		else contF++;
		
		int peso = scn.nextInt();
		int idade = scn.nextInt();
		
		if(sexo =='M' && idade >= 60 && peso > 95) contPesoM++;
		else if(sexo =='F' && idade >= 20 && idade <= 30 && peso < 45) contPesoF++;
		
		cont++;
		System.out.println("Informe o sexo da pessoa (M ou F), seu peso (kg) e sua idade (anos) ");
		sexo = scn.next().charAt(0);
		
		}
		double percentualM = (contPesoM/contM)*100;
		double percentualF = (contPesoF/contF)*100;
		System.out.printf("Numero total de pessoas atendidas: %.0f\n", cont);
		System.out.printf("O numero e o percentual total de Homens com 60 anos ou mais e mais de 95 kg é de: %.0f Homen(s), %.0f%%\n", contPesoM, percentualM);
		System.out.printf("O numero e o percentual total de Mulheres com idade entre 20 e 30 anos e que pesam menos de 45 kg é de: %.0f mulher(es), %.0f%% ", contPesoF, percentualF);
		
		
	}

}

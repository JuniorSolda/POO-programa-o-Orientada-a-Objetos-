package questoes;

import java.util.Scanner;

public class Questao3 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		int aluno[] = new int[7];
		int AprovadosRA[] = new int[7];
		int ReprovadosRA[] = new int[7];
		double MediaPon[] = new double[5];
		
		
		
		for(int i = 0; i < 30; i++) {
			System.out.println("informe o RA as notas da primeira e da segunda prova de cada aluno: ");
			aluno[i] = scn.nextInt();
			double n1 = scn.nextDouble();
			double n2 = scn.nextDouble();
		
			MediaPon[i] = ((n1*2) + (n2*3))/5.0;		
			
			if(MediaPon[i] < 7.0) {
				System.out.println("Entre com a nota do exame: ");
				double ex = scn.nextDouble();
				MediaPon[i] = ((n1*2)+(n2*3) + ex*4)/9.0;
			}
			
				
		}
		System.out.println("Reprovados:");
		for(int i =0; i < 30; i++) {
			if(MediaPon[i] < 7.0) {
				
				System.out.printf("%d - %.1f\n", aluno[i], MediaPon[i]);

			}
		}
		System.out.println();
		System.out.println("Aprovados:");
		for(int i =0; i < 30; i++) {
			if(MediaPon[i] >= 7.0) {
				
				System.out.printf("%d - %.1f\n", aluno[i], MediaPon[i]);
			}
		}
		
		
	}

}

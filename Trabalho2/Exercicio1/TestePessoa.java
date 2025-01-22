package exercicio1;

import java.util.Scanner;

public class TestePessoa {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		int idade;
		System.out.println("Insira seu nome, ano atual e seu ano de nascimento respectivamente:");
		String nome = scn.nextLine();
		int anoAt = scn.nextInt();
		int anoNas = scn.nextInt();
		idade = anoAt - anoNas;
		Pessoa p = new Pessoa(nome, idade);
		p.fazerAniversario(anoAt, anoNas, idade);
		
		for(int i = 0;i<2;i++) {
			anoAt = scn.nextInt();
			p.fazerAniversario(anoAt, anoNas, idade);
			
		}
		


	}

}

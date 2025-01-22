package questoes;

import java.util.Arrays;
import java.util.Scanner;

public class Questao4 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		int A[] = new int[20];
		int cont = 0, aux = 0;
		for(int i = 0;i < 20; i++) {
			A[i] = scn.nextInt();
		}
		
		int B[] = new int[20];
		for(int i = 0; i < 20; i++) {
			if(A[i]%2 == 0) {
				B[cont] = A[i];
				
				cont++;
			}
			
		}
		
		for (int i = 1; i < B.length; i++) {
		    for (int j = 0; j < i; j++) {
		        if (B[i] > B[j]) {
		            int temp = B[i];
		            B[i] = B[j];
		            B[j] = temp;
		        }
		    }
		}
		aux = cont;
		for(int i = 0;i < 20; i++) {
			if(A[i]%2 != 0) {
				B[aux] = A[i];
				aux++;
				
			}
		}
		
		for (int i = cont; i < aux; i++) {
			for (int j = cont; j < B.length; j++) {
				if (B[i] < B[j]) {
					int auxc = B[i];
					B[i] = B[j];
					B[j] = auxc;
					
				}
				
			}
		}
		
		for(int i = 0; i< 20; i++) {
			System.out.printf("%d ", B[i]);
		}
		

	}

}

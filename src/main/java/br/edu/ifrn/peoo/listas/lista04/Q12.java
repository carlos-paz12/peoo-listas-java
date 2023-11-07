package br.edu.ifrn.peoo.listas.lista04;

import java.util.Scanner;

public class Q12 {

	public static void main(String[] args) {

		Scanner read = new Scanner(System.in);
		int v1[] = new int[10], v2[] = new int[v1.length];

		int i = 0;
		while (i < v1.length) {

			System.out.printf("Digite um número inteiro: ");
			v1[i] = read.nextInt();

			v2[i] = (int) Math.pow(v1[i], 3);

			i++;

		}

		System.out.print("\n\nVETOR 1: ");

		for (int j = 0; j < v1.length; j++) {

			System.out.printf("[%d] ", v1[j]);

		}

		System.out.print("\n\nELEMENTOS DO VETOR 1 AO CUBO: ");

		for (int k = 0; k < v2.length; k++) {

			System.out.printf("[%d] ", v2[k]);

		}

	}

}

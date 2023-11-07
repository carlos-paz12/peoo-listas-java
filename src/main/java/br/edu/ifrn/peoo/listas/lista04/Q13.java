package br.edu.ifrn.peoo.listas.lista04;

import java.util.Scanner;

public class Q13 {

	public static void main(String[] args) {

		Scanner read = new Scanner(System.in);
		int v1[] = new int[8], v2[] = new int[8], vetorAux[] = new int[v1.length];

		int i = 0;
		while (i < v1.length) {

			System.out.printf("Digite um número inteiro para o índice %d do 1° vetor: ", i);
			v1[i] = read.nextInt();

			vetorAux[i] = v1[i];

			i++;

		}

		System.out.print("\n");

		int j = 0;
		while (j < v2.length) {

			System.out.printf("Digite um número inteiro para o índice %d do 2° vetor: ", j);
			v2[j] = read.nextInt();

			v1[j] = v2[j];
			v2[j] = vetorAux[j];

			j++;

		}

		System.out.print("\n\nVETOR 1 INICIAL: ");

		for (int k = 0; k < vetorAux.length; k++) {

			System.out.printf("[%d] ", vetorAux[k]);

		}

		System.out.print("\n\nVETOR 2 INICIAL: ");

		for (int k = 0; k < v2.length; k++) {

			System.out.printf("[%d] ", v1[k]);

		}

		System.out.print("\n\nVETOR 1 FINAL: ");

		for (int l = 0; l < v1.length; l++) {

			System.out.printf("[%d] ", v1[l]);

		}

		System.out.print("\n\nVETOR 2 FINAL: ");

		for (int m = 0; m < v2.length; m++) {

			System.out.printf("[%d] ", v2[m]);

		}

	}

}

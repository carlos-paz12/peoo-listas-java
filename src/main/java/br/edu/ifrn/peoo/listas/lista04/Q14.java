package br.edu.ifrn.peoo.listas.lista04;

import java.util.Scanner;

public class Q14 {

	public static void main(String[] args) {

		Scanner read = new Scanner(System.in);
		int v1[] = new int[10], v2[] = new int[10], v3[] = new int[v1.length];

		int i = 0;
		while (i < v1.length) {

			System.out.printf("Digite um número inteiro para o índice %d do 1° vetor: ", i);
			v1[i] = read.nextInt();

			i++;

		}

		System.out.print("\n");

		int j = 0;
		while (j < v2.length) {

			System.out.printf("Digite um número inteiro para o índice %d do 2° vetor: ", j);
			v2[j] = read.nextInt();

			v3[j] = v1[j] * v2[j];

			j++;

		}

		System.out.print("\n\nVETOR 1: ");

		for (int k = 0; k < v1.length; k++) {

			System.out.printf("[%d] ", v1[k]);

		}

		System.out.print("\n\nVETOR 2: ");

		for (int l = 0; l < v2.length; l++) {

			System.out.printf("[%d] ", v2[l]);

		}

		System.out.print("\n\nPRODUTO DOS ELEMENTOS DOS VETORES 1 E 2: ");

		for (int m = 0; m < v3.length; m++) {

			System.out.printf("[%d] ", v3[m]);

		}

	}

}

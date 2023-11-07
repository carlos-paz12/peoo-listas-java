package br.edu.ifrn.peoo.listas.lista04;

import java.util.Scanner;

public class Q01 {

	public static void main(String[] args) {

		Scanner read = new Scanner(System.in);
		int vetor[] = new int[10];

		for (int i = 0; i < vetor.length; i++) {

			System.out.print("Digite um número inteiro: ");
			vetor[i] = read.nextInt();

		}

		System.out.print("\n\nValores digitados: ");

		for (int j = 0; j < vetor.length; j++) {

			System.out.printf("[%d] ", vetor[j]);

		}

	}

}

package br.edu.ifrn.peoo.listas.lista04;

import java.util.Scanner;

public class Q02 {

	public static void main(String[] args) {

		Scanner read = new Scanner(System.in);
		int vetor[] = new int[10];

		for (int i = 0; i < vetor.length; i++) {

			System.out.print("Digite um número inteiro: ");
			vetor[i] = read.nextInt();

		}

		System.out.print("\n\nOrdem inversa dos valores digitados: ");

		for (int j = vetor.length - 1; j >= 0; j--) {

			System.out.printf("[%d] ", vetor[j]);

		}

	}

}

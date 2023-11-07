package br.edu.ifrn.peoo.listas.lista04;

import java.util.Scanner;

public class Q03 {

	public static void main(String[] args) {

		Scanner read = new Scanner(System.in);
		int vetor[] = new int[20], vPares = 0;

		for (int i = 0; i < vetor.length; i++) {

			System.out.print("Digite um número inteiro: ");
			vetor[i] = read.nextInt();

			if (vetor[i] % 2 == 0) {

				vPares++;

			}

		}

		System.out.print("\n\nValores digitados: ");

		for (int j = 0; j < vetor.length; j++) {

			System.out.printf("[%d] ", vetor[j]);

		}

		if (vPares == 0) {

			System.out.print("\n\nNão foram digitados nenhum número par.");

		} else {

			System.out.printf("\n\nForam digitados %d números pares, são eles: ", vPares);

			for (int k = 0; k < vetor.length; k++) {

				if (vetor[k] % 2 == 0) {

					System.out.printf("[%d] ", vetor[k]);

				}

			}

		}

	}

}

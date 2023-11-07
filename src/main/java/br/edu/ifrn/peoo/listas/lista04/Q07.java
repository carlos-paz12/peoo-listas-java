package br.edu.ifrn.peoo.listas.lista04;

import java.util.Random;
import java.util.Scanner;

public class Q07 {

	public static void main(String[] args) {

		Scanner read = new Scanner(System.in);
		Random random = new Random();
		int vetor[] = new int[20], num;

		int i = 0;
		while (i < vetor.length) {

			vetor[i] = random.nextInt(101);

			i++;

		}

		System.out.println("Foi gerado um vetor de 20 casas com valores inteiros entre 0 e 100.\n");
		System.out.print("Digite o número inteiro deseja procurar dentro do vetor gerado: ");
		num = read.nextInt();

		int j = 0;
		while (j < vetor.length) {

			if (num == vetor[j]) {

				System.out.printf("\nEsse número pertence ao vetor e está no índice %d\n\n", j);
				System.out.print("VETOR GERADO: ");

				for (int k = 0; k < vetor.length; k++) {

					System.out.printf("[%d] ", vetor[k]);

				}
				break;

			} else if (j == vetor.length - 1) {

				System.out.print("\nEsse número não pertence ao vetor.\n\n");
				System.out.print("VETOR GERADO: ");

				for (int l = 0; l < vetor.length; l++) {

					System.out.printf("[%d] ", vetor[l]);

				}

			}

			j++;

		}

	}

}

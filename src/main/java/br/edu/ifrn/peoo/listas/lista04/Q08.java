package br.edu.ifrn.peoo.listas.lista04;

import java.util.Scanner;

public class Q08 {

	public static void main(String[] args) {

		Scanner read = new Scanner(System.in);
		int lados[] = new int[7];

		System.out.print("Quantas vezes o dado foi lançado? ");
		int lancamentos[] = new int[read.nextInt()];
		System.out.print("\n");

		int i = 0;
		while (i < lancamentos.length) {

			System.out.printf("Qual face foi obtida no %d° giro? ", (i + 1));
			lancamentos[i] = read.nextInt();

			if (lancamentos[i] < 1 || lancamentos[i] > 6) {

				System.out.print("<Digite um número válido>\n\n");
				continue;

			}

			i++;

		}

		int j = 0;
		while (j < lancamentos.length) {

			lados[lancamentos[j]]++;

			j++;

		}

		System.out.print("\n");

		int k = 1;
		while (k < lados.length) {

			System.out.printf("A face de número %d foi obtida %d vez(es).\n", k, lados[k]);

			k++;

		}

	}

}

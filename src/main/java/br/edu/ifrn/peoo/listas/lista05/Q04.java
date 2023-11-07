package br.edu.ifrn.peoo.listas.lista05;

import java.util.Scanner;

public class Q04 {

	public static void main(String[] args) {

		Scanner read = new Scanner(System.in);
		double[][] mReal = { { 22.2, 46.0, 88.0 }, { 12.8, 96.4, 55.5 }, { 25.0, 10.0, 26.6 }, };
		boolean encontrado = false;
		int linha = 0, coluna = 0;

		System.out.printf("Foi gerada uma matriz (3x3) com números reais entre 0 e 100.\n\n");
		System.out.printf("Digite o número que deseja procurar dentro dessa matriz: ");
		double num = read.nextDouble();

		for (int i = 0; i < mReal.length; i++) {

			for (int j = 0; j < mReal[i].length; j++) {

				if (num == mReal[i][j]) {

					linha = i;
					coluna = j;
					encontrado = true;

				}

			}

		}

		if (encontrado) {

			System.out.printf("\nO número foi encontrado na posição [%d][%d] da matriz.\n", linha, coluna);
			System.out.printf("\nMatriz gerada:\n");

			for (int i = 0; i < mReal.length; i++) {

				for (int j = 0; j < mReal[i].length; j++) {

					System.out.printf("%.1f ", mReal[i][j]);

				}

				System.out.printf("\n");

			}

		} else {

			System.out.printf("\nO número não foi encontrado dentro da matriz.");

		}

	}

}

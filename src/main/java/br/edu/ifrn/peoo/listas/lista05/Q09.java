package br.edu.ifrn.peoo.listas.lista05;

import java.util.Scanner;

public class Q09 {

	public static void main(String[] args) {

		Scanner read = new Scanner(System.in);
		final int LINHAS = 4, COLUNAS = 4;
		int[][] matriz = new int[LINHAS][COLUNAS];
		int linhasNulas = 0, colunasNulas = 0;

		for (int linha = 0; linha < LINHAS; linha++) {

			for (int coluna = 0; coluna < COLUNAS; coluna++) {

				System.out.printf("Informe um valor inteiro para a posição [%d][%d] da matriz: ", linha, coluna);
				matriz[linha][coluna] = read.nextInt();

			}

		}

		for (int linha = 0; linha < LINHAS; linha++) {

			int cont1 = 0;

			for (int coluna = 0; coluna < COLUNAS; coluna++) {

				if (matriz[linha][coluna] == 0) {

					cont1++;

				}

			}

			if (cont1 == LINHAS) {

				linhasNulas++;

			}

		}

		for (int coluna = 0; coluna < COLUNAS; coluna++) {

			int cont2 = 0;

			for (int linha = 0; linha < LINHAS; linha++) {

				if (matriz[linha][coluna] == 0) {

					cont2++;

				}

			}

			if (cont2 == COLUNAS) {

				colunasNulas++;

			}

		}

		System.out.printf("\nMatriz digitada:\n");

		for (int linha = 0; linha < LINHAS; linha++) {

			for (int coluna = 0; coluna < COLUNAS; coluna++) {

				System.out.printf("%d ", matriz[linha][coluna]);

			}

			System.out.printf("\n");

		}

		System.out.printf("\nLinhas nulas da matriz: %d\nColunas nulas da matriz: %d", linhasNulas, colunasNulas);

	}

}

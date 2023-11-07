package br.edu.ifrn.peoo.listas.lista05;

import java.util.Scanner;

public class Q10 {

	public static void main(String[] args) {

		Scanner read = new Scanner(System.in);
		final int LINHAS = 5, COLUNAS = 7;
		double[][] matriz = new double[LINHAS][COLUNAS];
		double[] maioresLinha = new double[LINHAS], maioresColuna = new double[COLUNAS];
		double[] mediaColunas = new double[COLUNAS];
		double produto = 1;
		int negativos = 0;

		for (int linha = 0; linha < LINHAS; linha++) {

			for (int coluna = 0; coluna < COLUNAS; coluna++) {

				System.out.printf("Informe uma valor para a posição [%d][%d] da matriz: ", linha, coluna);
				matriz[linha][coluna] = read.nextDouble();

			}

		}

		System.out.printf("\nMatriz digitada:\n");

		for (int linha = 0; linha < LINHAS; linha++) {

			for (int coluna = 0; coluna < COLUNAS; coluna++) {

				System.out.printf("%.1f ", matriz[linha][coluna]);

			}

			System.out.printf("\n");

		}

		System.out.print("\nMaiores valores de cada linha:\n");

		for (int linha = 0; linha < LINHAS; linha++) {

			for (int coluna = 0; coluna < COLUNAS; coluna++) {

				maioresLinha[linha] = matriz[linha][coluna];

			}

		}

		for (int linha = 0; linha < LINHAS; linha++) {

			for (int coluna = 0; coluna < COLUNAS; coluna++) {

				if (matriz[linha][coluna] > maioresLinha[linha]) {

					maioresLinha[linha] = matriz[linha][coluna];

				}

			}

			System.out.printf("Linha %d - [%.1f]\n", linha, maioresLinha[linha]);

		}

		System.out.print("\nMaiores valores de cada coluna:\n");

		for (int coluna = 0; coluna < COLUNAS; coluna++) {

			for (int linha = 0; linha < LINHAS; linha++) {

				maioresColuna[coluna] = matriz[linha][coluna];

			}

		}

		for (int coluna = 0; coluna < COLUNAS; coluna++) {

			for (int linha = 0; linha < LINHAS; linha++) {

				if (matriz[linha][coluna] > maioresColuna[coluna]) {

					maioresColuna[coluna] = matriz[linha][coluna];

				}

			}

			System.out.printf("Coluna %d - [%.1f]\n", coluna, maioresColuna[coluna]);

		}

		System.out.print("\nMédia dos valores de cada coluna:\n");

		for (int coluna = 0; coluna < COLUNAS; coluna++) {

			double soma = 0;

			for (int linha = 0; linha < LINHAS; linha++) {

				soma += matriz[linha][coluna];
				mediaColunas[coluna] = soma / COLUNAS;

			}

			System.out.printf("Coluna %d - [%.1f]\n", coluna, mediaColunas[coluna]);

		}

		for (int linha = 0; linha < LINHAS; linha++) {

			for (int coluna = 0; coluna < COLUNAS; coluna++) {

				double aux = matriz[linha][coluna];

				if (matriz[linha][coluna] != 0) {

					produto = produto * aux;

				}

			}

		}

		System.out.printf("\nProduto dos elementos diferentes de 0 da matriz: %.1f\n", produto);

		for (int linha = 0; linha < LINHAS; linha++) {

			for (int coluna = 0; coluna < COLUNAS; coluna++) {

				if (matriz[linha][coluna] < 0) {

					negativos++;

				}

			}

		}

		System.out.printf("\nA matriz digitada tem %d elementos negativos.\n", negativos);

	}

}

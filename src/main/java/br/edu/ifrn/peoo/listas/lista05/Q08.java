package br.edu.ifrn.peoo.listas.lista05;

import java.util.Scanner;

public class Q08 {

	public static void main(String[] args) {

		Scanner read = new Scanner(System.in);
		int[][] matriz = new int[6][6];
		int[] diagonalPrincipal = new int[matriz.length], valoresPares = new int[18];

		int aux = 0;
		for (int linha = 0; linha < matriz.length; linha++) {

			for (int coluna = 0; coluna < matriz[linha].length; coluna++) {

				System.out.printf("Informe um valor inteiro para a posição [%d][%d] da matriz: ", linha, coluna);
				matriz[linha][coluna] = read.nextInt();

				if (coluna == linha) {

					diagonalPrincipal[coluna] = matriz[linha][coluna];

				}

				if (linha == 0 || linha % 2 == 0) {

					valoresPares[aux] = matriz[linha][coluna];
					aux++;

				}

			}

		}

		System.out.printf("\nMatriz digitada:\n");

		for (int linha = 0; linha < matriz.length; linha++) {

			for (int coluna = 0; coluna < matriz[linha].length; coluna++) {

				System.out.printf("%d ", matriz[linha][coluna]);

			}

			System.out.printf("\n");

		}

		System.out.printf("\nVetor com os elementos da diagonal principal da matriz: ");

		for (int i = 0; i < diagonalPrincipal.length; i++) {

			System.out.printf("[%d] ", diagonalPrincipal[i]);

		}

		System.out.printf("\nVetor com os elementos das linhas pares da matriz: ");

		for (int i = 0; i < valoresPares.length; i++) {

			System.out.printf("[%d] ", valoresPares[i]);

		}

	}

}

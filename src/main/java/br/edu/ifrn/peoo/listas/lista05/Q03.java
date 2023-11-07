package br.edu.ifrn.peoo.listas.lista05;

import java.util.Scanner;

public class Q03 {

	public static void main(String[] args) {

		Scanner read = new Scanner(System.in);
		int[][] mInt = new int[3][3];

		for (int linha = 0; linha < mInt.length; linha++) {

			for (int coluna = 0; coluna < mInt[linha].length; coluna++) {

				System.out.printf("Informe um valor inteiro para a posição [%d][%d] da matriz: ", linha, coluna);
				mInt[linha][coluna] = read.nextInt();

			}

		}

		System.out.printf("\nElementos da diagonal principal da matriz digitada:\n");

		for (int linha = 0; linha < mInt.length; linha++) {

			for (int coluna = 0; coluna < mInt[linha].length; coluna++) {

				if (coluna == linha) {

					System.out.printf("%d ", mInt[linha][coluna]);

				} else {

					System.out.printf("* ");

				}

			}

			System.out.printf("\n");

		}

	}

}

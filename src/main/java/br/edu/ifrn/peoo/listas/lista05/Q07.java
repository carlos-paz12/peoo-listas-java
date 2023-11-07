package br.edu.ifrn.peoo.listas.lista05;

import java.util.Scanner;

public class Q07 {

	public static void main(String[] args) {

		Scanner read = new Scanner(System.in);

		int mA[][] = new int[5][5];
		int mB[][] = new int[5][5];
		int mC[][] = new int[5][5];

		System.out.println("-PRIMEIRA MATRIZ-");

		for (int i = 0; i < 5; ++i) {

			for (int j = 0; j < 5; ++j) {

				System.out.printf("Matriz A L[%d]C[%d]: \n", i, j);
				mA[i][j] = read.nextInt();

			}

		}

		System.out.println("-SEGUNDA MATRIZ-");

		for (int i = 0; i < 5; ++i) {

			for (int j = 0; j < 5; ++j) {

				System.out.printf("Matriz B L[%d] C[%d]: \n", i, j);
				mB[i][j] = read.nextInt();

			}

		}

		System.out.println("MATRIZ C (SUBTRAÇÃO DA M.A E M.B):");

		for (int i = 0; i < 5; ++i) {

			for (int j = 0; j < 5; ++j) {

				mC[i][j] = mA[i][j] - mB[i][j];

				System.out.println("L[" + i + "]" + " C[" + j + "]:" + mC[i][j]);

			}

		}

	}

}

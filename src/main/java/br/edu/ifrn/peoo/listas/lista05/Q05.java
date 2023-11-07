package br.edu.ifrn.peoo.listas.lista05;

import java.util.Scanner;

public class Q05 {

	public static void main(String[] args) {

		Scanner read = new Scanner(System.in);
		final int LINHAS = 20, COLUNAS = 3;
		double[][] notas = new double[LINHAS][COLUNAS];
		double[] mediaIndividual = new double[LINHAS], mediaPorAtividade = new double[COLUNAS];
		char[] conceitos = new char[LINHAS];

		for (int i = 0; i < LINHAS; i++) {

			System.out.printf("Aluno %d: Informe a nota obtida na primeira prova: ", (i + 1));
			notas[i][COLUNAS - COLUNAS] = read.nextDouble();
			System.out.printf("Aluno %d: Informe a nota obtida na segunda prova: ", (i + 1));
			notas[i][COLUNAS - 2] = read.nextDouble();
			System.out.printf("Aluno %d: Informe a nota obtida no trabalho: ", (i + 1));
			notas[i][COLUNAS - 1] = read.nextDouble();

		}

		for (int i = 0; i < LINHAS; i++) {

			mediaIndividual[i] = (0.4 * notas[i][0]) + (0.4 * notas[i][1]) + (0.2 * notas[i][2]);

			if (mediaIndividual[i] >= 9.0) {

				conceitos[i] = 'A';

			} else if (mediaIndividual[i] < 9.0 && mediaIndividual[i] >= 7.5) {

				conceitos[i] = 'B';

			} else if (mediaIndividual[i] < 7.5 && mediaIndividual[i] >= 6.0) {

				conceitos[i] = 'C';

			} else if (mediaIndividual[i] < 6.0 && mediaIndividual[i] >= 3.0) {

				conceitos[i] = 'R';

			} else if (mediaIndividual[i] < 3) {

				conceitos[i] = 'D';

			}
		}

		for (int i = 0; i < COLUNAS; i++) {

			double cont = 0;

			for (int j = 0; j < LINHAS; j++) {

				cont = cont + notas[j][i];
				mediaPorAtividade[i] = cont / LINHAS;

			}

		}

		System.out.printf("\nALUNO: | N1  | N2  | N3  | MF  | CONCEITO |");
		System.out.printf("\n       |     |     |     |     |          |\n");

		for (int i = 0; i < notas.length; i++) {

			for (int j = 0; j < 1; j++) {

				if (i < 9) {

					System.out.printf("%d      | %.1f | %.1f | %.1f | %.1f |     %c    |\n", (i + 1), notas[i][j],
							notas[i][j + 1], notas[i][j + 2], mediaIndividual[i], conceitos[i]);

				} else {

					System.out.printf("%d     | %.1f | %.1f | %.1f | %.1f |     %c    |\n", (i + 1), notas[i][j],
							notas[i][j + 1], notas[i][j + 2], mediaIndividual[i], conceitos[i]);

				}

			}

		}

		System.out.printf("\nMÉDIA TURMA:\n");
		System.out.printf("1° PROVA | 2° PROVA | TRABALHO |\n");

		for (int i = 0; i < COLUNAS; i++) {

			System.out.printf("   %.1f     ", mediaPorAtividade[i]);

		}

	}

}
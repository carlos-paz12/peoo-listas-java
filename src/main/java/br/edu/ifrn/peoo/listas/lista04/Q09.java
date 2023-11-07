package br.edu.ifrn.peoo.listas.lista04;

import java.util.Scanner;

public class Q09 {

	public static void main(String[] args) {

		Scanner read = new Scanner(System.in);
		int vetor[] = new int[90], mais100 = 0, menos10 = 0;

		int i = 0;
		while (i < vetor.length) {

			System.out.printf("Aluno %d: Quantas horas usou a internet mês passado? (min/0 - máx/310) ", (i + 1));
			vetor[i] = read.nextInt();

			if (vetor[i] > 100) {

				mais100++;

			} else if (vetor[i] < 10) {

				menos10++;

			}

			i++;

		}

		System.out.println("\nAlunos que usaram a internet por mais de 100 horas: " + mais100);
		System.out.print("Alunos que usaram a internet menos de 10 horas: " + menos10);

	}

}

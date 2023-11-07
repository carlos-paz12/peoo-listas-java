package br.edu.ifrn.peoo.listas.lista03;

import java.util.Scanner;

public class Q21 {

	public static void main(String[] args) {

		Scanner read = new Scanner(System.in);
		int matricula, aprovados = 0, reprovados = 0, alunos = 0;
		double nota1, nota2, nota3, media;

		System.out.print("OBS: Use matrícula = 9999 para finalizar o processo.\n\n");

		int i = 9999;

		while (i == 9999) {

			System.out.print("Digite a matrícula do aluno: ");
			matricula = read.nextInt();

			if (matricula == i) {
				break;
			}

			System.out.print("Digite a primeira nota desse aluno: ");
			nota1 = read.nextDouble();
			System.out.print("Digite a primeira nota desse aluno: ");
			nota2 = read.nextDouble();
			System.out.print("Digite a primeira nota desse aluno: ");
			nota3 = read.nextDouble();

			media = ((2 * nota1) + (3 * nota2) + (4 * nota3)) / 9;

			if (media >= 5.0) {

				System.out.format("Matrícula: %d - Média anual: %.1f - Situação: APROVADO!", matricula, media);
				System.out.format("\n\n");
				aprovados++;

			} else {

				System.out.format("Matrícula: %d - Média anual: %.1f - Situação: REPROVADO!", matricula, media);
				System.out.format("\n\n");
				reprovados++;

			}

			alunos++;

		}

		System.out.format("\n\n");
		System.out.format("-DADOS TURMA: INFORMÁTICA 2º ANO MATUTINO-\n\n");
		System.out.format("TOTAL DE ALUNOS: %d\n", alunos);
		System.out.format("Alunos aprovados: %d; ", aprovados);
		System.out.format("Alunos reprovados: %d;\n", reprovados);

	}

}

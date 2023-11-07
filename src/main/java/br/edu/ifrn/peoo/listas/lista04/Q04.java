package br.edu.ifrn.peoo.listas.lista04;

import java.util.Scanner;

public class Q04 {

	public static void main(String[] args) {

		Scanner read = new Scanner(System.in);
		double vetor[] = new double[3], soma = 0, media = 0;
		int acimaDaMedia = 0;

		for (int i = 0; i < vetor.length; i++) {

			System.out.printf("Aluno %d: Informe a nota: ", (i + 1));
			vetor[i] = read.nextDouble();

			soma += vetor[i];
			media = soma / vetor.length;

		}

		System.out.printf("\n\nMédia da turma: %.1f\n\n", media);

		for (int j = 0; j < vetor.length; j++) {

			if (vetor[j] > media) {

				acimaDaMedia++;

			}

		}

		if (acimaDaMedia == 0) {

			System.out.print("Nenhum dos alunos ficou com nota acima da média.");

		} else {

			System.out.println("Quantidade de aluno(s) com nota acima da média: " + acimaDaMedia + "\n");
			System.out.println("Nota(s) do(s) aluno(s) acima da m�dia:");

			for (int k = 0; k < vetor.length; k++) {

				if (vetor[k] > media) {

					System.out.println(vetor[k]);

				}

			}

		}

	}

}

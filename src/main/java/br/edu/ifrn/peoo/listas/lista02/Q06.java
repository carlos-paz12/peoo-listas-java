package br.edu.ifrn.peoo.listas.lista02;

import java.util.Scanner;

public class Q06 {

	public static void main(String[] args) {

		Scanner read = new Scanner(System.in);
		double nota1, nota2, nota3, media;
		int faltas;

		System.out.print("Digite a nota da primeira prova: ");
		nota1 = read.nextDouble();
		System.out.print("Digite a nota da segunda prova: ");
		nota2 = read.nextDouble();
		System.out.print("Digite a nota da terceira prova: ");
		nota3 = read.nextDouble();
		System.out.print("Quantos faltas vocÊ teve: ");
		faltas = read.nextInt();
		System.out.print("\n");

		media = (nota1 + nota2 + nota3) / 3;

		if (media >= 7.0 && faltas > 7) {

			System.out.format("Sua media nas três primeiras notas foi de %.1f. Porém você reprovou por ter mais de 7 faltas!", media);

		} else if (media >= 7.0 && faltas <= 7) {

			System.out.format("Sua media nas três primeiras notas foi de %.1f e você teve no máximo 7 faltas. Você foi aprovado(a)!", media);

		}

		if (media < 7.0 && media >= 3.0 && faltas <= 7) {

			double nota4, mediaFinal;

			System.out.format("Sua media foi %.1f. Você ficou em recuperação(a) e irá fazer a prova final! \n \n", media);
			System.out.format("Que nota você tirou na prova final? ");
			nota4 = read.nextDouble();
			System.out.format("\n");

			mediaFinal = (nota1 + nota2 + nota3 + nota4) / 4;

			if (mediaFinal >= 5.0) {

				System.out.format("Sua media após fazer a prova final foi de %.1f. Você foi aprovado(a)!", mediaFinal);

			} else {

				System.out.format("Sua media após fazer a prova final foi de %.1f. Você foi reprovado(a)!", mediaFinal);

			}

		} else if (media < 7.0 && media >= 3.0 && faltas > 7) {

			System.out.format("Sua media foi %.1f e Você teve mais de 7 faltas, você está reprovado(a)!", media);

		}

		if (media < 3.0) {

			System.out.format("Sua media nas três primeiras notas foi de %.1f. Você está reprovado(a)!", media);

		}

	}

}
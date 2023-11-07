package br.edu.ifrn.peoo.listas.lista03;

import java.util.Scanner;

public class Q05 {

	public static void main(String[] args) {

		Scanner read = new Scanner(System.in);
		int idades, soma = 0, alunos = 0, media = 0;
		boolean i = true;

		System.out.print("OBS: Digite 0 a qualquer momento para finalizar o processo.\n\n");

		while (i) {

			System.out.print("Informe a idade do aluno: ");
			idades = read.nextInt();

			if (idades == 0) {
				break;
			}

			soma += idades;
			alunos++;
			media = soma / alunos;

		}

		System.out.printf("\nA m�dia de idade dos alunos � de %d anos.", media);

	}

}

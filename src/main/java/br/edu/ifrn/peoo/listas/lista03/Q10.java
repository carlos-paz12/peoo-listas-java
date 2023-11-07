package br.edu.ifrn.peoo.listas.lista03;

import java.util.Scanner;

public class Q10 {

	public static void main(String[] args) {

		Scanner read = new Scanner(System.in);
		int dentro = 0, fora = 0;

		for (int i = 0; i < 10; i++) {

			System.out.print("Digite um número: ");
			double num = read.nextDouble();

			if (num >= 0 && num <= 100) {

				dentro++;

			} else {

				fora++;

			}

		}

		System.out.printf("\nNúmeros dentro do intervalo (0, 100): " + dentro);
		System.out.printf("\nNúmeros fora do intervalo (0, 100: " + fora);

	}

}
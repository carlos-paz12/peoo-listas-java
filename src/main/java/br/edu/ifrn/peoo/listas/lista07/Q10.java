package br.edu.ifrn.peoo.listas.lista07;

import java.util.Scanner;

public class Q10 {

	static void procurarX(double[] array, double x) {

		boolean encontrado = false;
		int posicao = -1;

		for (int i = 0; i < array.length; i++) {

			if (array[i] == x) {

				encontrado = true;
				posicao = i;

			}

		}

		if (encontrado == true) {

			System.out.printf("\nEsse valor está no índice %d do vetor.", posicao);

		} else {

			System.out.print("\n" + posicao);

		}

	}

	public static void main(String[] args) {

		Scanner read = new Scanner(System.in);
		double[] array = { 1.1, 2.2, 3.3, 4.4, 5.5, 6.6, 7.7, 8.8, 9.9 };

		System.out.print("Informe um número real qualquer: ");
		double x = read.nextDouble();

		procurarX(array, x);

	}

}
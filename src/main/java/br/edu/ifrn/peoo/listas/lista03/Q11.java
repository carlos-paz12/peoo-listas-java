package br.edu.ifrn.peoo.listas.lista03;

import java.util.Scanner;

public class Q11 {

	public static void main(String[] args) {

		Scanner read = new Scanner(System.in);
		int num, cont = 0;

		System.out.print("Digite um número inteiro: ");
		num = read.nextInt();

		for (int i = 1; i <= num; i++) {

			if (num % i == 0) {

				cont++;

			}

		}

		if (cont == 2) {

			System.out.printf("\n%d é primo", num);

		} else {

			System.out.printf("\n%d não é primo", num);

		}

	}

}

package br.edu.ifrn.peoo.listas.lista03;

import java.util.Scanner;

public class Q08 {

	public static void main(String[] args) {

		Scanner read = new Scanner(System.in);

		System.out.print("Digite um número inteiro: ");
		int num = read.nextInt();
		System.out.printf("\nA tabuada do %d:", num);

		for (int i = 1; i <= 10; i++) {

			System.out.printf("\n%d x %d = %d", num, i, (i * num));

		}

	}

}

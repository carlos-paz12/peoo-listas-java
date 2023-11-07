package br.edu.ifrn.peoo.listas.lista07;

import java.util.Scanner;

public class Q04 {

	static int divisores(int x) {

		int divisores = 0;

		for (int i = 1; i <= x; i++) {

			if (x % i == 0) {

				divisores++;

			}

		}

		return divisores;

	}

	public static void main(String[] args) {

		Scanner read = new Scanner(System.in);

		System.out.print("Digite um número natural qualquer: ");
		int x = read.nextInt();

		System.out.printf("\nO número digitado tem %d divisores naturais.", divisores(x));

	}

}
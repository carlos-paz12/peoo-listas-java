package br.edu.ifrn.peoo.listas.lista07;

import java.util.Scanner;

public class Q06 {

	static int fatorial(int x) {

		int fatorial = 1;

		for (int i = x; i >= 1; i--) {

			fatorial = fatorial * i;

		}

		return fatorial;

	}

	public static void main(String[] args) {

		Scanner read = new Scanner(System.in);

		System.out.print("Digite um número natural qualquer: ");
		int x = read.nextInt();

		System.out.printf("\nO fatorial do número digitado é %d", fatorial(x));

	}

}
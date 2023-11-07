package br.edu.ifrn.peoo.listas.lista07;

import java.util.Scanner;

public class Q05 {

	static boolean primo(int x) {

		int cont = 0;

		for (int i = 1; i <= x; i++) {

			if (x % i == 0) {

				cont++;

			}

		}

		boolean resposta = cont == 2;
		return resposta;

	}

	public static void main(String[] args) {

		Scanner read = new Scanner(System.in);

		System.out.println("Digite um n�mero inteiro: ");
		int numero = read.nextInt();

		System.out.println(numero + " é um número primo? " + primo(numero));

	}

}
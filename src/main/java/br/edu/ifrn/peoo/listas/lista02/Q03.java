package br.edu.ifrn.peoo.listas.lista02;

import java.util.Scanner;

public class Q03 {

	public static void main(String[] args) {

		Scanner read = new Scanner(System.in);

		System.out.print("Digite um ano qualquer: ");
		int ano = read.nextInt();
		System.out.print("\n");

		if (ano % 4 == 0 && ano % 100 != 0) {

			System.out.print("O ano digitado é bissexto");

		} else {

			System.out.print("O ano digitado não é bissexto");

		}

	}

}
package br.edu.ifrn.peoo.listas.lista07;

import java.util.Scanner;

public class Q07 {

	static String qualquer(String x) {

		String qualquer = "";

		char[] vetor = x.toCharArray();

		for (int i = 0; i < vetor.length; i++) {

			System.out.print(vetor[i] + " ");

		}

		return qualquer;

	}

	public static void main(String[] args) {

		Scanner read = new Scanner(System.in);

		System.out.println("Digite alguma coisa: ");
		String x = read.nextLine();

		System.out.print(qualquer(x));

	}

}
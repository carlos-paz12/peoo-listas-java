package br.edu.ifrn.peoo.listas.lista05;

import java.util.Scanner;

public class Q02 {

	public static void main(String[] args) {

		Scanner read = new Scanner(System.in);

		char[][] dados = new char[2][2];

		for (int i = 0; i < dados.length; i++) {

			for (int j = 0; j < dados[i].length; j++) {

				System.out.println("Escreva uma palavra para a linha " + i + " e coluna " + j);
				dados[i][j] = read.next().charAt(0);

			}

		}

		for (int i = dados.length - 1; i >= 0; i--) {

			for (int j = dados[i].length - 1; j >= 0; j--) {

				System.out.println("");
				System.out.println("linha " + i + " || coluna " + j + ": " + dados[i][j] + " ");

			}

		}

	}

}

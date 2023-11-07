package br.edu.ifrn.peoo.listas.lista05;

import java.util.Scanner;

public class Q01 {

	public static void main(String[] args) {

		Scanner read = new Scanner(System.in);

		System.out.print("Digite a quantidade de linhas: ");
		int linhas = read.nextInt();

		System.out.print("Digite a quantidade de colunas: ");
		int colunas = read.nextInt();

		String[][] dados = new String[linhas][colunas];

		for (int i = 0; i < dados.length; i++) {

			for (int j = 0; j < dados[i].length; j++) {

				System.out.println("Escreva uma palavra para a linha " + i + " e coluna " + j);
				dados[i][j] = read.next();

			}

		}

		for (int i = 0; i < dados.length; i++) {

			for (int j = 0; j < dados[i].length; j++) {

				System.out.println("");
				System.out.println("linha " + i + " || coluna " + j + ": " + dados[i][j] + " ");

			}
		}

	}

}

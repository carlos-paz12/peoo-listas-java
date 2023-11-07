package br.edu.ifrn.peoo.listas.lista07;

import java.util.Scanner;

public class Q11 {

	public static void main(String[] args) {

		Scanner read = new Scanner(System.in);
		String[][] x = new String[2][2];

		for (int i = 0; i < x.length; i++) {

			for (int j = 0; j < x[i].length; j++) {

				System.out.print("Digite o que gostaria de armazenar: ");
				x[i][j] = read.nextLine();

			}

		}

		for (int i = 0; i < x.length; i++) {

			for (int j = 0; j < x[i].length; j++) {

				System.out.print("[ " + x[i][j] + " ]");

			}

			System.out.println();

		}

		System.out.print(qualquer(x));

	}

	static String qualquer(String[][] x) {

		String qualquer = "";

		return qualquer;

	}

}

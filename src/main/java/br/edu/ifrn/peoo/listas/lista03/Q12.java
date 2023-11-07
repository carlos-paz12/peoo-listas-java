package br.edu.ifrn.peoo.listas.lista03;

import java.util.Scanner;

public class Q12 {

	public static void main(String[] args) {

		Scanner read = new Scanner(System.in);
		int x, y, xy = 0;

		System.out.print("Digite um valor inteiro para X: ");
		x = read.nextInt();
		System.out.print("Digite um valor inteiro para Y: ");
		y = read.nextInt();

		for (int i = 1; i <= x; i++) {

			xy = xy + y;

		}

		System.out.print("\nO produto de X e Y é: " + xy);

	}

}

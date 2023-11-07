package br.edu.ifrn.peoo.listas.lista03;

import java.util.Scanner;

public class Q04 {

	public static void main(String[] args) {

		Scanner read = new Scanner(System.in);

		System.out.print("Digite um número inteiro: ");
		int num = read.nextInt();
		System.out.print("\nOs divisores positivos desse número são:\n");

		for (int i = 1; i <= num; i++) {

			if (num % i == 0) {

				System.out.println(i);

			}

		}

	}

}

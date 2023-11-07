package br.edu.ifrn.peoo.listas.lista02;

import java.util.Scanner;

public class Q04 {

	public static void main(String[] args) {

		Scanner read = new Scanner(System.in);
		int a, b, c;

		System.out.print("Digite o primeiro valor: ");
		a = read.nextInt();
		System.out.print("Digite o segundo valor: ");
		b = read.nextInt();
		System.out.print("Digite o terceiro valor: ");
		c = read.nextInt();
		System.out.print("\n");

		if (a > b && a > c && b > c) {

			System.out.format("A ordem crescente desses valores é: %d, %d, %d", c, b, a);

		} else if (a > b && a > c && c > b) {

			System.out.format("A ordem crescente desses valores é: %d, %d, %d", b, c, a);

		}

		if (b > a && b > c && a > c) {

			System.out.format("A ordem crescente desses valores é: %d, %d, %d", c, a, b);

		} else if (b > a && b > c && c > a) {

			System.out.format("A ordem crescente desses valores é: %d, %d, %d", a, c, b);

		}

		if (c > a && c > b && a > b) {

			System.out.format("A ordem crescente desses valores é: %d, %d, %d", b, a, c);

		} else if (c > a && c > b && b > a) {

			System.out.format("A ordem crescente desses valores é: %d, %d, %d", a, b, c);

		}

	}

}
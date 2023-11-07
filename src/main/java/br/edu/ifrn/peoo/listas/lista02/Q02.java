package br.edu.ifrn.peoo.listas.lista02;

import java.util.Scanner;

public class Q02 {

	public static void main(String[] args) {

		Scanner read = new Scanner(System.in);

		System.out.print("Digite um número qualquer: ");
		double numeroDigitado = read.nextDouble();
		System.out.print("\n");

		if (numeroDigitado >= 0.0 && numeroDigitado <= 100.0) {

			System.out.print("Você digitou um número entre 0 e 100");

		} else {

			System.out.print("Você digitou um número fora do intervalo entre 0 e 100");

		}

	}

}
package br.edu.ifrn.peoo.listas.lista02;

import java.util.Scanner;

public class Q01 {

	public static void main(String[] args) {

		Scanner read = new Scanner(System.in);

		System.out.print("Digite a quantidade de maçãs que você comprou: ");
		double macasCompradas = read.nextDouble();
		System.out.print("\n");

		if (macasCompradas < 12.0) {

			System.out.format("O total que você irá pagar nas maçãs é de: R$%.2f", (macasCompradas * 0.30));

		} else {

			System.out.format("O total que você irá pagar nas maçãs é de: R$%.2f", (macasCompradas * 0.25));

		}

	}

}
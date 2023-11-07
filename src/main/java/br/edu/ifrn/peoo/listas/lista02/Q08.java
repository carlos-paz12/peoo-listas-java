package br.edu.ifrn.peoo.listas.lista02;

import java.util.Scanner;

public class Q08 {

	public static void main(String[] args) {

		Scanner read = new Scanner(System.in);
		double dias, precoSoDiarias;
		String nome;

		System.out.print("Digite seu nome: ");
		nome = read.nextLine();
		System.out.format("Certo %s, me informe quantos dias você ficou hospedado no hotel: ", nome);
		dias = read.nextDouble();
		System.out.print("\n");

		precoSoDiarias = dias * 130.0;

		if (dias < 2.0) {

			double acrescimo = 0.15 * 130.0;
			double saldoTotal = acrescimo + precoSoDiarias;

			System.out.format("%s, o valor total que você irá pagar ao hotel é de: R$%.2f", nome, saldoTotal);

		}

		if (dias == 2.0 || dias == 3.0) {

			double acrescimo = 0.1 * 130.0;
			double saldoTotal = acrescimo + precoSoDiarias;

			System.out.format("%s, o valor total que você irá pagar ao hotel é de: R$%.2f", nome, saldoTotal);

		}

		if (dias >= 4.0 && dias < 7.0) {

			double acrescimo = 0.075 * 130.0;
			double saldoTotal = acrescimo + precoSoDiarias;

			System.out.format("%s, o valor total que você irá pagar ao hotel é de: R$%.2f", nome, saldoTotal);

		}

		if (dias >= 7.0) {

			double acrescimo = 0.05 * 130.0;
			double saldoTotal = acrescimo + precoSoDiarias;

			System.out.format("%s, o valor total que você irá pagar ao hotel é de: R$%.2f", nome, saldoTotal);

		}

	}

}
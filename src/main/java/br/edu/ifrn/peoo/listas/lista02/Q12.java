package br.edu.ifrn.peoo.listas.lista02;

import java.util.Scanner;

public class Q12 {

	public static void main(String[] args) {

		Scanner read = new Scanner(System.in);

		System.out.print("Digite um número de 1 a 7: ");
		int numeroDigitado = read.nextInt();
		System.out.print("\n");

		switch (numeroDigitado) {

			case 1:
				System.out.println("O primeiro dia da semana é o Domingo.");
				break;
			case 2:
				System.out.println("O segundo dia da semana é a Segunda-feira.");
				break;
			case 3:
				System.out.println("O terceiro dia da semana é a Terça-feira.");
				break;
			case 4:
				System.out.println("O quarto dia da semana é a Quarta-feira.");
				break;
			case 5:
				System.out.println("O quinto dia da semana é a Quinta-feira.");
				break;
			case 6:
				System.out.println("O sexto dia da semana é a Sexta-feira.");
				break;
			case 7:
				System.out.println("O sétimo dia da semana é o Sábado.");
				break;
			default:
				System.out.format("<3RROR:1:java;DigiteUmNúmeroDe1A7;valueinvalid%d:3RROR>", numeroDigitado);
				break;

		}

	}

}
package br.edu.ifrn.peoo.listas.lista02;

import java.util.Scanner;

public class Q05 {

	public static void main(String[] args) {

		Scanner read = new Scanner(System.in);
		int inicio, termino;

		System.out.print("Digite o horário do inicio do jogo (ex: 14): ");
		inicio = read.nextInt();
		System.out.print("Digite o horário do termino do jogo (ex: 16): ");
		termino = read.nextInt();
		System.out.print("\n");

		if (inicio == termino) {

			System.out.println("O jogo durou 24 hora(s).");

		}

		if (inicio > termino) {

			System.out.format("O jogo durou %d hora(s).", (24 - (inicio - termino)));

		} else if (termino > inicio) {

			System.out.format("O jogo durou %d hora(s).", (termino - inicio));

		}

	}

}
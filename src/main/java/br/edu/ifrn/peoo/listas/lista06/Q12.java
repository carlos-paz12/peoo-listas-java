package br.edu.ifrn.peoo.listas.lista06;

import java.util.Scanner;

public class Q12 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		System.out.println("Digite alguma coisa e eu mostrarei a saída com a primeira letra de cada palavra.");
		String teclado = leia.nextLine();

		String[] a = teclado.split(" ");
		String[] b = a;

		for (int i = 0; i < a.length; i++) {

			System.out.print(b[i].charAt(0));

		}

	}

}

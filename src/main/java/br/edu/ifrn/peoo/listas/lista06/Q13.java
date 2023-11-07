package br.edu.ifrn.peoo.listas.lista06;

import java.util.Scanner;

public class Q13 {

	public static void main(String[] args) {

		Scanner read = new Scanner(System.in);
		String typed;
		boolean check = false;

		do {

			System.out.print("Digite seu número de celular (apenas números): ");
			typed = read.nextLine();

			if (typed.length() != 11) {

				System.out.println("Impossível formatar esse número. Tente novamente!\n");
				continue;

			}

			check = true;

		} while (check == false);

		StringBuilder phone = new StringBuilder(typed);

		phone.insert(0, "(");
		phone.insert(3, ") ");
		phone.insert(10, "-");

		System.out.printf("\nSeu número de celular é: %s", phone.toString());

	}

}

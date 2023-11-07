package br.edu.ifrn.peoo.listas.lista02;

import java.util.Scanner;

public class Q13 {

	public static void main(String[] args) {

		Scanner read = new Scanner(System.in);
		String nome;
		double idade;

		System.out.print("Digite seu nome: ");
		nome = read.nextLine();
		System.out.print("Digite sua idade: ");
		idade = read.nextDouble();
		System.out.print("\n");

		if (idade >= 5 && idade <= 10) {

			System.out.format("%s, você fará parte da categoria Infantil.", nome);

		}

		if (idade >= 11 && idade <= 15) {

			System.out.format("%s, você fará parte da categoria Juvenil.", nome);

		}

		if (idade >= 16 && idade <= 20) {

			System.out.format("%s, você fará parte da categoria Júnior.", nome);

		}

		if (idade >= 21 && idade <= 25) {

			System.out.format("%s, você fará parte da categoria Profissional.", nome);

		}

	}

}
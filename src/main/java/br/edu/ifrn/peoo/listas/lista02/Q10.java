package br.edu.ifrn.peoo.listas.lista02;

import java.util.Scanner;

public class Q10 {

	public static void main(String[] args) {

		Scanner read = new Scanner(System.in);
		String pergunta1, pergunta2, pergunta3, pergunta4, pergunta5;
		int suspeitas = 0;

		System.out.print("Responda as perguntas a seguir apenas com \"Sim\" ou \"Não\".");
		System.out.print("\n \n");
		System.out.print("Você telefonou para a vítima? ");
		pergunta1 = read.nextLine();
		pergunta1 = pergunta1.toLowerCase();
		if (pergunta1.equals("sim")) {
			suspeitas++;
		}

		System.out.print("Você já esteve no local do crime? ");
		pergunta2 = read.nextLine();
		pergunta2 = pergunta2.toLowerCase();
		if (pergunta2.equals("sim")) {
			suspeitas++;
		}

		System.out.print("Você morava perto da vítima? ");
		pergunta3 = read.nextLine();
		pergunta3 = pergunta3.toLowerCase();
		if (pergunta3.equals("sim")) {
			suspeitas++;
		}

		System.out.print("Você tinha dívidas abertas com a vítima? ");
		pergunta4 = read.nextLine();
		pergunta4 = pergunta4.toLowerCase();
		if (pergunta4.equals("sim")) {
			suspeitas++;
		}

		System.out.print("Você já trabalhou para/com a vátima? ");
		pergunta5 = read.nextLine();
		pergunta5 = pergunta5.toLowerCase();
		if (pergunta5.equals("sim")) {
			suspeitas++;
		}

		System.out.print("\n");

		switch (suspeitas) {

			case 0:
			case 1:
				System.out.println("Você é inocente, pode ir.");
				break;
			case 2:
				System.out.println("Você é um de nosso suspeitos.");
				break;
			case 3:
			case 4:
				System.out.println("Você é cúmplice deste assassinato!");
				break;
			case 5:
				System.out.println("Você é o assassino!");
				break;
			default:

		}

	}

}
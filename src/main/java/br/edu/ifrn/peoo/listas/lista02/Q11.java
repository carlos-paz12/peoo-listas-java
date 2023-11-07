package br.edu.ifrn.peoo.listas.lista02;

import java.util.Scanner;

public class Q11 {

	public static void main(String[] args) {

		Scanner read = new Scanner(System.in);
		int codiguin, quantia;

		System.out.println("CÓDIGO:     PRODUTO:     VALOR:");
		System.out.print("\n");
		System.out.println("200         Chuteira     R$159,99");
		System.out.println("301         Meião        R$14,99");
		System.out.println("102         Camiseta     R$59,99");
		System.out.println("403         Calção       R$29,99");
		System.out.print("\n");

		System.out.print("Digite o código do produto que você tem interesse em adquirir: ");
		codiguin = read.nextInt();

		if (codiguin != 200 && codiguin != 301 && codiguin != 102 && codiguin != 403) {

			System.out.println("Este código não corresponde a nenhum produto, reinicie o programa.");
			System.out.println("\n");
			// return; Isso tava aqui por algum motivo que n�o me lembro kkkk

		}

		System.out.print("Quantas peças você quer comprar desse produto? ");
		quantia = read.nextInt();
		System.out.print("\n");

		switch (codiguin) {

			case 200:
				System.out.format("O preço total que você irá pagar é de R$%.2f", (159.99 * quantia));
				break;
			case 301:
				System.out.format("O preço total que você irá pagar é de R$%.2f", (14.99 * quantia));
				break;
			case 102:
				System.out.format("O preço total que você irá pagar é de R$%.2f", (59.99 * quantia));
				break;
			case 403:
				System.out.format("O preço total que você irá pagar é de R$%.2f", (29.99 * quantia));
				break;
			default:

		}

	}

}
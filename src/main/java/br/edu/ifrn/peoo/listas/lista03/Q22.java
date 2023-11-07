package br.edu.ifrn.peoo.listas.lista03;

import java.util.Scanner;

public class Q22 {

	public static void main(String[] args) {

		Scanner read = new Scanner(System.in);
		boolean i = true;
		int codigo;
		double quantidade, lancheTotal = 0.0;
		String atender = "";

		System.out.print("___________ C A R D Á P I O ___________\n\n");
		System.out.print("Código:         Produto:          Preço:\n");
		System.out.print("100         Cachorro Quente       R$1,10\n");
		System.out.print("101          Bauru simples        R$1,30\n");
		System.out.print("102           Bauru c/ovo         R$1,50\n");
		System.out.print("103            Hamburguer         R$1,10\n");
		System.out.print("104          Cheeseburguer        R$1,30\n");
		System.out.print("105              Refri            R$1,00\n");
		System.out.print("________________________________________\n");

		while (i) {

			System.out.print("\nDigite o código do produto que deseja comprar: ");
			codigo = read.nextInt();

			if (codigo < 100 || codigo > 105) {

				System.out.print("ESTE PRODUTO NÃO EXISTE. TENTE NOVAMENTE!\n");
				continue;

			}

			System.out.print("Quantas unidades vai querer desse produto? ");
			quantidade = read.nextDouble();

			switch (codigo) {

				case 100:
					double compraHotDog = quantidade * 1.10;
					lancheTotal += compraHotDog;
					break;
				case 101:
					double compraBauru = quantidade * 1.30;
					lancheTotal += compraBauru;
					break;
				case 102:
					double compraBauruOvo = quantidade * 1.50;
					lancheTotal += compraBauruOvo;
					break;
				case 103:
					double compraBurguer = quantidade * 1.10;
					lancheTotal += compraBurguer;
					break;
				case 104:
					double compraCheese = quantidade * 1.30;
					lancheTotal += compraCheese;
					break;
				case 105:
					double compraRefri = quantidade * 1.0;
					lancheTotal += compraRefri;
					break;
				default:

			}

			System.out.print("Algo mais? (sim ou não) ");
			atender = read.next();

			if (atender.equalsIgnoreCase("não")) {
				break;
			}

		}

		System.out.format("\nTotal a pagar R$%.2f", lancheTotal);

	}

}

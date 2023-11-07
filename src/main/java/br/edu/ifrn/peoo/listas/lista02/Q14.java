package br.edu.ifrn.peoo.listas.lista02;

import java.util.Scanner;

public class Q14 {

	public static void main(String[] args) {

		Scanner read = new Scanner(System.in);

		System.out.println("Acesso ao Portal IFRN> \n");
		System.out.println("Acessar campus SC> tecle 1: ");
		System.out.println("Acessar campus NC> tecle 2: ");
		System.out.println("Acessar campus CNAT> tecle 3: ");
		System.out.println("Acessar campus CANG> tecle 4: ");
		System.out.println("Acessar campus JC> tecle 5: ");
		int digito = read.nextInt();
		System.out.println("\n");

		switch (digito) {

			case 1:
				System.out.println("Acesso ao Portal IFRN/Santa Cruz>");
				break;
			case 2:
				System.out.println("Acesso ao Portal IFRN/Nova Cruz>");
				break;
			case 3:
				System.out.println("Acesso ao Portal IFRN/Natal Central>");
				break;
			case 4:
				System.out.println("Acesso ao Portal IFRN/Canguaretama>");
				break;
			case 5:
				System.out.println("Acesso ao Portal IFRN/João Câmara>");
				break;
			default:
				System.out.println("Este digito não corresponde a nenhum campus.");
				break;

		}

	}

}
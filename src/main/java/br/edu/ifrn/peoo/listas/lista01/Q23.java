package br.edu.ifrn.peoo.listas.lista01;

import java.util.Scanner;

public class Q23 {

	public static void main(String[] args) {

		Scanner read = new Scanner(System.in);

		int idadeDias, anosVivos, mesesVivos, diasVivos, resto;

		System.out.print("Digite sua idade em dias: ");
		idadeDias = read.nextInt();

		anosVivos = idadeDias / 365;
		resto = idadeDias - anosVivos * 365;
		mesesVivos = resto / 30;
		diasVivos = resto - mesesVivos * 30;

		System.out.println("");
		System.out.println("!!!SACA SÓ A MÁGICA!!!");
		System.out.println("");
		System.out.println("Vc está vivo há " + anosVivos + " ano(s)");
		System.out.println(mesesVivos + " mes(es)");
		System.out.println("e " + diasVivos + " dia(s)");

	}

}
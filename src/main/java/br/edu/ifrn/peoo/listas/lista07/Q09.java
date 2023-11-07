package br.edu.ifrn.peoo.listas.lista07;

import java.util.Scanner;

public class Q09 {

	static int numero(int a) {

		int numeroa = 0;

		return numeroa;

	}

	public static void main(String[] args) {

		Scanner read = new Scanner(System.in);

		System.out.println("Informe um núm0ero: (inteiro e real) ");
		String numeroa = read.nextLine();
		System.out.println("Informe um número para ser comparado com o primeiro: ");
		String numerob = read.nextLine();

		System.out.println((numeroa.contains(numerob)));

	}

}
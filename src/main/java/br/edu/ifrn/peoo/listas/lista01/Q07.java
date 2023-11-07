package br.edu.ifrn.peoo.listas.lista01;

import java.util.Scanner;

public class Q07 {

	public static void main(String[] args) {
		
		Scanner read = new Scanner(System.in);
		
		double provaE, provaD, provaT, notaF;
		
		System.out.print("Digite a nota do concorrente na Prova Escrita: ");
		provaE = read.nextDouble();
		System.out.print("Digite a nota do concorrente na Prova de Desempenho: ");
		provaD = read.nextDouble();
		System.out.print("Digite a nota do concorrente na Prova de T�tulos: ");
		provaT = read.nextDouble();
		
		notaF = 0.4 * provaE + 0.4 * provaD + 0.2 * provaT;
		
		System.out.println("");
		System.out.println("A nota final desse concorrente foi de " + notaF + "pontos");
		
	}

}
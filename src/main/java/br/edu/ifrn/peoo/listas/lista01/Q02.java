package br.edu.ifrn.peoo.listas.lista01;

import java.util.Scanner;

public class Q02 {

	public static void main(String[] args) {
		
		Scanner read = new Scanner(System.in);
		
		int valorFornecido, sucessor, antecessor;
		
		System.out.print("Digite um número INTEIRO qualquer: ");
		valorFornecido = read.nextInt();
		
		sucessor = valorFornecido + 1;
		antecessor = valorFornecido - 1;
		
		System.out.println("");
		System.out.println("O sucessor e o antecessor do número digitado são respectivamente: " + sucessor + " e " + antecessor);
		
	}

}
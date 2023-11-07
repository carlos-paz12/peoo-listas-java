package br.edu.ifrn.peoo.listas.lista01;

import java.util.Scanner;

public class Q04 {

	public static void main(String[] args) {
		
		Scanner read = new Scanner(System.in);
		
		double valorA, valorB, soma;
		
		System.out.print("Digite qualquer valor: ");
		valorA = read.nextDouble();
		System.out.print("Digite o valor que deseja somar com " + valorA + ": ");
		valorB = read.nextDouble();
		
		soma = valorA + valorB;
		
		System.out.println("");
		System.out.println("A soma é: " + soma);

	}

}
package br.edu.ifrn.peoo.listas.lista01;

import java.util.Scanner;

public class Q01 {

	public static void main(String[] args) {
		
		Scanner read = new Scanner(System.in);
		
		double valorA, valorB, valorC, media;
		
		System.out.print("Digite o primeiro valor: ");
		valorA = read.nextDouble();
		System.out.print("Digite o segundo valor: ");
		valorB = read.nextDouble();
		System.out.print("Digite o terceiro valor: ");
		valorC = read.nextDouble();
		
		media = (valorA + valorB + valorC) / 3;
		
		System.out.println("");
		System.out.print("A média entre os valores fornecidos é: " + media);

	}

}
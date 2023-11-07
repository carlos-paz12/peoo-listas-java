package br.edu.ifrn.peoo.listas.lista01;

import java.util.Scanner;

public class Q03 {

	public static void main(String[] args) {
		
		Scanner read = new Scanner(System.in);
		
		double valorDigitado, potencia, raiz;
		
		System.out.print("Digite um número qualquer: ");
		valorDigitado = read.nextDouble();
		
		potencia = Math.pow(valorDigitado, 5);
		raiz = Math.sqrt(valorDigitado);
		
		System.out.println("");
		System.out.println("A quinta potência desse número é: " + potencia);
		System.out.println("A raiz quadrada desse número é: " + raiz);

	}

}
package br.edu.ifrn.peoo.listas.lista01;

import java.util.Scanner;

public class Q21 {

	public static void main(String[] args) {
		
		Scanner read = new Scanner(System.in);
		
		double angulo, seno, cosseno, tangente;
		
		System.out.println("Digite o valor do ângulo: ");
		angulo = read.nextDouble();
		
		seno = Math.sin(angulo);
		cosseno = Math.cos(angulo);
		tangente = Math.tan(angulo);
		
		System.out.println("");
		System.out.println("O seno de " + angulo + " é " + seno);
		System.out.println("O cosseno de " + angulo + " é " + cosseno);
		System.out.println("A tangente de " + angulo + " é " + tangente);
		
	}

}
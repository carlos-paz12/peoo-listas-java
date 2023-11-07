package br.edu.ifrn.peoo.listas.lista01;

import java.util.Scanner;

public class Q14 {

	public static void main(String[] args) {
		
		Scanner read = new Scanner(System.in);
		
		double base, altura, area;
		
		System.out.print("Digite o valor da base do triângulo (em cm): ");
		base = read.nextDouble();
		System.out.print("Digite o valor da altura do triângulo (em cm): ");
		altura = read.nextDouble();
		
		area = base * altura / 2;

		System.out.println("");
		System.out.println("A área desse triângulo vale: " + area + "cm²");
		
	}

}
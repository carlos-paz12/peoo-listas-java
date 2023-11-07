package br.edu.ifrn.peoo.listas.lista01;

import java.util.Scanner;

public class Q12 {

	public static void main(String[] args) {
		
		Scanner read = new Scanner(System.in);
		double euro, real;
		
		System.out.print("Digite o valor em euro(EUR €): ");
		euro = read.nextDouble();
		
		real = euro * 4.32;
		
		System.out.println("");
		System.out.println(euro + "€ está custando: R$" + real);
		
	}

}
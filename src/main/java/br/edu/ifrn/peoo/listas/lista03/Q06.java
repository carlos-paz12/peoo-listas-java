package br.edu.ifrn.peoo.listas.lista03;

import java.util.Scanner;

public class Q06 {

	public static void main(String[] args) {
		
		Scanner read = new Scanner(System.in);
		int num, fatorial = 1;
		
		System.out.print("Digite um número inteiro: ");
		num = read.nextInt();
		
		for (int i = num; i >= 1; i--) {
		
			fatorial = fatorial * i;
			
		}
		
		System.out.print("\nO fatorial desse número é: " + fatorial);
		
	}

}

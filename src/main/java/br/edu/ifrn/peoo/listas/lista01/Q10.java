package br.edu.ifrn.peoo.listas.lista01;

import java.util.Scanner;

public class Q10 {

	public static void main(String[] args) {

		Scanner read = new Scanner(System.in);
		
		double saldoInicial, reajuste, saldoReajustado;
		
		System.out.print("Digite o valor inicial da conta: ");
		saldoInicial = read.nextDouble();
		
		reajuste = (7.5 / 100) * saldoInicial;
		saldoReajustado = saldoInicial + reajuste;
		
		System.out.println("");
		System.out.println("Com um reajuste de 7,5% do valor, seu saldo inicial de R$" + saldoInicial + " passou a ser de R$" +  saldoReajustado);
		
	}

}
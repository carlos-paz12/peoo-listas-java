package br.edu.ifrn.peoo.listas.lista01;

import java.util.Scanner;

public class Q20 {

	public static void main(String[] args) {
		
		Scanner read = new Scanner(System.in);

		double produto, parcelas, parcelaUnica, multa;
		
		System.out.print("Digite o valor do produto (em R$): ");
		produto = read.nextDouble();
		System.out.print("Digite em quantas parcelas deseja dividir esse valor: ");
		parcelas = read.nextDouble();
		
		parcelaUnica = produto / parcelas;
		multa = 0.02 * parcelaUnica;
		
		System.out.println("");
		System.out.println("Cada parcela custará: R$" + parcelaUnica + " e será cobrado um adicional de: R$" + multa + " por cada parcela atrasada");
		
	}

}
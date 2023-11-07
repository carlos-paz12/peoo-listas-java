package br.edu.ifrn.peoo.listas.lista02;

import java.util.Scanner;

public class Q07 {

	public static void main(String[] args) {

		Scanner read = new Scanner(System.in);

		System.out.print("Digite seu salário atual: ");
		double salario = read.nextDouble();
		System.out.print("\n");

		if (salario < 1500.0) {

			double reajuste = 0.15 * salario;
			double salarioReajustado = salario + reajuste;

			System.out.format("Seu novo salário será de: R$%.2f", salarioReajustado);

		}

		if (salario >= 1500.0 && salario < 1750.0) {

			double reajuste = 0.12 * salario;
			double salarioReajustado = salario + reajuste;

			System.out.format("Seu novo salário será de: R$%.2f", salarioReajustado);

		}

		if (salario >= 1750.0 && salario < 2000.0) {

			double reajuste = 0.1 * salario;
			double salarioReajustado = salario + reajuste;

			System.out.format("Seu novo salário será de: R$%.2f", salarioReajustado);

		}

		if (salario >= 2000.0 && salario < 3000.0) {

			double reajuste = 0.075 * salario;
			double salarioReajustado = salario + reajuste;

			System.out.format("Seu novo salário será de: R$%.2f", salarioReajustado);

		}

		if (salario >= 3000.0) {

			double reajuste = 0.05 * salario;
			double salarioReajustado = salario + reajuste;

			System.out.format("Seu novo salário será de: R$%.2f", salarioReajustado);

		}

	}

}
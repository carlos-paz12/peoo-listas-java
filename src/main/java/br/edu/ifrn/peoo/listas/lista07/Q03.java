package br.edu.ifrn.peoo.listas.lista07;

import java.util.Scanner;

public class Q03 {

	static double perimetro(double r) {

		double PI = 3.14;

		double perimetroCirculo = 2 * PI * r;

		return perimetroCirculo;

	}

	public static void main(String[] args) {

		Scanner read = new Scanner(System.in);

		System.out.print("Digite o valor do raio do círculo (em metros): ");
		double raio = read.nextDouble();

		System.out.printf("\nO perimetro do círculo é de %.2fm", perimetro(raio));
		read.close();

		double area = Math.pow(2, raio);

		System.out.printf("\nA área do círculo é de %.2fm", perimetro(area));

	}

}
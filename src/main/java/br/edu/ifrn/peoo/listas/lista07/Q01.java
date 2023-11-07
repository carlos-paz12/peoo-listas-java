package br.edu.ifrn.peoo.listas.lista07;

public class Q01 {

	static int soma(int a, int b) {
		return a + b;
	}

	static int subtracao(int a, int b) {
		return a - b;
	}

	static int multiplicacao(int a, int b) {
		return a * b;
	}

	static int divisao(int a, int b) {
		return a / b;
	}

	public static void main(String[] args) {

		System.out.println("A soma de a + b é igual a: " + soma(10, 10));
		System.out.println("A subtração de a - b é igual a: " + subtracao(10, 10));
		System.out.println("A multiplicação de a * b é igual a: " + multiplicacao(10, 10));
		System.out.println("A divisão de a / b é igual a: " + divisao(10, 10));

	}
}
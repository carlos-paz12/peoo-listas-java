package br.edu.ifrn.peoo.listas.lista03;

public class Q09 {

	public static void main(String[] args) {

		int soma = 0, elementos = 0, media = 0;

		for (int i = 12; i <= 273; i += 2) {

			soma += i;
			elementos++;
			media = soma / elementos;

		}

		System.out.print("A média aritmética dos valores pares entre 12 e 873 é: " + media);

	}

}

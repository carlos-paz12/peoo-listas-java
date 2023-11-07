package br.edu.ifrn.peoo.listas.lista06;

public class Q03 {

	public static void main(String[] args) {

		String s1 = "ABRACADRABA";
		char[] vetor = s1.toCharArray();

		for (int i = vetor.length - 1; i >= 0; i--) {

			System.out.print(vetor[i]);

		}

	}

}
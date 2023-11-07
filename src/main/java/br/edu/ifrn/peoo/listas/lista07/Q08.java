package br.edu.ifrn.peoo.listas.lista07;

public class Q08 {

	static void inverterArray(String[] array) {

		System.out.println("Array na ordem inversa:\n");

		for (int i = array.length - 1; i >= 0; i--) {

			System.out.printf("%s ", array[i]);

		}

	}

	public static void main(String[] args) {

		String[] array = { "Palmeiras", "não", "tem", "mundial" };

		inverterArray(array);

	}

}
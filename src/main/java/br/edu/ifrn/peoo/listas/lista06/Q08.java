package br.edu.ifrn.peoo.listas.lista06;

public class Q08 {

	public static void main(String[] args) {

		String frase = "Aprender JAVA é muito bom!";
		String v[] = new String[5];
		String[] s = frase.split(" ");

		v = s;

		for (int i = 0; i < v.length; i++) {

			System.out.println("Vetor [" + i + "]: " + v[i]);

		}

	}

}

package br.edu.ifrn.peoo.listas.lista06;

public class Q10 {

	public static void main(String[] args) {

		String frase = "Aprender JAVA é muito bom!";
		String v[] = new String[5];
		String[] s = frase.split(" ");
		StringBuilder text = new StringBuilder();

		v = s;

		for (int i = 0; i < v.length; i++) {

			System.out.println("Vetor " + i + ": " + v[i]); // Imprime na tela o elemento de cada posição do vetor

			text.append(v[i].concat(" ")); // Concatena à StringBuilder text cada elemento do vetor

		}

		System.out.print("\nFrase: " + text.toString());

	}

}

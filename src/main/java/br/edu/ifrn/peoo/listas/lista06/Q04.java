package br.edu.ifrn.peoo.listas.lista06;

public class Q04 {

	public static void main(String[] args) {

		String texto1 = "ANA";
		String texto2 = "Ana";

		boolean igual = texto1.equalsIgnoreCase(texto2);
		// Se utilizarmos texto1.equals(texto2); o programa ira retornar que as Strings
		// não são iguais.

		System.out.println("O texto1 é igual ao texto2? " + igual);

	}

}

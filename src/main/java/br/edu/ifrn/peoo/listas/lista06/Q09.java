package br.edu.ifrn.peoo.listas.lista06;

public class Q09 {

	public static void main(String[] args) {

		StringBuilder text = new StringBuilder("Há 72 alunos nas turmas de \"coloque aqui\" do 2° ano de Informática.");
		String string = "PEOO";
		int start = text.indexOf("c"), end = text.indexOf("i") + 1;

		System.out.printf("String antes: %s\n\n", text);

		text.replace(start, end, string);

		System.out.printf("String depois: %s", text.toString());

	}

}

package br.edu.ifrn.peoo.listas.lista03;

import java.util.Random;

public class Q14 {

	public static void main(String[] args) {

		Random gerar = new Random();

		for (int i = 0; i < 20; i++) {

			if (gerar.nextInt(3000) % 11 == 5) {

				System.out.println(gerar.nextInt(3000));

			}

		}

	}

}

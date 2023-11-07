package br.edu.ifrn.peoo.listas.lista03;

import java.util.Random;
import java.util.Scanner;

public class Q15 {

	public static void main(String[] args) {

		Scanner read = new Scanner(System.in);
		Random gerar = new Random();
		int num;
		int sorteado = gerar.nextInt(1000);

		System.out.print("OBS: Digite -1 a qualquer momento para desistir do jogo.\n\n");

		int i = -2;

		while (i == -2) {

			System.out.print("Adivinhe o número entre 0 e 1000: ");
			num = read.nextInt();

			if (num == -1) {

				System.out.print("VOCê DESISTIU! O NÚMERO SORTEADO ERA: " + sorteado);
				i = -1;

			} else if (num > sorteado) {

				System.out.print("O número que você escolheu é maior que o número sorteado.\n\n");

			} else if (num < sorteado) {

				System.out.print("O número que você escolheu é maior que o número sorteado.\n\n");

			} else {

				System.out.print("Você acertou o número!");

				i = sorteado;

			}

		}

	}

}

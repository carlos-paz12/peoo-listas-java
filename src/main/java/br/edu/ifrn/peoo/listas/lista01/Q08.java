package br.edu.ifrn.peoo.listas.lista01;

import java.util.Scanner;

public class Q08 {

	public static void main(String[] args) {
		
		Scanner read = new Scanner(System.in);
		
		double celsius, fahrenheit;
		
		System.out.print("Digite o valor da temperatura em graus celsius (°C): ");
		celsius = read.nextDouble();
		
		fahrenheit = (9 * celsius + 160) / 5;
		
		System.out.println("");
		System.out.println("O valor da temperatura fornecida convertida em graus fahrenheit é: " + fahrenheit + "°F");

	}

}
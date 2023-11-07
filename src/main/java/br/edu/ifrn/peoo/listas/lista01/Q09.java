package br.edu.ifrn.peoo.listas.lista01;

import java.util.Scanner;

public class Q09 {

	public static void main(String[] args) {
		
		Scanner read = new Scanner(System.in);
		
		double celsius, fahrenheit;
		
		System.out.print("Digite o valor da temperatura em graus fahrenheit (°F): ");
		fahrenheit = read.nextDouble();
		
		celsius = (fahrenheit - 32) * 5 / 9;
		
		System.out.println("");
		System.out.println("O valor da temperatura fornecida convertida em graus celsius é: " + celsius + "°C");
		
	}

}
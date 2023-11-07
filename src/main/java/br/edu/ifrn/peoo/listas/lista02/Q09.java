package br.edu.ifrn.peoo.listas.lista02;

import java.util.Scanner;

public class Q09 {

	public static void main(String[] args) {

		Scanner read = new Scanner(System.in);
		double veloPermitida, veloMotorista, veloUltrapassada;

		System.out.print("Informe a velocidade máxima permitida pela rodovia (em km/h): ");
		veloPermitida = read.nextDouble();
		System.out.print("Informe em que velocidade o condutor estava dirigindo (em km/h): ");
		veloMotorista = read.nextDouble();
		System.out.print("\n");

		veloUltrapassada = veloMotorista - veloPermitida;

		if (veloUltrapassada >= 1.0 && veloUltrapassada <= 10.0) {

			System.out.format("O condutor do veículo estava a uma velocidade de %.0fkm/h acima do permitido pela"
					+ " rodovia, o será aplicada uma multa de R$50,00.", veloUltrapassada);

		} else if (veloUltrapassada >= 11.0 && veloUltrapassada <= 30.0) {

			System.out.format("O condutor do veículo estava a uma velocidade de %.0fkm/h acima do permitido pela"
					+ " rodovia, o será aplicada uma multa de R$100,00.", veloUltrapassada);

		} else if (veloUltrapassada >= 31.0) {

			System.out.format("O condutor do veículo estava a uma velocidade de %.0fkm/h acima do permitido pela"
					+ " rodovia, o será aplicada uma multa de R$200,00.", veloUltrapassada);

		}

		if (veloUltrapassada <= 0.0) {

			System.out.println("O condutor do veículo estava dentro da velocidade m�xima permitida pela rodovia.");

		}

	}

}
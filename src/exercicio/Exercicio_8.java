package exercicio;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio_8 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double salario, totalImposto = 0.0;

		salario = sc.nextDouble();

		if (salario <= 2000.0) {
			totalImposto = 0.0;
		} else if (salario <= 3000.0) {
			totalImposto = (salario - 2000.0) * 0.8;
		} else if (salario <= 4500.0) {
			totalImposto = (salario - 3000.0) * 0.18 + 1000.0 * 0.08;
		} else {
			totalImposto = (salario - 4500.0) * 0.28 + 1500.0 * 0.18 + 1000.0 * 0.08;
		}
		
		if (totalImposto == 0) {
			System.out.println("Isento");
		} else {
			System.out.printf("R$ %.2f\n", totalImposto);
		}

		sc.close();

	}

}

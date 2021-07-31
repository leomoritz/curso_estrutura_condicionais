package exercicio;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio_7 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double x, y;

		x = sc.nextDouble();
		y = sc.nextDouble();
		
		// Como eu fiz:
		if (x == 0.0 && y == 0) {
			System.out.println("Origem");
		} else if (x == 0.0) {
			System.out.println("Eixo X");
		} else if (y == 0.0) {
			System.out.println("Eixo Y");
		} else if (x > 0.0) {
			if (y > 0.0) {
				System.out.println("Q1");
			} else {
				System.out.println("Q4");
			}
		} else { // Se x não for igual ou não for maior que 0 e y for diferente de 0, então...
			if (y > 0.0) {
				System.out.println("Q2");
			} else {
				System.out.println("Q3");
			}
		}

		/*
		 * Como professor fez if (x == 0.0 && y == 0.0) { System.out.println("Origem");
		 * } else if (x == 0.0) { System.out.println("Eixo Y"); } else if (y == 0.0) {
		 * System.out.println("Eixo X"); } else if (x > 0.0 && y > 0.0) {
		 * System.out.println("Q1"); } else if (x < 0.0 && y > 0.0) {
		 * System.out.println("Q2"); } else if (x < 0.0 && y < 0.0) {
		 * System.out.println("Q3"); } else { System.out.println("Q4"); }
		 */

		sc.close();

	}

}

package exercicio;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio_6 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);

		double intervalo = sc.nextDouble();
		/*
		 * if (intervalo >= 0 && intervalo <= 25) {
		 * System.out.println("Intervalo [0,25]"); } else if (intervalo >= 25.01 &&
		 * intervalo <= 50) { System.out.println("Intervalo [25,50]"); } else if
		 * (intervalo >= 50.01 && intervalo <= 75) {
		 * System.out.println("Intervalo [50,75]"); } else if (intervalo >= 75.01 &&
		 * intervalo <= 100) { System.out.println("Intervalo [75,100]"); } else {
		 * System.out.println("Fora de intervalo"); }
		 */

		if (intervalo < 0.0 || intervalo > 100.0) {
			System.out.println("Fora de intervalo");
		} else if (intervalo <= 25.0) {
			System.out.println("Intervalo [0,25]");
		} else if (intervalo <= 50.0) {
			System.out.println("Intervalo [25,50]");
		} else if (intervalo <= 75) {
			System.out.println("Intervalo [50,75]");
		} else {
			System.out.println("Intervalo [75,100]");
		}

		sc.close();

	}

}

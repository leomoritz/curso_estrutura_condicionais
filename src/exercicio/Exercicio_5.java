package exercicio;

import java.util.Scanner;

public class Exercicio_5 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int item, qtdItem = 0;
		double precoItem, precoFinal = 0;

		item = sc.nextInt();
		if (item >= 1 && item <= 5) {
			qtdItem = sc.nextInt();
		} else {
			System.out.println("Código de Item inexistente");
		}

		if (item == 1) {
			precoItem = 4.00;
			precoFinal = precoItem * qtdItem;

		} else if (item == 2) {
			precoItem = 4.50;
			precoFinal = precoItem * qtdItem;
		} else if (item == 3) {
			precoItem = 5.00;
			precoFinal = precoItem * qtdItem;
		} else if (item == 4) {
			precoItem = 2.00;
			precoFinal = precoItem * qtdItem;
		} else if (item == 5) {
			precoItem = 1.50;
			precoFinal = precoItem * qtdItem;
		}

		if (precoFinal > 0 && qtdItem > 0) {
			System.out.printf("Total: R$ %.2f\n", precoFinal);
		} else {
			System.out.println("Nenhum item foi selecionado.");
		}

		sc.close();

	}

}

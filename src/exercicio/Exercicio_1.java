package exercicio;

import java.util.Scanner;

public class Exercicio_1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		
		if (num >= 0) {
			System.out.println("POSITIVO");
		}else {
			System.out.println("NEGATIVO");
		}
		
		sc.close();

	}

}

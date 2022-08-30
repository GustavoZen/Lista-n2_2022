package lista_02;

import java.util.Scanner;

public class Questão_10 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Informe o teto dos pares da esquerda e direita: ");
		int num = entrada.nextInt();
		for (int i = 0; i <= 3; i++) {
			for (int j = 0; j <= num; j++) {
				System.out.println(i + " - " + j);
			}
		}
		entrada.close();
	}
}

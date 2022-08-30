package lista_02;

import java.util.Scanner;

public class Questão_12 {
	public static void main(String[] args) {
		int i, j;
		Scanner entrada = new Scanner(System.in);
		System.out.println("Escolha o item que quer verificar: ");
		char R = entrada.next().charAt(0);
		System.out.println("Informe o número de colunas e linhas: ");
		int colinha = entrada.nextInt();
		switch (R) {
		case 'a':
			for (i = 0; i < colinha; i++) {
				for (j = colinha - i; j <= colinha; j++) {
					System.out.print("*");
				}
				System.out.println();
			}
		case 'b':
			for (i = 0; i < colinha; i++) {
				for (j = 0; j < colinha; j++) {
					if (j == i || j + i == colinha - 1) {
						System.out.print("#");
					} else
						System.out.print("*");
				}
				System.out.println();
			}
		case 'c':
			for (i = 0; i < colinha; i++) {
				for (j = 0; j < colinha; j++) {
					if (i % 2 == 0) {
						System.out.print("#");
					} else
						System.out.print("*");
				}
				System.out.println();
			}
		case 'd':
			for (i = 0; i < colinha; i++) {
				for (j = 0; j < colinha; j++) {
					if (i == 0 || i == colinha-1 || j == 0 || j == colinha-1) {
						System.out.print("#");
					} else
						System.out.print("*");
				}
				System.out.println();
			}
		case 'e':
			for (i = 0; i < colinha; i++) {
				for (j = 0; j < colinha; j++) {
					if(i>=colinha/2) {
						if(j%2==0) {
							System.out.print("#");
						}else
							System.out.print("$");
					}else
						System.out.print("*");
				}
				System.out.println();
			}
		}
		entrada.close();
	}
}

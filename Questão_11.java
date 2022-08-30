package lista_02;

public class Questão_11 {

	public static void main(String[] args) {
		int aux = 0;
		for (int i = 0; i <= 3; i++) {
			for (int j = 0; j < 5; j++) {
				aux = j % 2;
				if (j == 4) {
					System.out.println(i + " - " + 2);
				} else
				System.out.println(i + " - " + aux);
			}
		}
	}

}

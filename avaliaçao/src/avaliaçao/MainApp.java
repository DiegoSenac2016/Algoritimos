package avaliaçao;

import java.util.Scanner;

public class MainApp {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int valor2 = 0;
		int[][] a = new int[5][5];
		a[1][1] = 41;
		a[1][2] = 14;
		a[1][3] = 60;
		a[1][4] = 30;
		for (int i = 0; i < 3; i++) {
			System.out.println("digite o numero da matriz ma posiçao ;[1][3]");
			int valor = s.nextInt();
			valor2 = valor;
			if (valor == a[1][3]) {
				System.out.println("voce acertou");
				i = 4;
			}

		}
		if (valor2 != a[1][3]) {
			System.out.println("voce perdeu seu merda");
		}
		System.out.println("fim de jogo");
		s.close();
	}

}
